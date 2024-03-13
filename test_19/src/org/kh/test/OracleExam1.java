package org.kh.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class OracleExam1 {

	public static void main(String[] args) {
		Connection con = null;		//db연결한것 
		PreparedStatement pstmt = null;   //상태 변경하고 sql문장을 실행할 때 씀
		ResultSet rs = null;	//select의 결과를 반환함
		// 리스트를 만들어서 ResultSet를 자바랑 호환 가능하게 해준다.. ResultSet는 db용
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "select * from student";
		List <Student> stList = new ArrayList<>();  //student테이블의 데이터를 담기위한 리스트 생성
		
		
		
		try {
			Class.forName(driver);    //드라이버 로딩
			try {
				con = DriverManager.getConnection(url, userid, userpw);   //데이터베이스 물리적 연결
				pstmt = con.prepareStatement(sql);    //논리적인 연결
				rs = pstmt.executeQuery();  //rs에 아까 student테이블에 있는 데이터 담겨짐
				while(rs.next()) {
					Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
					stList.add(st);  //st에 불러와서 리스트에 추가한것
				}
				
				
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL구문 실행 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 로딩 실패");
			e.printStackTrace();
		} finally {  //이제 닫을건데 반대 순서대로 닫음
			if (rs != null ) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null ) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null ) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			for(Student s :stList) {
				System.out.println(s.toString());
			}
		}
		
	}

}
