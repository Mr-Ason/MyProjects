package com.anhen.day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//input 字节流  字节流通向字符流的桥梁
public class TestInputStremReader {

	public static void main(String[] args) {
		try{
			//1.字节流
			InputStream input = new FileInputStream("D:\\4.txt");
			//2.字符流
			InputStreamReader reader = new InputStreamReader(input);
			//3.读取内容
			String str = "";
			char[] chars = new char[1024];
			int len = -1;
			while((len = reader.read(chars))!=-1){//赋值  不等于 -1就一直读取
				str = new String(chars,0,len);
				System.out.println(str);
			}
			System.out.println("读取成功~！");
			//4.关闭流
			//5.
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
