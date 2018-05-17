package com.anhen.day20;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//通过这个类  使用我的数据 增删该查 等
public final class DBUtils {
	//私有属性
	private Connection con; 
	private  String url;
	private  String user;
	private String password;
	
	//构造方法
	public DBUtils(){
		//完成初始化
	}
	public  static  void lint(){
		String name="com.mysql.jdbc.Driver";
		//注册驱动
		try {
			Class.forName(name);
			System.out.println("注册驱动成功！");
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动失败！");
			e.printStackTrace();
		}
		//加载属性集
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
		//获得链接
		String url = "";
		String user="";
		String password = "";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			if(con != null){
				System.out.println("加载成功！");
			}
	        	
		} catch (SQLException e) {
			System.out.println("加载失败！");	
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
