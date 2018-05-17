package com.anhen.day17;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//�ַ������� Ч�ʸ�
public class TestBufferedWriters {

	public static void main(String[] args) {
		try{
			//1���õ��ֽ���
			OutputStream out = new FileOutputStream("D:\\1.txt",true);//��û�д��ļ��������д���
			//2���õ��ַ���
			OutputStreamWriter outWriter = new OutputStreamWriter(out);
			//3������������
			BufferedWriter bufferedWriter = new BufferedWriter(outWriter);
			//4��д������
			String str ="���û������ķ�ʽд���ļ���";
			bufferedWriter.write(str);
			bufferedWriter.newLine();//����
			String str1 = "���к���û������ķ�ʽд���ļ���";
			bufferedWriter.write(str1);
			System.out.println("д��ɹ���");
			//5���ر���
			bufferedWriter.close();
			outWriter.close();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
