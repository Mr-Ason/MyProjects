package com.anhen.day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//input �ֽ���  �ֽ���ͨ���ַ���������
public class TestInputStremReader {

	public static void main(String[] args) {
		try{
			//1.�ֽ���
			InputStream input = new FileInputStream("D:\\4.txt");
			//2.�ַ���
			InputStreamReader reader = new InputStreamReader(input);
			//3.��ȡ����
			String str = "";
			char[] chars = new char[1024];
			int len = -1;
			while((len = reader.read(chars))!=-1){//��ֵ  ������ -1��һֱ��ȡ
				str = new String(chars,0,len);
				System.out.println(str);
			}
			System.out.println("��ȡ�ɹ�~��");
			//4.�ر���
			//5.
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
