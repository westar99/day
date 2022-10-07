<%@ page import="kr.co.human.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Member member = new Member();
	member.setEmail("ggoomter@gmail.com");
	out.println(member.getEmail());
%>

</body>
</html>