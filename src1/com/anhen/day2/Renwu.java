package com.anhen.day2;//包的声明

import java.util.Scanner;//包的引用

public class Renwu {//类的定义
	public static void main(String[] args){//非主程序 程序入口
		//2、使用算术运算符，实现计算器功能。
		System.out.println("简单计算器");
		Scanner sc=new Scanner(System.in);//Scanner 包的引用
		
		System.out.println("被加数");
		Double num1=sc.nextDouble();//用户接收通过控制台手动输入
		
		System.out.println("加数");
		Double num2=sc.nextDouble();
		
		 
		System.out.println(num1+num2); //控制台输出
		
	}
   

}
