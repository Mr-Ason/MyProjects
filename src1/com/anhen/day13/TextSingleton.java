package com.anhen.day13;
/*������ʽ��
 *   �ڴ���ֻ����һ�������ʵ��
 *   1����ϵͳ��ҵ���߼�ֻ����һ�������ʵ����һ�����������ҵ������ࡣ������ࡢ���ò����ࣻ
 *   2����һ��������������ϣ������ڴ���Դ���أ�ʹ�õ�����
 *   3�������࣬ʵ�ֹ��ܣ����ظ�ʹ�á�
 *   
 *   ��̬�������̲߳���ȫ����ͬʱ����ʱ����������ͬ�Ķ���
 *   ��̬����찲ȫ
 */
public class TextSingleton {
	public static void main(String [] args){
		
		Singleton single = Singleton.getSingleton();
		Singleton single2 = Singleton.getSingleton();
		
		System.out.println(single==single2);
	}
}
//��̬�����
//class Singleton{
//	//1.˽�о�̬����
//	@SuppressWarnings("unused")
//	private static Singleton singleton;
//	//��̬�����
//	static {
//		singleton = new Singleton();
//	}
//	
//	
//	//2.˽�й��췽��
//	private Singleton(){
//		
//	}
//	//3.��̬���ʷ���
//	public  static Singleton getSingleton(){
//		return null;
//	}	
//}

//��̬����   �ᱻ��������  �����̲߳���ȫ
class Singleton{
	//3.˽�л�һ�������������͵�����
	private static Singleton singleton;//Ĭ��ֵ null
	//1.˽�л����췽��
	private Singleton(){
		
	}
	//2.������̬�Ļ�ø�����󷽷�
	public  static Singleton getSingleton(){
		//singleton = new Singleton();//��������Ϊfalse
		if(singleton==null){
			singleton = new Singleton();
			//return singleton;
		}
		return singleton;
	}
	
}




