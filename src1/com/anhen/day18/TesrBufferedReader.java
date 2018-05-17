package com.anhen.day18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesrBufferedReader {

	public static void main(String[] args) {
		
		//1.字节流
		InputStream input= null;
		//2.字符流
		InputStreamReader inputReader= null;	
		//3.缓冲流
		BufferedReader reader =null;
		String str = "";//不能写null
		
		
		try{
			input = new FileInputStream("D:\\4.txt");
			inputReader = new InputStreamReader(input);
			reader = new BufferedReader(inputReader);
			//4.读取内容
			while((str = reader.readLine())!=null){
				System.out.println(str);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{//5.关闭流
			try{
				if(reader!=null){
					reader.close();
				}
				if(inputReader!=null){
					inputReader.close();
				}
				if(input!=null){
					input.close();
				}
				str = null;
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
