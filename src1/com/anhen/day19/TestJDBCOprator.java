package com.anhen.day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCOprator {

	public static void main(String[] args) {
		// 1.确定数据库版本
		String name = "com.mysql.jdbc.Driver";
		//2.注册驱动
		try {
			Class.forName(name);
			System.out.println("注册成功！");
		} catch (ClassNotFoundException e) {
			System.out.println("注册失败！");
			e.printStackTrace();
		}
		//获得链接
		String url ="jdbc:mysql://localhost:3306/data?useUnicode=true&characterEncoding=UTF-8";//java.sql.SQLException: No suitable driver found for 
		String user ="root";
		String password = "199312";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
		    
			if(con!= null){
				System.out.println("链接成功！");
			}
			//修改数据库
			//TestUpdate1(con);
			TestQuery(con);
		} catch (SQLException e) {
			System.out.println("链接失败！");
			e.printStackTrace();
		}
	}
	public static void TestQuery(Connection con){
		//获得SQL处理对象
				try {
					Statement stmt = con.createStatement();
					String sql = "select * from student;";
					//得到结果集
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						int id = rs.getInt(1);
						String name = rs.getString(2);
						int age = rs.getInt("s_age");
						System.out.printf("id:%d,name:%s,age:%d",id,name,age);
						System.out.println("-------------------------");
					}
					//关闭连接
					rs.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	}
	public static void TestUpdate1(Connection con){
		       //1.获取SQL处理对象
					try {
						Statement stmt = con.createStatement();
						//2.待处理 SQL
						String sql = "update student set s_age='53' where Id = '1002';";
						//新增
						//sql="insert into student(id,s_name,s_age) values ('1006','沈梦','21')";//新增
						//sql = "insert into student(id,s_name,s_age) values ('10014','测试1','22'),('10015','测试2','23')";
						//删除
						//sql="delete from student where id>=10013";//
						//3.操作数据库
						int num = stmt.executeUpdate(sql);
						if(num>0){
							System.out.println("执行成功："+num+"行！");
							System.out.println("SQL修改成功！");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	 }
	
}
