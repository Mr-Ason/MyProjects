package com.anhen.day18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//�ַ��� ͨ���ֽ���������   Ҫ�õ��ַ��� �ȵõ��ֽ���
public class TestOutputStreamWrites {

	public static void main(String[] args) {
		
		try {
			//1���ֽ���OutputStream
			OutputStream out = new FileOutputStream("D:\\outputStreamWriter.txt",true);
			//2���ַ���OutputStreamWriter
			OutputStreamWriter write = new OutputStreamWriter(out);//���ֽ��������ַ�����
			//3��д������
			String str = "д���ַ����Ĳ���";
			write.write(str);//д�뷽ʽһ
			char[] chars = str.toCharArray();
				write.write(chars);//д�뷽ʽ��
				System.out.println("д��ɹ�!");//���ر��� �ļ���û������
				//4���ر���
				write.close();
				out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
