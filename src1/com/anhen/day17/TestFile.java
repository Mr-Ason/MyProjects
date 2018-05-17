package com.anhen.day17;
//�����ļ� Ŀ¼  ���һ�ȡ·�� ��С ʱ��
/*try{}eatch(Exception e){}  ���봦���쳣  û��try�Ļ�
 * �����쳣�ᵼ�³�����
 * 
 */
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class TestFile {

	public static void main(String[] args) {
		//�����ļ�
		createFile();
		//����Ŀ¼
		createDirs();
		
		
	}
	public static void createDirs(){
		//����Fileʵ��
		File file = new File("D:\\book\\mybook\\text\\book.txt");
		if(file.exists()){
			System.out.println("Ŀ¼�Ѵ��ڣ�");
			//ɾ��Ŀ¼
			//files.delete();//ֻ��ɾ��һ��Ŀ¼
//		    File files = new File("D:\\book");
//		    files.delete();
			//System.out.println("ɾ���ɹ���");
			deleteDirs("D:\\book");
		}else{
			System.out.println("Ŀ¼�����ڣ�");
			try {
				if(file.mkdirs()){//�Ƽ�  file.mkdir();ֻ����һ��Ŀ¼
				System.out.println("Ŀ¼�����ɹ���");
				//�鿴Ŀ¼��Ϣ
				showInfos(file);
			}else{
				System.out.println("Ŀ¼����ʧ�ܣ�");
			}
		}catch(Exception e){
			System.out.println("����ʧ�ܣ�");
			e.printStackTrace();
		}
	}
		
}
	//�ݹ鷽��
	public static void deleteDirs(String pathname){
		File file = new File(pathname);
		if(file.isFile()){//�ļ�
			file.delete();  //ɾ���ļ�
		}else{//Ŀ¼
			File[] lists = file.listFiles();//��ȡ��Ŀ¼File
			if(lists != null){
				for(File files:lists){
					String path = files.getAbsolutePath();//�����Ŀ¼
					System.out.println(path);
					deleteDirs(path);//��������  ɾ������
					
				}
			}
		file.delete();//ɾ���Լ�
		
		}
//		File[] lists =file.listFiles();
//		for(int i = 0;i<lists.length ;i++){
//			System.out.println(lists[i]);
//		}	
	}
	
	public static void createFile(){// �����ʼۼ� book 
		File file = new File("D:\\book.text");// �����Ķ�   ��ʲô����
		if(file.exists()){
			System.out.println("�ļ��Ѵ���");
			if(file.delete()){
				System.out.println("ɾ���ɹ���");
			}else{
				System.out.println("ɾ��ʧ�ܣ�");
			}
		}else{
			System.out.println("�ļ�������");
			try {
				if(file.createNewFile()){
					System.out.println("�ļ������ɹ���");
					//�鿴�ļ���Ϣ
					showInfos(file);
				}
			} catch (IOException e) {
				System.out.println("�ļ�����ʧ��");
				e.printStackTrace();
			}
		}
	}
	public static void showInfos(File file){
		//��ȡ ·��  �޸�ʱ�� ��С
		String path = file.getAbsolutePath();//·��
		long length = file.lastModified();
		Date date = new Date(length);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String time = sdf.format(date);//ʱ������ʽ�����ַ���
		System.out.println("·��:"+path);
		System.out.println("��С;"+file.length());
		
		System.out.println("����޸�ʱ�䣺"+time);
		
		
		
	}

}
