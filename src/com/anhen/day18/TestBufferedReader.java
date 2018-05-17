package com.anhen.day18;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestBufferedReader {

	public static void main(String[] args) {
		
		//1��ʵ�����ֽ���
		InputStream input = null;
		//2��ʵ�����ַ���
		InputStreamReader inputReader = null;
		//3��������
		BufferedReader readers = null;
		String str = "";
		try{
			input = new FileInputStream("D:\\1.txt");
			inputReader = new InputStreamReader(input);
			readers = new BufferedReader(inputReader);
			//4����ȡ����
			while((str = readers.readLine())!=null){
				System.out.println(str);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				if(readers!=null){
					readers.close();
				}
				if(inputReader !=null){
					inputReader.close();
				}
				if(input !=null){
					input.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//5���ر���
		

	}

	private static BufferedReader BufferedReader(InputStreamReader inputReader) {
		// TODO Auto-generated method stub
		return null;
	}

}
