package org.kh.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MariaDBExam5 {

	public static void main(String[] args) {
		Connection con = null;		//db�����Ѱ� 
		PreparedStatement pstmt = null;   //���� �����ϰ� sql������ ������ �� ��
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
