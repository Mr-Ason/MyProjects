package com.anhen.day9;
public class Abstact {
	public static void main(String[] args){
		B b = new B();
		int sum= b.sum(20,30);
		int sub= b.min(20, 30);
		System.out.println("sum+"+sum);
		System.out.println("sum+"+sub);
	}

}
abstract class A{
	abstract int min(int x,int y);//Ã»ÓĞ»¨À¨ºÅ
	int sum(int x, int y){
		return x-y;
	}
}
class B extends A{
	int min(int x , int y){
		return x+y;
	}
}














