package com.anhen.day18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//�ַ���  �ַ���ͨ���ֽ���������
public class TestOutputStreamWriter {

	public static void main(String[] args) {
		
		
		try {
			// 1.�����ֽ��� OutputStream
			OutputStream out = new FileOutputStream("D:\\2.txt",true);
			//2.�ַ��� OutputStreamWriter
			OutputStreamWriter writer = new OutputStreamWriter(out);
			//3.д������
			String str="��ã�";
			writer.write(str);
			System.out.print("д��ɹ���");
			//4.�ر���
			writer.close();
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
