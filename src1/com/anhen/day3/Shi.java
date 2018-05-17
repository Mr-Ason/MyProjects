package com.anhen.day3;

import java.util.Scanner;

public class Shi {
	public  static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score>100||score<0){
			System.out.println("输入成绩无效，请重新输入");
		}else {
			if(score>=90){
				System.out.println("A");
			}else if(score>=80){
				System.out.println("B");
			}else if(score>=60){
				System.out.println("C");
			}
		}
		
	}

}
