package com.ljd.java001;

import java.util.Scanner;

public class Java001 {
/**
 * �������⣺�ݹ��ʱ������Ż�
 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ�
 * �������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣�
 */
	 public static void main(String[] args){
		System.out.println("�����·ݣ�");
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();//��ȡ���������
		 long t0 = System.currentTimeMillis();
		 System.out.println("��"+n+"�������ӵ�������"+fun01(n));
		 long t1 =System.currentTimeMillis();
		 System.out.println(t1-t0);
		
	 } 
	 public static int fun01(int n){
		 if(n==0){
			 return 0;
		 }else if(n==1||n==2){
			 return 1;
		 }else{
			 return fun01(n-1)+fun01(n-2);
		 }
	 }
	 public static double fun02(int n){
		 double a = Math.sqrt(5);
		 double b = 1/a;
		 double c = Math.pow((1+a)/2, n);
		 double d = Math.pow((1-a)/2, n);
		 double e = b*(c-d);
		 return e;
	 }
}

