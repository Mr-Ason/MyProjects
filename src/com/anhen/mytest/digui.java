package com.anhen.mytest;
//�����ĵݹ����
public class digui {

	public static void main(String[] args) {
		int a = sum(1);
		System.out.println("����Ĳ���Ϊ1��"+a);
		System.out.println("����Ĳ���Ϊ100��"+sum(100));

	}
	public static int sum(int num){
		if(num == 1){
			return 1;
		}else{
			return num + sum(num - 1);
		}
		
	}

}
