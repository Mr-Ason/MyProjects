package com.anhen.day5;

public class TextLxi {
	public static void main(String[] args){
		test1();
	}
	//1、定义一个char 类型的数组，长度100，随机存放26个字母的值，
	//统一各个字母出现的次数。Math.random()；
	public static void test1(){
		char[] charArray = new char[100];
		//随机存放26字母  65~90
		System.out.println((char)65);
		for(int i=0;i<charArray.length;i++){
			System.out.println(Math.random());//[0,1)
			charArray[i] = (char)(65 + (int)(Math.random() * 26));
		}
		for(char e : charArray){
			System.out.println(e);
			if(e ==65){
				System.out.println(e);
			}
		}
	}
	public static void test2(){
		
	}
}
