package com.anhen.day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//数据库会话功能  connection 
public class ZuoyeConnections {

	public static void main(String[] args) {
		//1.确定数据库版本
		String name = "com.mysql.jdbc.Driver";
		//2.注册驱动
		try {
			Class.forName(name);
			System.out.println("注册驱动成功！");
		} catch (ClassNotFoundException e) {
			System.out.println("注册失败！");
			e.printStackTrace();
		}
		//3.获得链接
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "199312";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			if(con!=null){
				System.out.println("获得链接成功！");
			}
		} catch (SQLException e) {
			System.out.println("获得链接失败！");
			e.printStackTrace();
		}

	}

}
