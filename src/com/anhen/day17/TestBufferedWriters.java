package com.anhen.day17;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//字符缓冲流 效率高
public class TestBufferedWriters {

	public static void main(String[] args) {
		try{
			//1、得到字节流
			OutputStream out = new FileOutputStream("D:\\1.txt",true);//若没有此文件，会自行创建
			//2、得到字符流
			OutputStreamWriter outWriter = new OutputStreamWriter(out);
			//3、创建缓冲流
			BufferedWriter bufferedWriter = new BufferedWriter(outWriter);
			//4、写入内容
			String str ="调用缓冲流的方式写入文件！";
			bufferedWriter.write(str);
			bufferedWriter.newLine();//换行
			String str1 = "换行后调用缓冲流的方式写入文件！";
			bufferedWriter.write(str1);
			System.out.println("写入成功！");
			//5、关闭流
			bufferedWriter.close();
			outWriter.close();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
