package com.anhen.day3;

import java.util.Scanner;

public class Lianxi {
	public static void main(String[] args){
		System.out.println("请输入任意年份 换行 月份");
	    Scanner sc=new Scanner(System.in);
	    double year = sc.nextDouble();
	    int month = sc.nextInt();
	
	    if ((year%4==0&&year%100!=0)||year%400==0){
		    System.out.println("闰年");
	     }else{
		   System.out.println("平年");
	     }
	
	    if(month>12||month<0){
		    System.out.println("年份过大");
	    }else if(month%2!=0&&month==8){
		    System.out.println("31");
	    }else if(month%2==0){
		    System.out.println("30");
	    }
		
		}
		
  }


