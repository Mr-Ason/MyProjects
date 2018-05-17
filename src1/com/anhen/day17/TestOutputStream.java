package com.anhen.day17;
//将内容输入到创建的文件夹
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutputStream {
//OutputStream 输入
	public static void main(String[] args) {
		
		//创建File实例
		File file = new File("1.txt");//创建文件
		try{
			file.createNewFile();
			System.out.println(file.getAbsolutePath());//获取文件路径
			//写内容
			String str ="今天又懵逼sdf";//写内容到文件
			byte[] bytes = str.getBytes();//字符串转为字节
			//实例化 OutputStream
			OutputStream out = new FileOutputStream(file);
			
			//写入内容
			out.write(bytes);//将字节写入文件
			//关闭输出流
			out.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
