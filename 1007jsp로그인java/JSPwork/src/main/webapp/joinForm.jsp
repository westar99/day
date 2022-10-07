<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	
	<!--입력내용은 id,pw,name,age,form 제출을 누르면 joinAction.jsp로 가도록 폼을 완성해보세요.
    -->
	<form action = "joinAction.jsp" method ="post">
	유저이름:<br><input type="text" name="name">
	<br>
	아 이 디:<br><input type="text" name="userid">
	<br>
	패스워드:<br><input type="password" name="pwd">
	<br>
	이 메 일:<br><input type="email" name="email">
	<br>
	연 락 처:<br><input type="text" name="phone">
	<input type="submit" value="회원가입">
	</form>
</body>
</html>