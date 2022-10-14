<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<title>Home</title>
	<style>
		.btn_wrap{
			padding-left : 80px;
			margin-top : 50px;
		}	
		.btn{
		  	display: inline-block;
		    font-size: 22px;
		    padding: 6px 12px;
		    background-color: gray;
		    border: 8px solid #ddd;
		    font-weight: 600;
		    width: 140px;
		    height: 41px;
		    line-height: 39px;
		    text-align : center;
		    margin-left : 30px;
		    cursor : pointer;
		}
		 
	</style>
</head>
<body>
<h1>
	시작페이지(home)  
</h1>
	
	
	<div class="btn_wrap">
		<a href="/board/list"class="btn" >게시판 가기</a>
		<a href="/board/enroll"class="btn">게시판 등록</a>
	</div>
	
<P>  The time on the server is ${serverTime}. </P>
	

</body>
</html>
