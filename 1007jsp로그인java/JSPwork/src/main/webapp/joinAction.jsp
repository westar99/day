<%@page import="com.dao.MemberDao"%>
<%@page import="com.db.MyOracle"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="memberBean" class="com.bean.MemberBean" />
<jsp:setProperty name="memberBean" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입성공</title>
</head>
<body>
<%
	// DB작업 객체생성 MemberDao
	out.print("DB작업 객체생성");
	MemberDao memberDao = new MemberDao();
	// 메소드 호출
	out.print("메소드호출");
	memberDao.insertMember(memberBean);
%>

<script>
	alert('회원가입 성공');
	location.href = 'loginForm.jsp';
</script>
</body>
</html>