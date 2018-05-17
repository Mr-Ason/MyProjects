package com.anhen.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*���л�:���ڴ��е����ݣ����󣩷ŵ��ʼ��С�
 * �����л�:���ļ��ж�ȡ���ݴ������ڴ������ɶ���
 * 
 */
public class TestObjectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\6.txt";
		//���л��������
		TestObjectOutputStream(path);
		//�����л�

	}
	public static void TestObjectInputStream(String path){
		try{
			//1.�ֽ���
			InputStream input =new FileInputStream(path);
			//2.�������л�
			ObjectInputStream objectStream = new ObjectInputStream(input);
		    
			//3.�������л�
			objectStream.readObject();
			System.out.println("�����л��ɹ���");
			//4.�ر���
			objectStream.close();
			input.close();
		}catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public static void TestObjectOutputStream(String path){
		try{
			//1.�ֽ���
			OutputStream out =new FileOutputStream(path,true);
			//2.�������л�
			ObjectOutputStream objectStream = new ObjectOutputStream(out);
		    
			//3.�������л�
			String str = "���л� ����";
			objectStream.writeObject(str);
			System.out.println("���л��ɹ���");
			//4.�ر���
			objectStream.close();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	
	}

}
