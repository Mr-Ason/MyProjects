package com.anhen.day2;//��������

import java.util.Scanner;

public class renwu1 {//��Ķ���
	//����
	//����
	public static void main(String[] args){//�ǳ��� �������
		System.out.println("��ӭʹ��Ա������ϵͳ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);//����Scanner �û����� �ֶ�����
		System.out.println("���: ");
	    String bianhao = sc.next();
		System.out.println("����: ");
		String xingming = sc.next();
		System.out.println("����: ");
	    String nianling = sc.next();
	    System.out.println("����: ");
	    String youxiang = sc.next();
	    System.out.println("��ַ: ");
	    String dizhi = sc.next();
	    System.out.println("�Ա�: ");
	    String sex = sc.next();
	    System.out.println("���: " +bianhao+"+����"+xingming+"+����"+nianling+"+����"+youxiang+"+��ַ"+dizhi+"�Ա�"+sex);
		
	}

}
