package com.anhen.day2;//包的声明

import java.util.Scanner;

public class renwu1 {//类的定义
	//属性
	//方法
	public static void main(String[] args){//非程序 程序入口
		System.out.println("欢迎使用员工管理系统");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);//调用Scanner 用户接收 手动输入
		System.out.println("编号: ");
	    String bianhao = sc.next();
		System.out.println("姓名: ");
		String xingming = sc.next();
		System.out.println("年龄: ");
	    String nianling = sc.next();
	    System.out.println("邮箱: ");
	    String youxiang = sc.next();
	    System.out.println("地址: ");
	    String dizhi = sc.next();
	    System.out.println("性别: ");
	    String sex = sc.next();
	    System.out.println("编号: " +bianhao+"+姓名"+xingming+"+年龄"+nianling+"+邮箱"+youxiang+"+地址"+dizhi+"性别"+sex);
		
	}

}
