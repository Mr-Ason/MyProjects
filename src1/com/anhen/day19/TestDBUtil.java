package com.anhen.day19;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDBUtil {

	public static void main(String[] args) {
		
		Connection con = DBUtil.getConnection();
		if(con!=null){
			System.out.println("获得链接！");
		}
		try {
			con.createStatement().executeQuery("select * from student;");
			System.out.println("查询：");
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			con = DBUtil.getConnection();//再次获取链接
			con.createStatement().executeQuery("select * from student;");
			System.out.println("第二次查询！");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
