package com.anhen.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*序列化:从内存中的数据（对象）放到问价中。
 * 反序列化:从文件中读取数据创在能内存中生成对象。
 * 
 */
public class TestObjectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\6.txt";
		//序列化（输出）
		TestObjectOutputStream(path);
		//反序列化

	}
	public static void TestObjectInputStream(String path){
		try{
			//1.字节流
			InputStream input =new FileInputStream(path);
			//2.对象序列化
			ObjectInputStream objectStream = new ObjectInputStream(input);
		    
			//3.对象序列化
			objectStream.readObject();
			System.out.println("反序列化成功！");
			//4.关闭流
			objectStream.close();
			input.close();
		}catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public static void TestObjectOutputStream(String path){
		try{
			//1.字节流
			OutputStream out =new FileOutputStream(path,true);
			//2.对象序列化
			ObjectOutputStream objectStream = new ObjectOutputStream(out);
		    
			//3.对象序列化
			String str = "序列化 内容";
			objectStream.writeObject(str);
			System.out.println("序列化成功！");
			//4.关闭流
			objectStream.close();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	
	}

}
