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
		Connection con = null;		//db�����Ѱ� 
		PreparedStatement pstmt = null;   //���� �����ϰ� sql������ ������ �� ��
		ResultSet rs = null;	//select�� ����� ��ȯ��
		// ����Ʈ�� ���� ResultSet�� �ڹٶ� ȣȯ �����ϰ� ���ش�.. ResultSet�� db��
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "select * from student";
		List <Student> stList = new ArrayList<>();  //student���̺��� �����͸� ������� ����Ʈ ����
		
		
		
		try {
			Class.forName(driver);    //����̹� �ε�
			try {
				con = DriverManager.getConnection(url, userid, userpw);   //�����ͺ��̽� ������ ����
				pstmt = con.prepareStatement(sql);    //������ ����
				rs = pstmt.executeQuery();  //rs�� �Ʊ� student���̺� �ִ� ������ �����
				while(rs.next()) {
					Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
					stList.add(st);  //st�� �ҷ��ͼ� ����Ʈ�� �߰��Ѱ�
				}
				
				
			} catch (SQLException e) {
				System.out.println("�����ͺ��̽� ���� ���� �Ǵ� SQL���� ���� ����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("�����ͺ��̽� �ε� ����");
			e.printStackTrace();
		} finally {  //���� �����ǵ� �ݴ� ������� ����
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
