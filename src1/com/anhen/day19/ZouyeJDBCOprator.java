package com.anhen.day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ZouyeJDBCOprator {

	public static void main(String[] args) {
		//1.ȷ�����ݿ�汾
		String name= "com.mysql.jdbc.Driver";
		//2.ע������
		try {
			Class.forName(name);
			System.out.println("ע�������ɹ���");
		} catch (ClassNotFoundException e) {
			System.out.println("ע������ʧ�ܣ�");
			e.printStackTrace();
		}
		//3.�������
		String url = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8";
		String user = "root";
		String password ="199312";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			if(con!=null){
			    System.out.println("���ӳɹ���");
			}
			//�޸�����
			TestUpdata(con);
			TestQuerry(con);
		} catch (SQLException e) {
			System.out.println("����ʧ�ܣ�");
			e.printStackTrace();
		}

	}



public static void TestQuerry(Connection con){
	//���SQL�������
	try{
		Statement st = con.createStatement();
		
		String sql = "select * from staffs;";
		//�õ������
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			int id = rs.getInt(1);
			String name= rs.getString(2);
			String s_birthday = rs.getString(3);
			String s_email = rs.getString(4);
			String s_address = rs.getString(5);
			
			System.out.printf("���:%d,����:%s,����:%s,����:%s,סַ:%s",id,name,s_birthday,s_email,s_address);
		    System.out.println("");//���д�ӡ
		}
			//�ر�����
			rs.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	
   }
public static void TestUpdata(Connection con){
	//1.���SQL�������
	try {
		Statement st = con.createStatement();
		 
		//2.�������SQL
		 //�޸�
		String sql = "update staffs set s_name='��Ҽ' where id='1003';";
		//����
		sql = "insert into staffs(id,name,s_birthday,s_email,s_address) values (1006,'�㲻��','1992-03-23,'23454@qq.com','����')";
		//ɾ��
		sql = "delete from staffs where id=2003";
		//����
		System.out.println("����:");
		
		//sql = "select * from staffs where name like '����';";
		//ResultSet rs = st.executeQuery(sql);
//		while(rs.next()){
//			String str1= rs.getNString("����");
//		}
		//�������ݿ�
		
		int num = st.executeUpdate(sql);
		if(num>0){
			System.out.println("ִ�гɹ�:"+num+"�У�");
			System.out.println("sql�޸ĳɹ���");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}










