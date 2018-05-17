package com.anhen.day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*InputStream:��ȡ����
 * */
public class TestInputStreams {

	public static void main(String[] args) {
		// ����InputStreamʵ��
		try {
			InputStream input = new FileInputStream("D:\\outputStream.txt");
			//����byte����
			byte[] bytes = new byte[1024];
			
			//��ȡ����
			int len = -1;
			do{
				try {
					len = input.read(bytes);//���ݵ��ֽ�����
					for(int i=0;i<len;i++){
						System.out.println(bytes[i]);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}while(len!=-1);//����ȡ��ĩβ ����-1
			//�����ַ���
			String str = new String(bytes);
			System.out.println(str);
			//�ر������
			try {
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

}
