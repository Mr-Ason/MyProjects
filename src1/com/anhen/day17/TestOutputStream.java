package com.anhen.day17;
//���������뵽�������ļ���
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutputStream {
//OutputStream ����
	public static void main(String[] args) {
		
		//����Fileʵ��
		File file = new File("1.txt");//�����ļ�
		try{
			file.createNewFile();
			System.out.println(file.getAbsolutePath());//��ȡ�ļ�·��
			//д����
			String str ="�������±�sdf";//д���ݵ��ļ�
			byte[] bytes = str.getBytes();//�ַ���תΪ�ֽ�
			//ʵ���� OutputStream
			OutputStream out = new FileOutputStream(file);
			
			//д������
			out.write(bytes);//���ֽ�д���ļ�
			//�ر������
			out.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
