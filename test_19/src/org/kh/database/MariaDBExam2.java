package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.test.Student;

public class MariaDBExam2 {

	public static void main(String[] args) {
		
		Connection con = null;	
		PreparedStatement pstmt = null;   
		
		
		String driver = "org.mariadb.jdbc.Driver";
		
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234"; 
		
		int i = 0;
		
		Student newSt =  new Student(6, "Kim", 90);
		String sql = "insert into student values (?, ?, ?)";
		
		//MariaDB의 temp데이터베이스의 student 테이블의 newSt의 내용을 레코드로 추가되도록 자바 프로그래밍을 완성하시오
		
		
		try {
			Class.forName(driver); 
			
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, newSt.getNo());
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				
				i = pstmt.executeUpdate(); 
				
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
