package com.anhen.day17;
//读取out 写入的内容
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//InputStream 读取内容
public class TestInputStream {

	public static void main(String[] args) {
		//创建InputStream
		try {
			//创建InputStream实例
			InputStream input =new FileInputStream("D:\\1.txt"); //配合 out的写入  将之写入的读取出来
			//创建byte数组
			byte[] bytes = new byte[1024];
			//读取内容
			int len = -1;
			do{
				len = input.read(bytes);//字节内容总数
				for(int i = 0;i<len;i++){
					System.out.println(bytes[i]);
					System.out.println(bytes[i]);
				}
			}while(len !=-1);//当读取到末尾 返回 -1
			//创建字符串
			String str = new String(bytes);
			System.out.println(str);
			//关闭输入流
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException："+e);
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("IOException："+e);
			e.printStackTrace();
		}		
	}

}
