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
/*java�аѲ�ͬ����Դ����������ݴ��䶼�����
 * ����Ϊ��������Stream),��ʵ�����ͳһ�ͼ򵥵�
 * ����/�����Inout/Output,I/O)������ʽ��
 */
//������ ֧��Java������������
public class TestDateStream {

	public static void main(String[] args) {
		String path = "D:\\1.txt";
		TestDateOutputStream(path);//д��
		TestDateInputStream(path);//��ȡ
	}
	public static void TestDateInputStream(String path){
		try {
			//1.ʵ����InputStream
			InputStream input = new FileInputStream(path);
			//2.ʵ����DataInputStream
			DataInputStream data = new DataInputStream(input);
			//3.��ȡ����
			while(true){
				try{
					String str = data.readUTF();
					System.out.println(str);
				}catch(EOFException e){//��������ĩβ
					break;
				}
			}
			//4.�ر���
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
			//1.ʵ���� OutputStream
			OutputStream out = new FileOutputStream(path,true);
		    //2.ʵ����DateOutputStream
			DataOutputStream data = new DataOutputStream(out);
			//3.д������
			data.writeUTF("�л�fnk kl����ż�");//ԭ�ļ� ����Ҳ��UTF ��������
			System.out.println("д��ɹ���");
			//�ر���
			data.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
