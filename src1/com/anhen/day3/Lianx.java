package com.anhen.day3;

import java.util.Scanner;

public class Lianx {
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int bai = num / 100;
		System.out.println("bai = num / 100:"+bai);
		int shi = num % 100 / 10;
		System.out.println("shi = num % 100 / 10:"+shi);
		int ge =  num % 10;
		System.out.println("ge =  num % 10:"+ge);
		if(num>1000||num<0){
			System.out.println("非法数字");
		}
		if((ge*ge*ge+shi*shi*shi+bai*bai*bai)==num){
			System.out.println("三数和："+num);
			
		}else{
			System.out.println("非三位数");
		}
			}
		}