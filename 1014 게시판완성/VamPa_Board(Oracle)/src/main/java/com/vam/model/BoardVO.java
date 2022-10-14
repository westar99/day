package com.vam.model;

import java.util.Date;

import lombok.Data;

//화면에서 발생한 정보와 DB를 연결해주는 것:데이터트랜시스:기준은 디비컬럼
//이름을 정의할때 vo보다 dto가 더 좋지 않았을까? vo->보기 dto->수정도 가능
@Data
public class BoardVO {

    /* 게시판 번호 */
    private int bno;
    
    /* 게시판 제목 */
    private String title;
    
    /* 게시판 내용 */
    private String content;
    
    /* 게시판 작가 */
    private String writer;
    
    /* 등록 날짜 */
    private Date regdate;//자바 sql의 데이터를 가져오기
    
    /* 수정 날짜 */
    private Date updateDate;
}
