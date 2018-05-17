package com.anhen.day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ZouyeJDBCOprator {

	public static void main(String[] args) {
		//1.确定数据库版本
		String name= "com.mysql.jdbc.Driver";
		//2.注册驱动
		try {
			Class.forName(name);
			System.out.println("注册驱动成功！");
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动失败！");
			e.printStackTrace();
		}
		//3.获得链接
		String url = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8";
		String user = "root";
		String password ="199312";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			if(con!=null){
			    System.out.println("链接成功！");
			}
			//修改数据
			TestUpdata(con);
			TestQuerry(con);
		} catch (SQLException e) {
			System.out.println("链接失败！");
			e.printStackTrace();
		}

	}



public static void TestQuerry(Connection con){
	//获得SQL处理对象
	try{
		Statement st = con.createStatement();
		
		String sql = "select * from staffs;";
		//得到结果集
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			int id = rs.getInt(1);
			String name= rs.getString(2);
			String s_birthday = rs.getString(3);
			String s_email = rs.getString(4);
			String s_address = rs.getString(5);
			
			System.out.printf("编号:%d,姓名:%s,生日:%s,电邮:%s,住址:%s",id,name,s_birthday,s_email,s_address);
		    System.out.println("");//换行打印
		}
			//关闭链接
			rs.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	
   }
public static void TestUpdata(Connection con){
	//1.获得SQL处理对象
	try {
		Statement st = con.createStatement();
		 
		//2.待处理的SQL
		 //修改
		String sql = "update staffs set s_name='李壹' where id='1003';";
		//新增
		sql = "insert into staffs(id,name,s_birthday,s_email,s_address) values (1006,'你不污','1992-03-23,'23454@qq.com','北京')";
		//删除
		sql = "delete from staffs where id=2003";
		//查找
		System.out.println("查找:");
		
		//sql = "select * from staffs where name like '李四';";
		//ResultSet rs = st.executeQuery(sql);
//		while(rs.next()){
//			String str1= rs.getNString("李四");
//		}
		//操作数据库
		
		int num = st.executeUpdate(sql);
		if(num>0){
			System.out.println("执行成功:"+num+"行！");
			System.out.println("sql修改成功！");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}










