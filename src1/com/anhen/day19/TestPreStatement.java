package com.anhen.day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestPreStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获得链接
		Connection con = DBUtil.getConnection();
		
		//sql 处理对象
		try {
			Statement stmt = con.createStatement();
			//执行aql
			Scanner sc = new Scanner(System.in);
			String aql = "";
			String name = "";
			int age = 0;
			System.out.println("请输入想修改人的姓名");
			name = sc.next();
			System.out.println("请输入修改后的年龄");
			age = sc.nextInt();
			//获得预处理对象
			String sql = "update student set s_age=? where s_name=?;";
			PreparedStatement pstmt = con.prepareStatement(sql);
			//设置参数
			pstmt.setInt(1,age);
			pstmt.setString(2, name);
			//执行SQL 处理结果
			int num = pstmt.executeUpdate();
			if(num>0){
				System.out.println("修改成功！");
			}
			//关闭链接
			pstmt.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
