package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MyOracle {
	// 드라이버 클래스 이름
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	// DB 연결정보
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static final String USER = "ora_user";
	public static final String PWD = "evan";

	
	
	// DB연결 메소드
	public static Connection getConnection() throws Exception {
			Connection con = null;
		// DB 연결정보
			final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
			final String USER = "ora_user";
			final String PWD = "evan";
			
			// 1 드라이버 로딩
			Class.forName(DRIVER_NAME);
			// 2 DB연결
			con = DriverManager.getConnection(URL, USER, PWD);
			return con;
	} // getConnection()의 끝

	
	
	public static void closeJDBC(Connection con, 
				PreparedStatement pstmt, ResultSet rs) {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // closeJDBC()의 끝
}

