package org.kh.test;
//insert실습
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam2 {

	public static void main(String[] args) {
		Connection con = null;		//db연결한것 
		PreparedStatement pstmt = null;   //상태 변경하고 sql문장을 실행할 때 씀
		
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "insert into student values(?,?,?)";
//		Student st = new Student(6, "조대신", 90);  이미 한번 실행했으니까 데이터 들어갔으므로 주석처리
		Student st = new Student(9, "강대신", 80);
		int i = 0;
		
		try {
			Class.forName(driver);  //드라이버 로딩
			
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql); //전원 on
				pstmt.setInt(1, st.getNo());		//쿼리 옵션 추가
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getPoint());
				i = pstmt.executeUpdate(); 		//update, delete, insert들은 commit이 필요하기 때문에 executeUpdate를 써야한다!!
				if (i>0) {
					System.out.println(i + "건이 성공적으로 처리 되었습니다.");
				} else {
					System.out.println("SQL구문 실패");
				}
				
			} catch(SQLException e){
				System.out.println("실패");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				
				try {
					pstmt.close();  //system의 외부 자원을 닫는다
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				
				try {
					con.close();  //system의 외부 자원을 닫는다
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
