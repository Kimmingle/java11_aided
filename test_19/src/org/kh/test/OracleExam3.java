package org.kh.test;
//update �ǽ�
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam3 {

	public static void main(String[] args) {
		Connection con = null;		//db�����Ѱ� 
		PreparedStatement pstmt = null;   //���� �����ϰ� sql������ ������ �� ��
		
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "update student set point=?, name=?, where=? no=?";
//		Student st = new Student(6, "�����", 90);  �̹� �ѹ� ���������ϱ� ������ �����Ƿ� �ּ�ó��
		Student st = new Student(3, "����ȯ", 88);
		int i = 0;

		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getPoint());
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getNo());
				i = pstmt.executeUpdate();
				
				if (i>0) {
					System.out.println(i+"���� ����ó��");
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("�ε�����");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				
				try {
					pstmt.close();  //system�� �ܺ� �ڿ��� �ݴ´�
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				
				try {
					con.close();  //system�� �ܺ� �ڿ��� �ݴ´�
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}	