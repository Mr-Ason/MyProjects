package com.anhen.day18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//字符流 通向字节流的桥梁   要得到字符流 先得到字节流
public class TestOutputStreamWrites {

	public static void main(String[] args) {
		
		try {
			//1、字节流OutputStream
			OutputStream out = new FileOutputStream("D:\\outputStreamWriter.txt",true);
			//2、字符流OutputStreamWriter
			OutputStreamWriter write = new OutputStreamWriter(out);//把字节流传到字符流中
			//3、写入内容
			String str = "写入字符流的操作";
			write.write(str);//写入方式一
			char[] chars = str.toCharArray();
				write.write(chars);//写入方式二
				System.out.println("写入成功!");//不关闭流 文件中没有内容
				//4、关闭流
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
