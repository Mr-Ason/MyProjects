package com.anhen.day17;
//��ȡout д�������
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//InputStream ��ȡ����
public class TestInputStream {

	public static void main(String[] args) {
		//����InputStream
		try {
			//����InputStreamʵ��
			InputStream input =new FileInputStream("D:\\1.txt"); //��� out��д��  ��֮д��Ķ�ȡ����
			//����byte����
			byte[] bytes = new byte[1024];
			//��ȡ����
			int len = -1;
			do{
				len = input.read(bytes);//�ֽ���������
				for(int i = 0;i<len;i++){
					System.out.println(bytes[i]);
					System.out.println(bytes[i]);
				}
			}while(len !=-1);//����ȡ��ĩβ ���� -1
			//�����ַ���
			String str = new String(bytes);
			System.out.println(str);
			//�ر�������
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException��"+e);
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("IOException��"+e);
			e.printStackTrace();
		}		
	}

}
