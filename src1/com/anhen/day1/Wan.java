/*package com.anhen.da1;

import java.util.Scanner;//包的引用

public class Wan {
	public static void main(String[] args){//主方法 程序入口
		System.out.println("中国JAVA");//打印文字
		
		Scanner sc = new Scanner(System.in);//调用Scanner
		System.out.println("请输入你的名字: ");
		String name = sc.next();//通过控制台获得输入信息
		
		
		System.out.println("请输入你的年龄： ");
		String age = sc.next();
		
		System.out.println("你的姓名是: "+name +" 年龄: "+age);//输出信息
		
	}

}*/
package com.anhen.day1;//包的声明

import java.util.Scanner;

public class Wan{//类的定义
	public static void main(String[] args){//主程序 程序入口
		System.out.println("请输入你的姓名: ");
		Scanner sc = new Scanner(System.in);//调用Scanner
		String name = sc.next();//通过控制台获得输入信息
		
		System.out.println("请输入你的年龄: ");
		String age = sc.next();//通过控制台获得输入信息
		
		
		System.out.println("姓名: " +name +";年龄: "+age);
	}
}

