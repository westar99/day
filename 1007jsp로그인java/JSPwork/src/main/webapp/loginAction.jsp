<%@page import="com.dao.MemberDao"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.db.MyOracle"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="memberBean" class="com.bean.MemberBean" />
<jsp:setProperty property="*" name="memberBean" />    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인체크</title>
</head>
<body>

	<%
	System.out.println("loginAction에서 받은 id : "+memberBean.getUserid());
	
	
	// DB 객체 생성
	MemberDao memberDao = new MemberDao();
	int check = memberDao.userCheck(memberBean);
	// check == 1	로그인인증   main.jsp로 이동 
	// check == 0	"패스워드 틀림"  뒤로 이동
	// check == -1	"아이디 없음"  뒤로 이동
	System.out.println("로그인엑션 if 전");
	if (check == 1) {
		System.out.println("if문안 check는 1");
		session.setAttribute("userid", memberBean.getUserid());
		System.out.println("로그인엑션 if 후");	
		response.sendRedirect("main.jsp");
	}else if (check == 0) {
		System.out.println("else if안 check는 0");
	%>
		<script>
			alert('패스워드 틀림');
			history.back();
		</script>		
	<%		
	} else {	// 아이디없음  뒤로이동
	%>
		<script>
			alert('아이디 없음');
			history.back();
		</script>
	<%		
	}
	%>
</body>
</html>