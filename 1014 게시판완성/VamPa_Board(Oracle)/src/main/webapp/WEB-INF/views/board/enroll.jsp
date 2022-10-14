<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>enroll.jsp</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
  
<style type="text/css">
	.input_wrap{
		padding: 5px 20px;
	}
	label{
	    display: block;
	    margin: 10px 0;
	    font-size: 20px;	
	}
	input{
		padding: 5px;
	    font-size: 17px;
	}
	textarea{
		width: 800px;
	    height: 200px;
	    font-size: 15px;
	    padding: 10px;
	}
	.btn{
	  	display: inline-block;
	    font-size: 22px;
	    padding: 6px 12px;
	    border: 3px solid #ddd;
	    font-weight: 600;
	    width: 140px;
	    height: 51px;
	    line-height: 39px;
	    text-align : center;
	    margin-left : 30px;
	    cursor : pointer;
	    background-color:skyblue;
	}
	.btn_wrap{
		padding-left : 80px;
		margin-top : 50px;
		
	}
	.top_btn{
		font-size: 20px;
		padding: 6px 12px;
	 	background-color: #fff;
	  	border: 3px solid #ddd;
	  	font-weight: 500;
	}
	 a:link {color:black; text-decoration: none;}
	 a:visited {color:black; text-decoration: none;}
	 a:hover {color:black; text-decoration: underline;}
</style>
</head>

<body>
	<h1>게시판 등록</h1>
	<div class="input_wrap">
       <a href="/board/list"class="top_btn">목록 페이지</a>
    </div>
	
	<form action="/board/enroll" method="post">
    <div class="input_wrap">
        <label>게시판 제목</label>
        <input name="title">
    </div>
    <div class="input_wrap">
        <label>게시판 내용</label>
        <textarea rows="3" name="content"></textarea>
    </div>
    <div class="input_wrap">
        <label>게시판 작성자</label>
        <input name="writer">
    </div>
    <div class="btn_wrap">
    	<button class="btn">등록</button><!-- 	왜 a테그를 넣으면 안될까? --> 
    	<!-- <button class="btn" id="list_btn" >목록 페이지</button> --> 
    </div>
   
	<!-- 스크립을 사용하려면 제이쿼리를 호출해야지~ --> 
    
    
</form>
</body>
</html>