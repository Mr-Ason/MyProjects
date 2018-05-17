package com.anhen.mytest;

public class chongzai {
	public static void main(String[] args){
		float a = add(2,3);
		System.out.println(a);
		
		float b = add(1.0f,2.0f);
		System.out.println(b);
	}
	public static float add(float x,float y){
	float sum = 0;
	sum = x+y;
	return sum;
}
	public static float add(int x,int y){
		float sum = 0;
		sum = x+y;
		return sum;
	}

}

