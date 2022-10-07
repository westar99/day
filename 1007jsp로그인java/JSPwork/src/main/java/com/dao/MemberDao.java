package com.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.bean.MemberBean;
import com.db.MyOracle;


//DB의 member테이블을 조작해주는 클래스
public class MemberDao {
  
// insert 메소드->joinAction.jsp에서 사용
  	public void insertMember(MemberBean memberBean) throws Exception {
	// JDBC 참조변수
  		Connection con = null;
  		PreparedStatement pstmt = null;
  		try {
		// 1. 드라이버 로딩  2. DB연결
		con = MyOracle.getConnection();
		// 3. insert
		String sql = "insert into member (name, userid, pwd, email, phone) values (?,?,?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, memberBean.getName());
		pstmt.setString(2, memberBean.getUserid());
		pstmt.setString(3, memberBean.getPwd());
		pstmt.setString(4, memberBean.getEmail());
		pstmt.setString(5, memberBean.getPhone());
		// 실행
		
		pstmt.executeUpdate();	
  		} catch (Exception e) {
		e.printStackTrace();
  		} finally {
		// JDBC 자원닫기
		MyOracle.closeJDBC(con, pstmt, null);
  		} // finally
  	} // insertMember()의 끝

  	
  	
  	
// 사용자 로그인 체크하는 메소드. userid, pwd값 가짐
  	public int userCheck (MemberBean memberBean) throws Exception {
	// JDBC 참조변수
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int check = -1;  // 부정적인 값을 기본값으로 둠.
	
	try {
		con = MyOracle.getConnection();
		// 3. id에 해당하는 passwd 가져오기
		String sql = "SELECT pwd FROM member WHERE userid=?";
		System.out.println("쿼리에 넣을 아이디 : "+memberBean.getUserid()); 
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, memberBean.getUserid());
		System.out.println("쿼리실행직전2. pstmt : "+pstmt);
		// 4. 실행  rs에 저장
		rs = pstmt.executeQuery();
		System.out.println("쿼리실행직후2. rs : "+rs);
		// 5.
		//   rs에 데이터(행)가 있으면 아이디있음
		//       패스워드비교 맞으면 로그인인증(세션값생성 "id")
		//       패스워드비교 틀리면 "패스워드틀림" 로그인페이지로 이동
		//   rs에 데이터(행)가 없으면 "아이디없음" 로그인페이지로 이동

		if (rs.next()) {
			// 아이디있음
			System.out.println("화면에서 받은 아이디 : "+memberBean.getPwd());
			System.out.println("디비에 있는 아이디 : "+rs.getString("PWD"));
			if (memberBean.getPwd().equals(rs.getString("PWD"))) {
				check = 1; // 아이디, 패스워드 일치
			} else {
				check = 0;  // 패스워드가 불일치.
			}
		} else {
			check = -1;  // 아이디 불일치.
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		MyOracle.closeJDBC(con, pstmt, rs);
	}
	return check;
  	} // userCheck()
  	
 // 전체회원목록 가져오기

 	public List<MemberBean> getMembers() {
 		Connection con = null;
 		PreparedStatement pstmt = null;
 		ResultSet rs = null;
		List<MemberBean> list = new ArrayList<>();
		try {
 			con = MyOracle.getConnection();
 			// 3. sql 전체회원 가져오기
 			String sql = "select * from member";
 			pstmt = con.prepareStatement(sql);
 			// 4. rs 저장
 			rs = pstmt.executeQuery();
 			// rs 데이터 있으면 자바빈 객체생성
 			// rs => 자바빈 멤버변수 저장
 			// 자바빈 => 리스트 한칸 추가
 			while (rs.next()) {
 				MemberBean memberBean = new MemberBean();
 				memberBean.setName(rs.getString("name"));
 				memberBean.setUserid(rs.getString("userid"));
 				memberBean.setPwd(rs.getString("pwd"));
 				memberBean.setEmail(rs.getString("email"));
 				memberBean.setPhone(rs.getString("phone"));
 				list.add(memberBean);  // 배열리스트에 추가
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		} finally {
 			MyOracle.closeJDBC(con, pstmt, rs);
 		}
 		return list;
 	} // getMembers()

 	// 회원 한사람의 정보 가져오기
 	public MemberBean getMember(String userid) {
 		// JDBC 변수
 		Connection con = null;
 		PreparedStatement pstmt = null;
 		ResultSet rs = null;
 		MemberBean memberBean = null;
 		try {
 			con = MyOracle.getConnection();
 			// 3. sql  id에 해당하는 모든정보 가져오기
 			String sql = "SELECT * FROM member WHERE userid=?";
 			pstmt = con.prepareStatement(sql);
 			pstmt.setString(1, userid);
 			// 4. rs 실행 저장
 			rs = pstmt.executeQuery();
 			// 5. rs => 자바빈에 저장
 			if (rs.next()) {
 				memberBean = new MemberBean();
 				memberBean.setName(rs.getString("name"));
 				memberBean.setUserid(rs.getString("userid"));
 				memberBean.setPwd(rs.getString("pwd"));
 				memberBean.setEmail(rs.getString("email"));
 				memberBean.setPhone(rs.getString("phone"));
 			 }
 		} catch (Exception e) {
 			e.printStackTrace();
 		} finally {
 			MyOracle.closeJDBC(con, pstmt, rs);
 		}
 		return memberBean;
 	} // getMember() 의 끝

 	

 	public int updateMember(MemberBean memberBean) {
 		Connection con = null;
 		PreparedStatement pstmt = null;
 		ResultSet rs = null;
 		int check = 0;  // 실패값으로 초기화
 		try {
 			con = MyOracle.getConnection();
 			// 3. id에 해당하는 passwd 가져오기
 			String sql = "SELECT passwd FROM member WHERE userid=?";
 			pstmt = con.prepareStatement(sql);
 			pstmt.setString(1, memberBean.getUserid());
 			// 4. 실행 rs 저장
 			rs = pstmt.executeQuery();
 			// 5. rs 데이터 있으면 아이디 있음
 			//        패스워드 비교 맞으면  update  check = 1
 			//                   틀리면          check = 0
 			if (rs.next()) {
 				if (memberBean.getPwd().equals(rs.getString("pwd"))) {
 					pstmt.close(); // select용 문장객체 닫기
 					pstmt = null;
 					sql = "UPDATE member SET name=?, userid=?, pwd=?, email=?, phone=?";
 					pstmt = con.prepareStatement(sql);
 					pstmt.setString(1, memberBean.getName());
 					pstmt.setString(2, memberBean.getUserid());
 					pstmt.setString(3, memberBean.getPwd());
 					pstmt.setString(4, memberBean.getEmail());
 					pstmt.setString(5, memberBean.getPhone());
 										
 					// 실행
					pstmt.executeUpdate();
					check = 1;
 				} else {
 					check = 0;
 				}
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		} finally {
 			MyOracle.closeJDBC(con, pstmt, rs);
 		}
 		return check;
 	} // updateMember()
}
