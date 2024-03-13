package org.kh.test;
//update 실습
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam3 {

	public static void main(String[] args) {
		Connection con = null;		//db연결한것 
		PreparedStatement pstmt = null;   //상태 변경하고 sql문장을 실행할 때 씀
		
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "update student set point=?, name=?, where=? no=?";
//		Student st = new Student(6, "조대신", 90);  이미 한번 실행했으니까 데이터 들어갔으므로 주석처리
		Student st = new Student(3, "유정환", 88);
		int i = 0;

		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getPoint());
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getNo());
				i = pstmt.executeUpdate();
				
				if (i>0) {
					System.out.println(i+"건이 정상처리");
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("로딩실패");
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