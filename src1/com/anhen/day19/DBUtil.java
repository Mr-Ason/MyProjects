package com.anhen.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//JDBC�ķ�װ
public class DBUtil {
	private static Properties p = new Properties();
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�������سɹ���");
		} catch (ClassNotFoundException e) {
			System.out.println("��������ʧ�ܣ�");
			e.printStackTrace();
		}
        
         try {
			p.load(new FileInputStream("src//in.properties"));
			System.out.println("���ݿ������ļ����سɹ���");
		} catch(FileNotFoundException e){
			System.out.println("���ݿ������ļ�����ʧ�ܣ�");
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection con = null;
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String password = p.getProperty("password");
	   
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("��ȡ���ӳɹ���");
		} catch (SQLException e) {
			System.out.println("��ȡ����ʧ�ܣ�");
			e.printStackTrace();
		}
	    return con;
	}
}
