package com.anhen.day20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TstDBUtils {

	public static void main(String[] args) {
		DBUtils dbU  = new DBUtils();
		Connection con = dbU.getConnection();
		if(con!=null){
			System.out.println("获得链接成功！");
		}
		//操作链接
		//修改
		String sql ="update student set s_age = ? where id in(?,?,?,?)";
		//预处理
		try {
			PreparedStatement  pstmt = con.prepareStatement(sql);
			String[] paras = {"20","1002","1003","1004"};//将ID为102 003 104 的年龄改为20
			pstmt.setString(1, paras[0]);
			pstmt.setString(2, paras[1]);
			pstmt.setString(3, paras[2]);
			pstmt.setString(4, paras[3]);
			//执行 sql
			int num = pstmt.executeUpdate();
			if(num>0){
				System.out.println("修改成功！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//欲处理对象

	}

}
