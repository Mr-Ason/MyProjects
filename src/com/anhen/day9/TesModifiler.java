package com.anhen.day9;

//import com.anhen.day9.Outer.Inner;

/*static 
 *   ��  ���������ڲ��࣬������Ķ������
 *   ��������  �����౻ʹ�ö��ٴ� �����ִֻ��һ��
 *   ����   ���й��õ�ͳһ������
 *   ����  ���й��õ�ͳһ�ķ���  ֱ�� ����.����  ����
 *   
 *final 
 *   ��   ����಻�ܱ��̳�
 *   ��������    û����
 *   ����    ������ת��δ�����������޸ģ�
 *   ����   ���಻����д������� 
 * 
 * */

public class TesModifiler {

	public static void main(String[] args) {
	//	Inner in = new Inner();
		Outer ou = new Outer();
		Outer ou1 = new Outer();
		
		//���þ�̬���Է���
		
		System.out.println(Outer.name);
		
	}

}

class Outer{
	public   static String name="���þ�̬����";
	{//��static���δ���� ��ô���۴������ٸ����� ��ִֻ��һ��
		name = "ceshi";
		System.out.println("ִ���˴����:"+name);
	}
	public Outer(){//��ִ�д���� ��ִ�й��췽��
		System.out.println("���췽��");
	}
//	static class Inner{
//		
//	}
}
