package com.anhen.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Text复制 {
	public static void main(String [] args){
		text2();
	}
	public static void text1(){
		//创建OutputStream File 实例
		File file = new File("D:\\easou.txt");
		 try {
			 
			file.createNewFile();
			System.out.println(file.getAbsolutePath());
			//2.写内容
			String str ="使用InputStream和OutputStream完成文件复制。汉字字符 2字节英文字符 1字节中文标点 2字节英文标点 1字节";
			byte[] bytes = str.getBytes();
			//3.实例化
			OutputStream out = new FileOutputStream(file);
			//4.写入内容
			out.write(bytes);
			//5.关闭输出流
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
			//1.实例化 InputStream
			InputStream input = new FileInputStream("D:\\easou.txt");
			//2.创建数组
			byte[] b = new byte[1024];
			//3.读取内容
			int i = -1;
			do{
				i = input.read(b);
				for(int x = 0;x<i;x++){
					//System.out.println(b[i]);
				}
				
			}while(i!=-1);
			//4.创建字符串
			String str = new String(b);
			System.out.println(str);
			//5.关闭输入流
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
