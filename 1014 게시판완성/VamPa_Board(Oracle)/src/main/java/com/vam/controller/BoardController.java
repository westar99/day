package com.vam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vam.model.BoardVO;
import com.vam.model.Criteria;
import com.vam.model.PageMakerDTO;
import com.vam.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
    @Autowired
    private BoardService bservice;
	
	/*
	 * //게시판 목록 페이지 접속
	 * @GetMapping("/list") // => @RequestMapping(value="list", method=RequestMethod.GET) 
	 * public void boardListGET(Model model) { //컨트롤러에서
	 * 리턴타입이 void면 요청 스트링을 똑같이 리턴한다. //즉 현재는 "/WEB-INF/views/"home".jsp"을 반환하는 것이다.
	 * //String이면 리턴을 별도로 지정할 수 있다.
	 * System.out.println("유저가/board/list 요청함");
	 * log.info("게시판 목록 페이지 진입");
	 * model.addAttribute("list", bservice.getList()); }
	 */
    
    /* 게시판 목록 페이지 접속(페이징 적용) */
    @GetMapping("/list")
    public void boardListGET(Model model, Criteria cri) {
        
        log.info("boardListGET");
        model.addAttribute("list", bservice.getListPaging(cri));
        //페이징처리
        int total = bservice.getTotal(cri);
        PageMakerDTO pageMake = new PageMakerDTO(cri, total);
        model.addAttribute("pageMaker", pageMake);
    } 

    /* 게시판 등록 페이지 접속*/
    @GetMapping("/enroll")
    // => @RequestMapping(value="enroll", method=RequestMethod.GET)
    public void boardEnrollGET() {
        log.info("게시판 등록 페이지 진입");
        //리턴타입이 "void"면 WEB-INF/views/board/enroll.jsp화면을 보여줌
    }
	
    /* 게시판 등록 기능 */
    @PostMapping("/enroll")
    public String boardEnrollPOST(BoardVO board,RedirectAttributes rttr) {
        log.info("BoardVO : " + board);
        try {
			bservice.enroll(board);
		} catch (Exception e) {
			rttr.addFlashAttribute("result", "enroll fail");
			e.printStackTrace();
			return "redirect:/board/list";
		}
        //리턴타입이 "void"면 http://localhost:8080/board/enroll.jsp 로 리턴
        rttr.addFlashAttribute("result", "enroll success");
        //등록성공 경고창 구현.
        return "redirect:/board/list";
        //리스트로 가는게 좋으니"void->String"으로 바꿔주고 위내용을 적어줌
    }
    
    /* 게시판 상세 조회 화면 이동*/
    @GetMapping("/get")
    public void boardGetPageGET(int bno, Model model,Criteria cri) {
        model.addAttribute("pageInfo", bservice.getPage(bno));
        model.addAttribute("cri",cri);//원래 페이지로 돌아가게 변수를 줌
    }
    /* 게시판 수정 페이지 이동 */
    @GetMapping("/modify")
    public void boardModifyGET(int bno, Model model,Criteria cri) {
    	//글수정 화면을 보이기 위해 필요한 정보는?
    	//백단에서 알수있는 정보와 프론트단에서 넘어와야할 정보
    	//설계자<-화면에 어떤 정보가 보이길 원하나요.화면에 안보여도 DB에 수정해야할 정보가 뭔가요?
    	//pk하나(글번호)만 알면 db의 모든 정보 조회가능.
        model.addAttribute("pageInfo", bservice.getPage(bno));
        model.addAttribute("cri",cri);
    }
    /* 페이지 수정 기능 */
    @PostMapping("/modify")
    public String boardModifyPOST(BoardVO board, RedirectAttributes rttr) {
        //화면에서 넘어온 name들을 board로 getter로 담아옴.
        bservice.modify(board);
        rttr.addFlashAttribute("result", "modify success");
        return "redirect:/board/list";
        
    }
    /* 페이지 삭제 */
    @PostMapping("/delete")
    public String boardDeletePOST(int bno, RedirectAttributes rttr) {
        
        bservice.delete(bno);
        rttr.addFlashAttribute("result", "delete success");
        return "redirect:/board/list";
    }
   
}
