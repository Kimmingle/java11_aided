package org.kh.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MariaDB {

	public static void main(String[] args) {
		Connection con = null;	
		PreparedStatement pstmt = null;   
		
		
		String driver = "org.mariadb.jdbc.Driver";
		
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
	}

}
