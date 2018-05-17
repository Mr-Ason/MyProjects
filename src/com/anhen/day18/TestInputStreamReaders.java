package com.anhen.day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//input  字符流 通向字节流的桥梁
public class TestInputStreamReaders {

	public static void main(String[] args) {
		try{
			//1、字节流
			InputStream input =new FileInputStream("D:\\1.txt");
			//2、字符流
			InputStreamReader reader = new InputStreamReader(input);
			//3、读取内容
			String str ="";
			char[] chars = new char[1024];
			int len = -1;
			while((len = reader.read(chars))!=-1){// reader.read(chars)读到的内容放入chars中
				str = new String(chars,0,len);
				System.out.println(str);
			}
			System.out.println("读取成功！");
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
