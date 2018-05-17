package com.anhen.day18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//字符流  字符流通向字节流的桥梁
public class TestOutputStreamWriter {

	public static void main(String[] args) {
		
		
		try {
			// 1.创建字节流 OutputStream
			OutputStream out = new FileOutputStream("D:\\2.txt",true);
			//2.字符流 OutputStreamWriter
			OutputStreamWriter writer = new OutputStreamWriter(out);
			//3.写入内容
			String str="你好！";
			writer.write(str);
			System.out.print("写入成功！");
			//4.关闭流
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
