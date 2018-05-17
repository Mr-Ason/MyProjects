package com.anhen.day5;//包的声明

import java.util.Scanner;

public class TextFX {//类的定义
	public static void main(String[] args){//非程序 程序入口
		text5();
	}
	public static void text1(){
	/*	//给定一个变量int a = 654;请写一个Java程序求各个位数上和，并把求得的和打印出来
		int a,b,c,d;
		a = 654;
		b = a/100;
		c = a%100/10;
		d = a%10;
		System.out.println(b+c+d);*/
		//给定一个变量，求出其各个位上数之和。
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
		//4、给定三个变量int a = 5; int b = 6; int c = 7;请求出其中最大的数和最小的数
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
		//给定两个变量int a = 5; int b = 6;请写一个Java程序交换这两个数
		
		
		int a = 5;
		int b = 6;
		int temp;
        temp = a;
        a = b;
        b = temp;
		System.out.println("a:"+a+"和"+"b:"+b);
	}
	public static void text4(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year =sc.nextInt();
		System.out.println("请输入月份：");
		int month =sc.nextInt();
		boolean isF=false;
		if((year %4 ==0 && year %100 !=0) || year%400==0){
			System.out.println("这年是闰年！");
			isF=true;
		}else{
			System.out.println("请输入平年！");
		}
		switch(month){
		case 1:  case 3:  case 5:  case 7:  case 8  :case 10:  case 12:
			System.out.println("这个月的天数是31天");
			break;
		case 4:  case 6:  case 9:  case 11:
			System.out.println("这个月的天数是30天");
			break;
		case 2:
			if(isF=true){
			System.out.println("这个月的天数是29天");
			}else{
				System.out.println("这个月的天数是28天");
				
			}
			break;
			default  :
				System.out.println("输入月份有误！");
		}
	}
	public static void text5(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个三位数！");
		int a =sc.nextInt();
		int bai =a/100;
		int shi = a%100/10;
		int ge = a%10;
		while (true){
			if(bai*bai*bai+shi*shi*shi+ge*ge*ge==a){
		
			System.out.println("这个数是水仙花数！");
			
		}else{
			System.out.println("这个数不是水仙花数！");
			
		}
			break;
	}
	}
}
