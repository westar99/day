<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class="kr.co.human.Member"></jsp:useBean>
<jsp:setProperty name="member" property="*" />
<%--
kr.co.human.Member member = new kr.co.human.Member();
member.setName(request.getParameter("name"));
member.setId(request.getParameter("id"));
member.setPwd(request.getParameter("pwd"));
member.setEmail(request.getParameter("email"));
member.setNickName(request.getParameter("nickName"));
member.setPhone(request.getParameter("phone"));
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>입력완료된 회원정보</h2>
	<table>
		<tr>
			<td>이름 </td>
			<td><jsp:getProperty  name="member" property="name"/></td>
			<td><jsp:getProperty  name="member" property="id"/></td>
		</tr>
	</table>
	
	
	
</body>
</html>