package com.anhen.day3;

import java.util.Scanner;

public class TextZuoye {
	public static void main(String[] args){
		 //4. 问一名美女是否愿意嫁给你？（0表示不愿意，1表示愿意），
		//如果不愿意 每天一束玫瑰花！每天准时接送上下班！随叫随到！至到她说嫁给你，你们结婚了。
	   // 要求使用while、do-while两种方法实现
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		boolean isyes= true;
		while(isyes){
			if(num==0){
				System.out.println("你愿意、、、");
				System.out.println("每天一束玫瑰花！每天准时接送上下班！");
				break;
			}else if(num==1){
				System.out.println("00");
				break;
			}
		}
		
		
	
	
	}		
}		
	


