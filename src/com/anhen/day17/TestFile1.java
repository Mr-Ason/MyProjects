package com.anhen.day17;
/*File:�����ļ���Ŀ¼
 * */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile1 {

	public static void main(String[] args) {
		// ����һ���ļ�
		//createFile();
		creatDirs();

	}
	
	//����Ŀ¼
	public static void creatDirs(){
		//����Fileʵ��
		File file = new File("D:\\File\\files\\test");
		if(file.exists()){
			System.out.println("�ļ����Ѵ��ڣ�");
			//ɾ��Ŀ¼
			//file.delete();//ֻɾ��һ��Ŀ¼
			deleteDirs("D:\\File");
			//System.out.println("ɾ���ɹ���");
		}else{
			System.out.println("Ŀ¼�����ڣ�");
			if(file.mkdirs()){//����Ŀ¼ �ɴ�����һ��Ŀ¼
				System.out.println("Ŀ¼�����ɹ���");
				//����showInfos
				showInfos(file);
			}else{
				System.out.println("Ŀ¼����ʧ�ܣ�");
			}
		}
	}
	//�ݹ鷽��
	public static void deleteDirs(String pathname){
		File file = new File(pathname);
		if(file.isFile()){//������ļ� ֱ��ɾ��
			file.delete();
		}else{//Ŀ¼
			File[] lists = file.listFiles();//��ȡ��Ŀ¼
			if(lists!=null){
				for(File files:lists){//File files:lists ��ʾlists ������File
					String path = files.getAbsolutePath();
					System.out.println(path);
					deleteDirs(path);//��������
				}
			}
			file.delete();//ɾ����Ŀ¼
		}
		
		
	}
/*	public static void createFile(){
		//·������д���ڵ�Ҳ����д���ڵ�
		File file = new File("D:\\file.txt");
		if(file.exists()){
			System.out.println("�ļ��Ѵ��ڣ�");
			if(file.delete()){
				System.out.println("ɾ���ɹ���");
			}else{
				System.out.println("ɾ��ʧ�ܣ�");
			}
		}else{
			System.out.println("�ļ������ڣ�");
			try {
				if(file.createNewFile()){
					System.out.println("�ļ������ɹ���");
					//����showInfos
					showInfos(file);
				}
				
			} catch (IOException e) {
				System.out.println("�ļ�����ʧ�ܣ�");
				e.printStackTrace();
			}
		}
	}*/
	public static void showInfos(File file){
		//��ȡ·�� �޸�ʱ�� �ļ���С
		String path = file.getAbsolutePath();
		long length = file.lastModified();
		Date date = new Date(length);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String time = sdf.format(date);//ʱ������ʽ�����ַ���
		System.out.println(path);
		System.out.println(file.length());
		System.out.println("����޸�ʱ�䣺"+time);
	}

}
