package com.anhen.day17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*OutputStream 写入内容
 * */
public class TestOutputStreams {

	public static void main(String[] args) {
		//创建File实例
		File file = new File("D:\\outputStream.txt");
		try {
			file.createNewFile();
			System.out.println(file.getAbsolutePath());
			//写入内容
			String str = "写入的内容，ADFfds；1234567890";
			byte[] bytes = str.getBytes();
			//实例化OutputStream
			OutputStream out = new FileOutputStream(file,true);//true  追加内容
			out.write(bytes);//写入内容
			out.close();//关闭输出流
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
