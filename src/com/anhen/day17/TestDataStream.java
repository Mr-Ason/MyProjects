package com.anhen.day17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//数据流 支持java基本数据类型
public class TestDataStream {

	public static void main(String[] args) {
		String path = "D:\\outputStreams.txt";
		TestDataOutputStreams(path);
		TestDataInputStreams(path);
	}
	
	public static void TestDataInputStreams(String path){
		
		try {
			//实例化InputStream
			InputStream input = new FileInputStream(path);
			//实例化DataInputStream
			DataInputStream data =new DataInputStream(input);
			//读取内容
			try {
//				String st r = data.readUTF();//只能读取writeUTF写入的文件 且读取的第一行
//				System.out.println(str);
				while(true){
					try{
						String str = data.readUTF();
					System.out.println(str);
					}catch(EOFException e){
						break;
					}
					
				}
				data.close();
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void TestDataOutputStreams(String path){
		try {
			//1.实例化OutputStream
			OutputStream out = new FileOutputStream(path,true);
			//2.实例化DataOutputStream
			DataOutputStream data = new DataOutputStream(out);
			//3.写入内容
			try {
				data.writeUTF("市领导开发就阿里");//原文件 编码也是utf 否则乱码
				System.out.println("写入成功！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//4.关闭流
			try {
				data.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}

}


