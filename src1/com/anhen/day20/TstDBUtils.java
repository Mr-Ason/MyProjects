package com.anhen.day20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TstDBUtils {

	public static void main(String[] args) {
		DBUtils dbU  = new DBUtils();
		Connection con = dbU.getConnection();
		if(con!=null){
			System.out.println("������ӳɹ���");
		}
		//��������
		//�޸�
		String sql ="update student set s_age = ? where id in(?,?,?,?)";
		//Ԥ����
		try {
			PreparedStatement  pstmt = con.prepareStatement(sql);
			String[] paras = {"20","1002","1003","1004"};//��IDΪ102 003 104 �������Ϊ20
			pstmt.setString(1, paras[0]);
			pstmt.setString(2, paras[1]);
			pstmt.setString(3, paras[2]);
			pstmt.setString(4, paras[3]);
			//ִ�� sql
			int num = pstmt.executeUpdate();
			if(num>0){
				System.out.println("�޸ĳɹ���");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���������

	}

}
