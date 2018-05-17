package com.anhen.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//JDBC的封装
public class DBUtil {
	private static Properties p = new Properties();
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功！");
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败！");
			e.printStackTrace();
		}
        
         try {
			p.load(new FileInputStream("src//in.properties"));
			System.out.println("数据库配置文件加载成功！");
		} catch(FileNotFoundException e){
			System.out.println("数据库配置文件加载失败！");
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
			System.out.println("获取连接成功！");
		} catch (SQLException e) {
			System.out.println("获取连接失败！");
			e.printStackTrace();
		}
	    return con;
	}
}
