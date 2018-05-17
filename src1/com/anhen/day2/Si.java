package com.anhen.day2;

public class Si {
	public static void main(String[] args){
		int a,b;
		a = 4;
		b = 7;
		a = --b;//b减1后才把 值赋给a
		System.out.println("a = --b;后a的值："+a+";a = --b;后b的值："+b);
        b = a++;//a把值赋个b后才加1
        System.out.println("b = a++;后a的值："+a+";b = a++;后b的值："+b);
        
		System.out.println(a);
		System.out.println(b);
	}

}
