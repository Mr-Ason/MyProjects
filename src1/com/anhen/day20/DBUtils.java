package com.anhen.day20;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//ͨ�������  ʹ���ҵ����� ��ɾ�ò� ��
public final class DBUtils {
	//˽������
	private Connection con; 
	private  String url;
	private  String user;
	private String password;
	
	//���췽��
	public DBUtils(){
		//��ɳ�ʼ��
	}
	public  static  void lint(){
		String name="com.mysql.jdbc.Driver";
		//ע������
		try {
			Class.forName(name);
			System.out.println("ע�������ɹ���");
		} catch (ClassNotFoundException e) {
			System.out.println("ע������ʧ�ܣ�");
			e.printStackTrace();
		}
		//�������Լ�
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("src//in.properties"));
//			url= p.getProperty("url");
//			user = p.getProperty("user");
//			password = p.getProperty("password");
		} 
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//�������
		String url = "";
		String user="";
		String password = "";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			if(con != null){
				System.out.println("���سɹ���");
			}
	        	
		} catch (SQLException e) {
			System.out.println("����ʧ�ܣ�");	
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		if(con!=null){
			return con;
		}
		return null;
	}
	public  Object executeUpdate(String sql,Object[] path){
		
		
		return null;
		
	}

	

}
