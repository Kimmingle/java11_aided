package org.kh.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MariaDBExam5 {

	public static void main(String[] args) {
		Connection con = null;		//db연결한것 
		PreparedStatement pstmt = null;   //상태 변경하고 sql문장을 실행할 때 씀
		ResultSet rs = null;
		
		MariaDB mr = new MariaDB();
		try {
			con= mr.connect();
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
		}catch(){
			
		}
		
		
		
		
	}

}
