package com.anhen.day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCOprator {

	public static void main(String[] args) {
		// 1.ȷ�����ݿ�汾
		String name = "com.mysql.jdbc.Driver";
		//2.ע������
		try {
			Class.forName(name);
			System.out.println("ע��ɹ���");
		} catch (ClassNotFoundException e) {
			System.out.println("ע��ʧ�ܣ�");
			e.printStackTrace();
		}
		//�������
		String url ="jdbc:mysql://localhost:3306/data?useUnicode=true&characterEncoding=UTF-8";//java.sql.SQLException: No suitable driver found for 
		String user ="root";
		String password = "199312";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
		    
			if(con!= null){
				System.out.println("���ӳɹ���");
			}
			//�޸����ݿ�
			//TestUpdate1(con);
			TestQuery(con);
		} catch (SQLException e) {
			System.out.println("����ʧ�ܣ�");
			e.printStackTrace();
		}
	}
	public static void TestQuery(Connection con){
		//���SQL�������
				try {
					Statement stmt = con.createStatement();
					String sql = "select * from student;";
					//�õ������
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						int id = rs.getInt(1);
						String name = rs.getString(2);
						int age = rs.getInt("s_age");
						System.out.printf("id:%d,name:%s,age:%d",id,name,age);
						System.out.println("-------------------------");
					}
					//�ر�����
					rs.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	}
	public static void TestUpdate1(Connection con){
		       //1.��ȡSQL�������
					try {
						Statement stmt = con.createStatement();
						//2.������ SQL
						String sql = "update student set s_age='53' where Id = '1002';";
						//����
						//sql="insert into student(id,s_name,s_age) values ('1006','����','21')";//����
						//sql = "insert into student(id,s_name,s_age) values ('10014','����1','22'),('10015','����2','23')";
						//ɾ��
						//sql="delete from student where id>=10013";//
						//3.�������ݿ�
						int num = stmt.executeUpdate(sql);
						if(num>0){
							System.out.println("ִ�гɹ���"+num+"�У�");
							System.out.println("SQL�޸ĳɹ���");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	 }
	
}
