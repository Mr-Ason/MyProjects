package com.anhen.day13;
/*����ģʽ��
 *  �ڴ���ֻ����һ�������ʵ��
 *  1����ϵͳ�У�ҵ���߼�ֻ����һ�������ʵ����һ�����������ҵ������ࡣ������ࡢ���ò����ࡣ
 *  2����һ�����а����˴��������ϣ������ڴ���Դ���أ�ʹ�õ��С�
 *  3�������࣬ʵ�ֹ��ܣ����ظ�ʹ�ã�
 *  
 *  ��̬�������̲߳���ȫ  ,��ͬʱ����ʱ������������ͬ�Ķ���
 *  ��̬����飺�̰߳�ȫ 
 * */
public class TestSingleton {

	public static void main(String[] args) {
	/*	Singleton1 sig = Singleton1.getSingleton1();
		Singleton1 sig2 = Singleton1.getSingleton1();
		System.out.println(sig == sig2);//�ж��Ƿ����*/

	}

}
class Singleton2{
	//1.˽�о�̬����
	private static Singleton2 singleton;
	static{
		singleton = new Singleton2();
	}
	//2.˽�й��췽��
	private Singleton2(){}
	//3.��̬��������
	public static Singleton2 getSingleton(){
		return singleton;
		
	}
}

/*//��̬����
class Singleton1{
	//3��˽�л�һ�������������͵�����
	private static Singleton1 singleton;
	//1��˽�л����췽��
	private  Singleton1(){}
	//2��������̬�Ļ�ø������ķ���
	public static Singleton1 getSingleton1(){//��̬����ֻ�ܷ��ʾ�̬����
		if(singleton == null){//��֤ÿ��ֻʵ����һ������
			singleton = new Singleton1();
		}
		
		return singleton;
	}
}*/
