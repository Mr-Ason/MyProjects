package com.anhen.day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestPreStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������
		Connection con = DBUtil.getConnection();
		
		//sql �������
		try {
			Statement stmt = con.createStatement();
			//ִ��aql
			Scanner sc = new Scanner(System.in);
			String aql = "";
			String name = "";
			int age = 0;
			System.out.println("���������޸��˵�����");
			name = sc.next();
			System.out.println("�������޸ĺ������");
			age = sc.nextInt();
			//���Ԥ�������
			String sql = "update student set s_age=? where s_name=?;";
			PreparedStatement pstmt = con.prepareStatement(sql);
			//���ò���
			pstmt.setInt(1,age);
			pstmt.setString(2, name);
			//ִ��SQL ������
			int num = pstmt.executeUpdate();
			if(num>0){
				System.out.println("�޸ĳɹ���");
			}
			//�ر�����
			pstmt.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
