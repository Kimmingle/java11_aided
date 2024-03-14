package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.test.Student;

public class MariaDBExam3 {

	public static void main(String[] args) {
		Connection con = null;	
		PreparedStatement pstmt = null;   
		
		
		String driver = "org.mariadb.jdbc.Driver";
		
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234"; 
		
		int i = 0;
		
		Student newSt =  new Student(3, "park", 88);
		String sql = "update student set name =? , point =? where no=?"; //no가 primary 키라서 where 으로 찾는건가?
		
		
		//MariaDB의 temp데이터베이스의 student 테이블의 newSt의 내용을 레코드로 변경될 수 있도록 자바 프로그래밍을 완성하시오
		
		try {
			Class.forName(driver);
			
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql); //전원 on
				
				pstmt.setInt(1, newSt.getNo());		//쿼리 옵션 추가
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				
				i = pstmt.executeUpdate(); 		//update, delete, insert들은 commit이 필요하기 때문에 executeUpdate를 써야한다!!
				
				if (i>0) {
					System.out.println(i + "건이 성공적으로 처리 되었습니다.");
				} else {
					System.out.println("SQL구문 실패");
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if( pstmt != null ) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if( con != null ) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
