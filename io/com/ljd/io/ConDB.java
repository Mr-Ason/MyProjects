package com.ljd.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConDB.conDB();
	}
	
	public static Connection conDB() throws  SQLException {
		//1、确定数据库版本
		String name = "com.mysql.jdbc.Driver";
		//2、注册驱动
		try {
			Class.forName(name);
			System.out.println("Login was successful！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Login was failure！");
			e.printStackTrace();
		}
		//3、获取链接
		String url = "jdbc:mysql://localhost:3306/info?useSSL=false&useUnicode=true&characterEncoding=UTF-8";
		String user = "root";
		String password = "199312";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		if(conn != null) {
			System.out.println("Link successful!");
		}else {
			System.out.println("Link failure!");
		}
		
		return conn;
	}

}
