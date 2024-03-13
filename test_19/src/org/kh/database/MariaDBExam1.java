package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.test.Student;

public class MariaDBExam1 {

	public static void main(String[] args) {
		Connection con = null;		//db연결한것 
		PreparedStatement pstmt = null;   //상태 변경하고 sql문장을 실행할 때 씀
		ResultSet rs = null;
		
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";		//이 4줄만 달라진거임
		String sql = "select * from student";
		List <Student> stList = new ArrayList<>();
		
		
		
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					Student st = new Student(rs.getInt("no"), rs.getNString("name"), rs.getInt("point"));
					stList.add(st);
				}
				
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 구문 실행 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 로딩 실패");
			e.printStackTrace();
			
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		for(Student s:stList) {
			System.out.println(s.toString());
		}
	}

}
