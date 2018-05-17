package com.anhen.day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {
	//通过控制台  计算两个数的和
	@SuppressWarnings("null")
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double num = 0;
		double[] nums = new double[100000];
		while(true){//不知道用户输入多少次 所以用循环
			System.out.println("请输入第一个数：");
			if(sc.hasNextDouble()){//输入的为数字才能继续
			    x = sc.nextDouble(); 
			    break;
			}else{
				System.out.println("输入格式有误！");
			}
			sc.nextLine();
		}
		//捕获异常
		try{
			System.out.println("输入第二个数：");
			y = sc.nextDouble();
			num = x/y;
			System.out.println(num);
		}catch(InputMismatchException e){
			System.out.println("输入格式错误，类型不匹配！");
			e.printStackTrace();
		}catch(ArithmeticException e){//多重捕获 捕获的顺序应从小到大
			System.out.println("除数不能为0！");
			e.printStackTrace();
		}catch(Exception e){ //只有个捕获到指定异常类 才执行
			System.out.println("未知错误 请练习管理员！");
			e.printStackTrace();
		}finally{
			nums = null;//释放资源
			sc.close();
			System.out.println("无论有无异常，都执行的代码");
		}
	}
}
