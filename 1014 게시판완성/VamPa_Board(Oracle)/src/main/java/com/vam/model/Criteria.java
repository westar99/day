package com.vam.model;

import lombok.Data;

@Data
public class Criteria {

	 /* 현재 페이지 */
    private int pageNum;
    
    /* 한 페이지 당 보여질 게시물 갯수 */
    private int amount;
    
    /* 검색 키워드 */
    private String keyword;
    
    /* 검색 타입 */
    private String type;
    
    /* 검색 타입 배열 */
    private String[] typeArr;
    
    /* 기본 생성자 -> 기본 세팅 : pageNum = 1, amount = 10 */
    public Criteria() {
        this(1,10);
        //this는 class Criteria를 의미하며 public Criteria->this(int pageNum->1, int amount->10)
    }
    
    /* 생성자 => 원하는 pageNum, 원하는 amount */
    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }

	/*
	 * 셋타입 함수를 오버라이딩해줘야 하는일이 발생하여 직접입력
	 */    
    public void setType(String type) {
    	this.type = type;
    	this.typeArr=type.split("");
    }
    
}
