package com.anhen.day15;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TextProperties {
	public static void main(String[] args){
		//����properties(���Լ�)����
		Properties pro = new Properties();
		//����InputStream���ӿڣ�����
		InputStream input = TextProperties.class.getResourceAsStream("data");//���丳ֵ ������Ҫ˼�룺���class�ļ�		
		try{
			pro.load(input);//�������Լ��ļ�
			//1���û���¼
			String user = pro.getProperty("�û�����"+"userId");
			String pwd = pro.getProperty("�û����룺"+"passWord");
			if("admin".equals(user)&&"123423".equals(pwd)){
				System.out.println(pro.getProperty("��¼�ɹ���"));
			}else{
				System.out.println(pro.getProperty("��¼ʧ�ܣ�"));
			}
			System.out.println(pro.getProperty("userId"));
			System.out.println(pro.getProperty("passWord"));
			System.out.println(pro.getProperty("product"));
		}catch(IOException e){
		e.printStackTrace();
		}		
	}
}

/////���Թ��� ����ָ������
//class Factor{
//	private Factor(){//�ⲿ�����Է���
//		
//	}
//	public static Computer getComputer(String type) throws ClassNotFoundException , InstantiationException, IllegalAccessException{
//			Computer computer= null;
//			//switch �� Class ֻ����һ
////			switch(type){
////					case "PC":{
////					computer  = new PC();
////					break;
////				}
////					case "NoteBook":{
////					computer  = new NoteBook();
////					break;
////				}
////					default:
////					{
////						System.out.println("��Ʒ��������");
////				}
////	       }
//			//����
//			//ͨ���������Class�����
//			@SuppressWarnings("rawtypes")
//			Class clazz = Class.forName("com.anhen.day15."+type);
//			//������ʵ��
//			computer =(Computer) clazz.newInstance();
//	        return computer;
//    }
//	
//}	
////���� NoteBook
//class NoteBook extends Computer{
//	public  NoteBook(){
//		
//	}
//	public NoteBook(String name){
//		super(name);
//	}
//	@Override
//	public void show() {
//		System.out.println("����һ̨NoetBook���ԣ�");
//		
//	}
//		
//}
////���� PC
//class PC extends Computer{
//	public PC(){
//		
//	}
//	public PC(String name){
//		super(name);
//	}
//
//	@Override
//	public void show() {
//		System.out.println("����һ̨pc���ԣ�");
//		
//	}
//	
//}
//
////������
//abstract class Computer{
//	private String name;//Ʒ��
//
//	public Computer(){
//		
//	}
//	public Computer(String name){
//		this.name = name;
//	}
//	//ʵ�ַ���
//	public void work(){
//		System.out.println("���ڹ���������");
//	}
//	//���󷽷� ����ʵ��
//	public abstract void show();
//		
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
// }	
