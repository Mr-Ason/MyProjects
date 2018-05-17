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
/*java中把不同数据源与程序间的数据传输都抽像的
 * 表述为“流”（Stream),以实现相对统一和简单的
 * 输入/输出（Inout/Output,I/O)操作方式。
 */
//数据流 支持Java基本数据类型
public class TestDateStream {

	public static void main(String[] args) {
		String path = "D:\\1.txt";
		TestDateOutputStream(path);//写入
		TestDateInputStream(path);//读取
	}
	public static void TestDateInputStream(String path){
		try {
			//1.实例化InputStream
			InputStream input = new FileInputStream(path);
			//2.实例化DataInputStream
			DataInputStream data = new DataInputStream(input);
			//3.读取内容
			while(true){
				try{
					String str = data.readUTF();
					System.out.println(str);
				}catch(EOFException e){//到达内容末尾
					break;
				}
			}
			//4.关闭流
			data.close();
			input.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	private static void TestDateOutputStream(String path) {
		try {
			//1.实例化 OutputStream
			OutputStream out = new FileOutputStream(path,true);
		    //2.实例化DateOutputStream
			DataOutputStream data = new DataOutputStream(out);
			//3.写入内容
			data.writeUTF("中华fnk kl都快放假");//原文件 编码也是UTF 否则乱码
			System.out.println("写入成功！");
			//关闭流
			data.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
