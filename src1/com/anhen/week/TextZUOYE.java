package com.anhen.week;

import java.util.Random;
import java.util.Scanner;

public class TextZUOYE {
	public static void main(String[] args){
		text3();
	}
	public static void text1(){
		/*10.ʵ���������Ƽ�ʵ�ֲ��裺
		1.������ݡ��·ݣ��ж���������껹��ƽ�ꡣ
		2.��ʾ��ǰ�·ݹ��ж����죿
		3.����������ݾ���1900��1��1�յ�������
		4.���������·ݾ���1900��1��1�յ�������
		5.������µĵ�һ�������ڼ���
		��ʾ�����µ�һ�������ڼ���������Ϊ0������һ~������Ϊ1~6��1900��1��1��Ϊ����һ
		6.��ӡ������������Ϊ����������*/
		int day = 0;
		Scanner sc =new Scanner(System.in);
		//1.������ݡ��·ݣ��ж���������껹��ƽ�ꡣ
		System.out.println("��������ݣ� ");
		int year = sc.nextInt();
		System.out.println("�������·ݣ� ");
		int month = sc.nextInt();
		boolean isF= false;
		if((year % 4 ==0 && year % 100!=0) || year % 400==0){
			System.out.println("���������꣡");
			isF =true;
		}else{
			System.out.println("������ƽ�꣡");
		}
		//	2.��ʾ��ǰ�·ݹ��ж����죿
		switch(month){
		    case 1:  case 3: case 5:  case 7:case 8: case 10:  case 12:
			System.out.println("��������Ϊ��31��");
			day = 31;
			break;
		    case 4:  case 6: case 9:  case 11:
		    System.out.println("��������Ϊ��30��");	
		    day = 30;
		    break;
		    case 2:
		    	if(isF=true){
		    		System.out.println("��������Ϊ��29��");
		    		day = 29;
		    	}else{
		    		System.out.println("��������Ϊ��28��");
		    		day = 28;
		    	}
		    break;	
		    default:
		    	System.out.println("�����������");
		}
	    //3.����������ݾ���1900��1��1�յ�������
		int sum = 0;
		for(int a = 1900; a<=year; a++){
			if(isF=true){
				sum += 365;
			}else{
				sum += 366;	
			}
            System.out.println(sum);
		}
		for(int a = 1900; a>=year; a++){
			
			if(isF=true){
				sum += 365;
			}else{
				sum += 366;
			}
            System.out.println(sum);
            break;
		}	
		//4.���������·ݾ���1900��1��1�յ�������
		int days =0;
		days = sum +day;
		System.out.println("��1900���񹲣�"+days+"��");
		//5.������µĵ�һ�������ڼ���
		 int a = 0;//���һ�� ����Ϊa
		 int temp = 1 + days % 7 ;
		 
		 if(temp == 7){
		 a = 0; //����
		 }else{
		 a = temp;
		 }
		 /* ������� */
		 System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		 for(int j = 0; j < a; j++){
		 System.out.print("\t");
		 }
		 for(int m = 1; m <= day; m++){
		 System.out.print( m + "\t");
		 if((days + m) % 7 == 6){
		 System.out.print("\n");
		 }
		 }
	}
	public static void text2(){
		/*2.ץ�ΰ���(�Ӵ��10��ѧ�������������У������ȡһλѧ����
                 ��ץ����ѧ���������ٱ�ץȡ��
                 һֱץ�����һ���ˣ����һ�˽�������ͷ�)���������ݣ� 
		 */
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		String[] chengfa = {"ds"," sd","fd"};
		int xiabiao2 = (int) (Math.random()*chengfa.length);
		Scanner sc = new Scanner(System.in);
		for(int e : array){//��ӡarray
			System.out.print(e+"\t " );
		}
		for(int j = 1;j<10;j++){//��������������ȵ��ж�
			int xiabiao = (int) (Math.random()*array.length);
		//�����������
			System.out.println("\n�������һ�����ӿ�ʼ��");
			sc.nextLine();
//			int nums= sc.nextInt();
			
			System.out.println("��ץ�� �ǣ�"+array[xiabiao]);
			
			int[] newArray = new int[array.length - 1];
			//��array.length ���ж�
			for(int i = 0;i<newArray.length;i++){
				if(i< xiabiao){
						newArray[i] = array[i];
					}else{
						newArray[i] = array[i+1];
					}
				}
					array = newArray;
					newArray = null;
					System.out.println("ʣ�µ��ǣ�");
					for(int e:array){
						System.out.print(e +"\t");
						
		}
	}
		System.out.println("�ͷ��ǣ� "+chengfa[xiabiao2]);
	}
	public static void text3(){
		//��ҳ
		System.out.println("*****************************\n*             �ͻ���Ϣ����ϵͳ                   *\n*****************************");
		System.out.println("1. �� ʾ �� �� �� �� �� Ϣ");
		System.out.println("2. �� �� �� �� �� Ϣ");
		System.out.println("3. �� �� �� �� �� Ϣ");
		System.out.println("4. �� ѯ �� �� �� Ϣ");
		System.out.println("*****************************");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String[][] users ={{"1001\t","С��\t","12��15��\t","1000\t","\n"},{"1002\t","����\t","13��32��\t","200\t","\n"},{"1003\t","С��\t","11��1��\t","2500\t","\n"},}; 
		while(num==1){//��ӡ��
			System.out.print("���пͻ���Ϣ���£�\n");
			for(int i = 0;i<users.length;i++){
				for(int j = 0;j<users[i].length;j++){
					System.out.print(users[i][j]);
		         }
	        }
			break;
		}
		
		while(num==2){//��ӿͻ���Ϣ
			String[][] newArray=new String[users.length+1][4];
			for(int i=0;i<users.length;i++){
				for(int j=0;j<users[i].length;j++){
					if(i == newArray.length-1){
						newArray[i][0] ="1005";
						newArray[i][1] ="С��";
						newArray[i][2] ="2�� 20��";
						newArray[i][3] ="1010";
					}else{
						newArray[i][j] = users[i][j];//�Ӷ��  �� i  j   ��1
					}
				}
				users = null;
				users = newArray;
			}
			break;
		}
		for(int i = 0;i<users.length;i++){
			for(int j = 0;j<users[i].length;j++){
				System.out.print(users[i][j]);
	         }
        }
    }
}