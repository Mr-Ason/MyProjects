package com.anhen.mytest;
//方法的递归调用
public class digui {

	public static void main(String[] args) {
		int a = sum(1);
		System.out.println("传入的参数为1："+a);
		System.out.println("传入的参数为100："+sum(100));

	}
	public static int sum(int num){
		if(num == 1){
			return 1;
		}else{
			return num + sum(num - 1);
		}
		
	}

}
