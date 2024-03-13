package org.kh.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam5 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from student";
		
		OracleDB oracle = new OracleDB();
		List<Student> stList = new ArrayList<>();
		
		
		
		try {
			con = oracle.connect(); //con�� �̹� ��������ϱ� �޾ƿ�
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
				stList.add(st);  //st�� �ҷ��ͼ� ����Ʈ�� �߰��Ѱ�
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {  //���� �����ǵ� �ݴ� ������� ����
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
