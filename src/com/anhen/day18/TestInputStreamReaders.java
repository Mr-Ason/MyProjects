package com.anhen.day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//input  �ַ��� ͨ���ֽ���������
public class TestInputStreamReaders {

	public static void main(String[] args) {
		try{
			//1���ֽ���
			InputStream input =new FileInputStream("D:\\1.txt");
			//2���ַ���
			InputStreamReader reader = new InputStreamReader(input);
			//3����ȡ����
			String str ="";
			char[] chars = new char[1024];
			int len = -1;
			while((len = reader.read(chars))!=-1){// reader.read(chars)���������ݷ���chars��
				str = new String(chars,0,len);
				System.out.println(str);
			}
			System.out.println("��ȡ�ɹ���");
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
