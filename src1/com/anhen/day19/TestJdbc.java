package com.anhen.day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		//1��ȷ�����ݿ�汾
		String name = "com.mysql.jdbc.Driver";
		//2��ע������
		try {
			Class.forName(name);
			System.out.println("ע�������ɹ���");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ע������ʧ�ܣ�");
			e.printStackTrace();
		}
		//3���������
		String url ="jdbc:mysql://localhost:3306/student";//java.sql.SQLException: No suitable driver found for 
		String user ="root";
		String password = "199312";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			if(con!= null){
				System.out.println("���ӳɹ���");
			}
			
		} catch (SQLException e) {
			System.out.println("����ʧ�ܣ�");
			e.printStackTrace();
		}
		
		
		

	}

}
