package com.anhen.day19;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDBUtil {

	public static void main(String[] args) {
		
		Connection con = DBUtil.getConnection();
		if(con!=null){
			System.out.println("������ӣ�");
		}
		try {
			con.createStatement().executeQuery("select * from student;");
			System.out.println("��ѯ��");
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			con = DBUtil.getConnection();//�ٴλ�ȡ����
			con.createStatement().executeQuery("select * from student;");
			System.out.println("�ڶ��β�ѯ��");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
