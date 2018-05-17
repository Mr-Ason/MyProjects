package com.anhen.day18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesrBufferedReader {

	public static void main(String[] args) {
		
		//1.�ֽ���
		InputStream input= null;
		//2.�ַ���
		InputStreamReader inputReader= null;	
		//3.������
		BufferedReader reader =null;
		String str = "";//����дnull
		
		
		try{
			input = new FileInputStream("D:\\4.txt");
			inputReader = new InputStreamReader(input);
			reader = new BufferedReader(inputReader);
			//4.��ȡ����
			while((str = reader.readLine())!=null){
				System.out.println(str);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{//5.�ر���
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
