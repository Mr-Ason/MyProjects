package com.ljd.java001;

import java.util.Scanner;

public class Java001 {
/**
 * 存在问题：递归耗时，如何优化
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子对数为多少？
 */
	 public static void main(String[] args){
		System.out.println("输入月份：");
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();//获取输入的整数
		 long t0 = System.currentTimeMillis();
		 System.out.println("第"+n+"个月兔子的总数："+fun01(n));
		 long t1 =System.currentTimeMillis();
		 System.out.println(t1-t0);
		
	 } 
	 public static int fun01(int n){
		 if(n==0){
			 return 0;
		 }else if(n==1||n==2){
			 return 1;
		 }else{
			 return fun01(n-1)+fun01(n-2);
		 }
	 }
	 public static double fun02(int n){
		 double a = Math.sqrt(5);
		 double b = 1/a;
		 double c = Math.pow((1+a)/2, n);
		 double d = Math.pow((1-a)/2, n);
		 double e = b*(c-d);
		 return e;
	 }
}

