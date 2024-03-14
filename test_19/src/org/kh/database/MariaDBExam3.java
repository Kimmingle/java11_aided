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
		String sql = "update student set name =? , point =? where no=?"; //no�� primary Ű�� where ���� ã�°ǰ�?
		
		
		//MariaDB�� temp�����ͺ��̽��� student ���̺��� newSt�� ������ ���ڵ�� ����� �� �ֵ��� �ڹ� ���α׷����� �ϼ��Ͻÿ�
		
		try {
			Class.forName(driver);
			
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql); //���� on
				
				pstmt.setInt(1, newSt.getNo());		//���� �ɼ� �߰�
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				
				i = pstmt.executeUpdate(); 		//update, delete, insert���� commit�� �ʿ��ϱ� ������ executeUpdate�� ����Ѵ�!!
				
				if (i>0) {
					System.out.println(i + "���� ���������� ó�� �Ǿ����ϴ�.");
				} else {
					System.out.println("SQL���� ����");
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
