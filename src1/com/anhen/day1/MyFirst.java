package com.anhen.day1;//��������

import java.util.Scanner;//��������

public class MyFirst{//��Ķ���
	//����
	//����
	public static void main(String[] args){//�Ƿ��� �������
		System.out.println("�й�java");
		
		Scanner sc = new Scanner(System.in);//����Scanner �û������ֶ�����
		System.out.println("����������:");
		String name = sc.next();//ͨ������̨���������Ϣ
		
		System.out.println("�������������: ");
		String age = sc.next();
		
		System.out.println("���������:"+name +"+����:"+age);
	}
}




