/*package com.anhen.da1;

import java.util.Scanner;//��������

public class Wan {
	public static void main(String[] args){//������ �������
		System.out.println("�й�JAVA");//��ӡ����
		
		Scanner sc = new Scanner(System.in);//����Scanner
		System.out.println("�������������: ");
		String name = sc.next();//ͨ������̨���������Ϣ
		
		
		System.out.println("������������䣺 ");
		String age = sc.next();
		
		System.out.println("���������: "+name +" ����: "+age);//�����Ϣ
		
	}

}*/
package com.anhen.day1;//��������

import java.util.Scanner;

public class Wan{//��Ķ���
	public static void main(String[] args){//������ �������
		System.out.println("�������������: ");
		Scanner sc = new Scanner(System.in);//����Scanner
		String name = sc.next();//ͨ������̨���������Ϣ
		
		System.out.println("�������������: ");
		String age = sc.next();//ͨ������̨���������Ϣ
		
		
		System.out.println("����: " +name +";����: "+age);
	}
}

