package com.anhen.day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*InputStream:读取内容
 * */
public class TestInputStreams {

	public static void main(String[] args) {
		// 创建InputStream实例
		try {
			InputStream input = new FileInputStream("D:\\outputStream.txt");
			//创建byte数组
			byte[] bytes = new byte[1024];
			
			//读取内容
			int len = -1;
			do{
				try {
					len = input.read(bytes);//内容的字节总数
					for(int i=0;i<len;i++){
						System.out.println(bytes[i]);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}while(len!=-1);//当读取到末尾 返回-1
			//创建字符串
			String str = new String(bytes);
			System.out.println(str);
			//关闭输出流
			try {
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

}
