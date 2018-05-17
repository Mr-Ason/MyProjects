package com.anhen.day18;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//字符缓冲流 效率高
public class TestBufferedWriter {
	public static void main(String[] args){
		try{
			//1.字节流
			OutputStream out = new FileOutputStream("D:\\4.txt",true);
		//2.字符流
			OutputStreamWriter outWriter = new OutputStreamWriter(out);
		//3.缓冲流
			BufferedWriter buffWriter = new BufferedWriter(outWriter);
		//4.写入内容
			String str = "测试内容！\r\n你不是我想要";
			buffWriter.write(str);
			buffWriter.newLine();
			buffWriter.write(str);
			System.out.print("写入成功！");
		//5.关闭
			buffWriter.close();
		    outWriter.close();
		    out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
