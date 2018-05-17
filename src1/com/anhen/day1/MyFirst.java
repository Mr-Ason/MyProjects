package com.anhen.day1;//包的声明

import java.util.Scanner;//包的引用

public class MyFirst{//类的定义
	//属性
	//方法
	public static void main(String[] args){//非方法 程序入口
		System.out.println("中国java");
		
		Scanner sc = new Scanner(System.in);//调用Scanner 用户接收手动输入
		System.out.println("请输入姓名:");
		String name = sc.next();//通过控制台获得输入信息
		
		System.out.println("请输入你的年龄: ");
		String age = sc.next();
		
		System.out.println("你的姓名是:"+name +"+年龄:"+age);
	}
}




