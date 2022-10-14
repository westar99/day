package com.vam.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BoardVO;
import com.vam.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {
 
    private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
	
     @Autowired
     private BoardMapper mapper;
 
     @Test
     public void testEnroll() {
         
         BoardVO vo = new BoardVO();
         
         vo.setTitle("mapper test");
         vo.setContent("mapper test");
         vo.setWriter("mapper test");
         
         mapper.enroll(vo);//인터페이스의 함수를 호출하면 해당 id의 쿼리가 호출됨
         
     }
     /* 게시판 목록 테스트 */
     @Test
     public void testGetList() {
        List list = mapper.getList();
               /* foreach문(향상된 for문) */
        for(Object a : list) {
             log.info("" + a);
        }
    }
             
     /* 게시판 조회 */
     @Test
     public void testGetPage() {
        /* 실제 존재하는 페이지 */
        int bno = 8;
        log.info("" + mapper.getPage(bno));
        
    }    
     /* 게시판 수정 */
     @Test
     public void testModify() {
         
         BoardVO board = new BoardVO();
         board.setBno(8);
         board.setTitle("수정 제목");
         board.setContent("수정 내용");
         
         int result = mapper.modify(board);
         //제대로 바뀌었으면 1개가 insert되었기에 1 반환 안바뀌었으면 0 반환
         log.info("result : " +result);
         
     }    
     /* 게시판 삭제 */
     @Test
     public void testDelete() {
         
         int result = mapper.delete(23);
         log.info("result : " + result);
         
     }              
     /* 게시판 목록(페이징 적용)테스트 */
     @Test
     public void testGetListPaging() {
         
         Criteria cri = new Criteria();
         cri.setPageNum(3);
         cri.setAmount(15);
         List list = mapper.getListPaging(cri);
         list.forEach(board -> log.info("" + board));
     }
 }
