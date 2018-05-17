package com.anhen.day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextTryException {
	//通过控制台 计算两个数字的和
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double[] nums = new double[10]; 
		while(true){
			System.out.println("第一个数：");
			if(sc.hasNextDouble()){
				x = sc.nextDouble();
				break;
			}else{
				System.out.println("输入错误！");
			}
			sc.nextLine();
		}
		try{
			System.out.println("第二个数：");
		    y = sc.nextDouble();
		 }catch(InputMismatchException e){//只有捕获到指定异常类型时才执行
			System.out.println("输入错误！");
			e.printStackTrace();
		}finally{//无论捕获到异常都会执行一次
			nums = null;//释放资源
			System.out.println("无论有无异常，都有执行的代码！");
		}
		System.out.println(x+y);
		    sc.close();
	}

}
