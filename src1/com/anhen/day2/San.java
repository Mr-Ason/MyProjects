package com.anhen.day2;

public class San {
	public static void main(String[] args){
		int a,b,c,d;
		a = 654;
		b = a/100;
		System.out.println("b==6£º"+b);
		c = b--;//a%100/10  
		System.out.println("c==6£º"+c);
		System.out.println("b==5£º"+b);
		d = --c;//a%10
		System.out.println("d==5£º"+d);
		System.out.println("c==5£º"+c);
		System.out.println("==============");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b+c+d);
	}

}
