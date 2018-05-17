package com.anhen.day17;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class TextFile {
	public static void main(String[] args){
		//�����ļ�
		createFile();
	}


//�����ļ�
	public static void  createFile(){
			File file = new File("D:\\string.txt");//���ļ�
			//�ж��ļ��Ƿ����
			if(file.exists()){
				System.out.println("�ļ��Ѿ����ڣ�");
				if(file.delete()){
					System.out.println("�ļ���ɾ����");
				}else{
					System.out.println("�ļ�ɾ��ʧ�ܣ�");
				}
				
			}else{
				System.out.println("�ļ����Ա�������");
				try{
					if((file.createNewFile())){
					System.out.println("�ļ������ɹ���");
					//��ȡ�ļ���Ϣ
					show(file);
					}
				}
			catch(IOException e){
				System.out.println("�ļ�����ʧ�ܣ�");
				e.printStackTrace();
			}		
		}
  }
	public static void show(File file){
		String path = file.getAbsolutePath();//��ȡ·��
		long length = file.lastModified();//�������һ���޸ĵ�
		Date date = new Date(length);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss E");
		String time = sdf.format(date);//��ʱ���ʽΪ�ַ���
		System.out.println("·��:"+path);
		System.out.println("��С:"+file.length());
		System.out.println("ʱ��:"+time);
		
		
	}
}