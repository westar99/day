<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	1. JDBC드라이버 로드 (DriverManager)
	2. 데이터베이스와 연결 (Connection)
	3. SQL문 작성 (문자열 String)
	4. SQL문 실행 (Statement)
	5. 실행결과 받기 (ResultSet)
	6. 데이터베이스와 연결 끊기 (Connection   .close()) -->
	
	<%
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from MEMBER";
	
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//jdbc의 오라클thin모델 에서 내컴퓨터의 1521포트의 sid는 orcl
		String user = "ora_user";
		String password = "evan";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);	//1. db연결
			stmt = conn.createStatement();	//쿼리를 실행할 객체 준비
			rs = stmt.executeQuery(query);	//쿼리실행시키고 결과 받기
			while(rs.next()){
				out.println(rs.getString("name"));
				out.print("<br>");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();
			stmt.close();
			conn.close();
		}
		
		
		
				
	
	%>

</body>
</html>