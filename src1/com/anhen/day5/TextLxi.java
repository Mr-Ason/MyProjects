package com.anhen.day5;

public class TextLxi {
	public static void main(String[] args){
		test1();
	}
	//1������һ��char ���͵����飬����100��������26����ĸ��ֵ��
	//ͳһ������ĸ���ֵĴ�����Math.random()��
	public static void test1(){
		char[] charArray = new char[100];
		//������26��ĸ  65~90
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
