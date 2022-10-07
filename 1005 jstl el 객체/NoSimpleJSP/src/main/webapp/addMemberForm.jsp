<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
<h2>회원가입 폼</h2>
<form action="addMember.jsp" method="post">
	<table>
		<tr>
			<td>아이디 </td>
			<td><input type="text" name="id"> </td>	
		</tr>
		<tr>
			<td>비밀번호 </td>
			<td><input type="password" name="pwd"> </td>	
		</tr>
		<tr>
			<td>이름 </td>
			<td><input type="text" name="name"> </td>	
		</tr>
		<tr>
			<td>별명 </td>
			<td><input type="text" name="nickname"> </td>	
		</tr>
		<tr>
			<td>이메일 </td>
			<td><input type="text" name="email"> </td>	
		</tr>
		<tr>
			<td>폰번호 </td>
			<td><input type="text" name="phone"> </td>	
		</tr>
		<tr>
			<td><input type="submit" name="전송"></td>
			<td><input type="reset" name="취소"> </td>	
		</tr>
	
	</table>


</form>


</body>
</html>