package com.anhen.day3;

import java.util.Scanner;

public class TextZuoye {
	public static void main(String[] args){
		 //4. ��һ����Ů�Ƿ�Ը��޸��㣿��0��ʾ��Ը�⣬1��ʾԸ�⣩��
		//�����Ը�� ÿ��һ��õ�廨��ÿ��׼ʱ�������°࣡����浽��������˵�޸��㣬���ǽ���ˡ�
	   // Ҫ��ʹ��while��do-while���ַ���ʵ��
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		boolean isyes= true;
		while(isyes){
			if(num==0){
				System.out.println("��Ը�⡢����");
				System.out.println("ÿ��һ��õ�廨��ÿ��׼ʱ�������°࣡");
				break;
			}else if(num==1){
				System.out.println("00");
				break;
			}
		}
		
		
	
	
	}		
}		
	


