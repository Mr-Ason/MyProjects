package com.anhen.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Text���� {
	public static void main(String [] args){
		text2();
	}
	public static void text1(){
		//����OutputStream File ʵ��
		File file = new File("D:\\easou.txt");
		 try {
			 
			file.createNewFile();
			System.out.println(file.getAbsolutePath());
			//2.д����
			String str ="ʹ��InputStream��OutputStream����ļ����ơ������ַ� 2�ֽ�Ӣ���ַ� 1�ֽ����ı�� 2�ֽ�Ӣ�ı�� 1�ֽ�";
			byte[] bytes = str.getBytes();
			//3.ʵ����
			OutputStream out = new FileOutputStream(file);
			//4.д������
			out.write(bytes);
			//5.�ر������
			out.close();
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			   e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void text2(){
		try {
			//1.ʵ���� InputStream
			InputStream input = new FileInputStream("D:\\easou.txt");
			//2.��������
			byte[] b = new byte[1024];
			//3.��ȡ����
			int i = -1;
			do{
				i = input.read(b);
				for(int x = 0;x<i;x++){
					//System.out.println(b[i]);
				}
				
			}while(i!=-1);
			//4.�����ַ���
			String str = new String(b);
			System.out.println(str);
			//5.�ر�������
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
