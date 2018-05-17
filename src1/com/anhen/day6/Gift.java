package com.anhen.day6;

public class Gift {//类的定义（创造的类）
	//属性
	public String name;//名称
	public double price;//价格
	
	//方法
	public void run(String name){
		System.out.println("礼品名："+name);
	}
	public void run(double price){
		System.out.println("礼品价格："+price);
	}
	public void show(String name,double price){
		System.out.println("礼品名："+name+"\n"+"礼品价格："+price);
	}
}
