package org.kh.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleDB {

	
		Connection con = null;		//db연결한것 
		PreparedStatement pstmt = null;   //상태 변경하고 sql문장을 실행할 때 씀
		ResultSet rs = null;
			
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
			

		public Connection connect() {
			try {
				Class.forName(driver);    //드라이버 로딩
				try {
					con = DriverManager.getConnection(url, userid, userpw);   //데이터베이스 물리적 연결
						 
						
				} catch (SQLException e) {
						System.out.println("데이터베이스 연결 실패 또는 SQL구문 실행 실패");
						e.printStackTrace();
					}
				} catch (ClassNotFoundException e) {
					System.out.println("데이터베이스 로딩 실패");
					e.printStackTrace();
				} 
				return con;
		}
			public void close(PreparedStatement pstmt, Connection con) {
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch(SQLException e) {
						e.printStackTrace();
					}
				}
				if(con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			public void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
				
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
					} catch(SQLException e) {
						e.printStackTrace();
					}
				}
				if(con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

}
