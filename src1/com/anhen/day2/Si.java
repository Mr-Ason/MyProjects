package com.anhen.day2;

public class Si {
	public static void main(String[] args){
		int a,b;
		a = 4;
		b = 7;
		a = --b;//b��1��Ű� ֵ����a
		System.out.println("a = --b;��a��ֵ��"+a+";a = --b;��b��ֵ��"+b);
        b = a++;//a��ֵ����b��ż�1
        System.out.println("b = a++;��a��ֵ��"+a+";b = a++;��b��ֵ��"+b);
        
		System.out.println(a);
		System.out.println(b);
	}

}
