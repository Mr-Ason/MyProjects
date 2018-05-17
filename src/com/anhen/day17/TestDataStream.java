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

//������ ֧��java������������
public class TestDataStream {

	public static void main(String[] args) {
		String path = "D:\\outputStreams.txt";
		TestDataOutputStreams(path);
		TestDataInputStreams(path);
	}
	
	public static void TestDataInputStreams(String path){
		
		try {
			//ʵ����InputStream
			InputStream input = new FileInputStream(path);
			//ʵ����DataInputStream
			DataInputStream data =new DataInputStream(input);
			//��ȡ����
			try {
//				String st r = data.readUTF();//ֻ�ܶ�ȡwriteUTFд����ļ� �Ҷ�ȡ�ĵ�һ��
//				System.out.println(str);
				while(true){
					try{
						String str = data.readUTF();
					System.out.println(str);
					}catch(EOFException e){
						break;
					}
					
				}
				data.close();
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
	
	public static void TestDataOutputStreams(String path){
		try {
			//1.ʵ����OutputStream
			OutputStream out = new FileOutputStream(path,true);
			//2.ʵ����DataOutputStream
			DataOutputStream data = new DataOutputStream(out);
			//3.д������
			try {
				data.writeUTF("���쵼�����Ͱ���");//ԭ�ļ� ����Ҳ��utf ��������
				System.out.println("д��ɹ���");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//4.�ر���
			try {
				data.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				out.close();
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


