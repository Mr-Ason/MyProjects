package com.anhen.day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {
	//ͨ������̨  �����������ĺ�
	@SuppressWarnings("null")
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double num = 0;
		double[] nums = new double[100000];
		while(true){//��֪���û�������ٴ� ������ѭ��
			System.out.println("�������һ������");
			if(sc.hasNextDouble()){//�����Ϊ���ֲ��ܼ���
			    x = sc.nextDouble(); 
			    break;
			}else{
				System.out.println("�����ʽ����");
			}
			sc.nextLine();
		}
		//�����쳣
		try{
			System.out.println("����ڶ�������");
			y = sc.nextDouble();
			num = x/y;
			System.out.println(num);
		}catch(InputMismatchException e){
			System.out.println("�����ʽ�������Ͳ�ƥ�䣡");
			e.printStackTrace();
		}catch(ArithmeticException e){//���ز��� �����˳��Ӧ��С����
			System.out.println("��������Ϊ0��");
			e.printStackTrace();
		}catch(Exception e){ //ֻ�и�����ָ���쳣�� ��ִ��
			System.out.println("δ֪���� ����ϰ����Ա��");
			e.printStackTrace();
		}finally{
			nums = null;//�ͷ���Դ
			sc.close();
			System.out.println("���������쳣����ִ�еĴ���");
		}
	}
}
