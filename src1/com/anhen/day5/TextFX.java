package com.anhen.day5;//��������

import java.util.Scanner;

public class TextFX {//��Ķ���
	public static void main(String[] args){//�ǳ��� �������
		text5();
	}
	public static void text1(){
	/*	//����һ������int a = 654;��дһ��Java���������λ���Ϻͣ�������õĺʹ�ӡ����
		int a,b,c,d;
		a = 654;
		b = a/100;
		c = a%100/10;
		d = a%10;
		System.out.println(b+c+d);*/
		//����һ����������������λ����֮�͡�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int sum = 0;
		while(true){
			sum = a%10;
			sum =a/10;
			String strNum = "";
			switch(sum){
			case 0:
				strNum = "0";
				break;
			case 1:
				strNum = "1";
				break;
			case 2:
				strNum = "2";
				break;
			case 3:
				strNum = "3";
				break;
			case 4:
				strNum = "4";
				break;
			case 5:
				strNum = "5";
				break;
			case 6:
				strNum = "6";
				break;
			case 7:
				strNum = "7";
				break;
			case 8:
				strNum = "8";
				break;
			case 9:
				strNum = "9";
				break;
			}
			System.out.println();
		}
	}
			
	public static void text2(){
		//4��������������int a = 5; int b = 6; int c = 7;�������������������С����
		int a,b,c;
		a = 5;
		b = 6;
		c = 7;
		int max = a>b?b:(a>c?b:c);
		System.out.println(max);
		int min = a<b?a:(a>c?b:c);
		System.out.println(min);
	}
	public static void text3(){
		//������������int a = 5; int b = 6;��дһ��Java���򽻻���������
		
		
		int a = 5;
		int b = 6;
		int temp;
        temp = a;
        a = b;
        b = temp;
		System.out.println("a:"+a+"��"+"b:"+b);
	}
	public static void text4(){
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year =sc.nextInt();
		System.out.println("�������·ݣ�");
		int month =sc.nextInt();
		boolean isF=false;
		if((year %4 ==0 && year %100 !=0) || year%400==0){
			System.out.println("���������꣡");
			isF=true;
		}else{
			System.out.println("������ƽ�꣡");
		}
		switch(month){
		case 1:  case 3:  case 5:  case 7:  case 8  :case 10:  case 12:
			System.out.println("����µ�������31��");
			break;
		case 4:  case 6:  case 9:  case 11:
			System.out.println("����µ�������30��");
			break;
		case 2:
			if(isF=true){
			System.out.println("����µ�������29��");
			}else{
				System.out.println("����µ�������28��");
				
			}
			break;
			default  :
				System.out.println("�����·�����");
		}
	}
	public static void text5(){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����λ����");
		int a =sc.nextInt();
		int bai =a/100;
		int shi = a%100/10;
		int ge = a%10;
		while (true){
			if(bai*bai*bai+shi*shi*shi+ge*ge*ge==a){
		
			System.out.println("�������ˮ�ɻ�����");
			
		}else{
			System.out.println("���������ˮ�ɻ�����");
			
		}
			break;
	}
	}
}
