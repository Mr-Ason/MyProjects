package com.anhen.day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TextTryException {
	//ͨ������̨ �����������ֵĺ�
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double[] nums = new double[10]; 
		while(true){
			System.out.println("��һ������");
			if(sc.hasNextDouble()){
				x = sc.nextDouble();
				break;
			}else{
				System.out.println("�������");
			}
			sc.nextLine();
		}
		try{
			System.out.println("�ڶ�������");
		    y = sc.nextDouble();
		 }catch(InputMismatchException e){//ֻ�в���ָ���쳣����ʱ��ִ��
			System.out.println("�������");
			e.printStackTrace();
		}finally{//���۲����쳣����ִ��һ��
			nums = null;//�ͷ���Դ
			System.out.println("���������쳣������ִ�еĴ��룡");
		}
		System.out.println(x+y);
		    sc.close();
	}

}
