package com.anhen.day4;//��������

import java.util.Scanner;

public class TestZzuoye2 {//��Ķ���
	public static void main(String[] args){//�������
		test2();
	}
	
	public static void test1(){
		/*ʵ��һ���γ����ƺͿγ̴��ŵ�ת�����������±��еĿγ̴��ţ�����γ̵����ơ�
		�û�����ѭ���������룬�������0���˳�ϵͳ��
		�γ����ƺͿγ̴��Ŷ��ձ�
		
		Java���������		1
		ʹ��HTML���Կ���վ��		2	
		ʹ��SQL Server����Ͳ�ѯ����	3*/
		System.out.println("������γ̴��룡");
		
		outer:while(true){Scanner sc=new Scanner(System.in);
		int bookid=sc.nextInt();
		while(bookid>=0||bookid<=3){
			if(bookid==0){
				System.out.println("���˳�ϵͳ��");
				break outer;
			}else if(bookid==1){
				System.out.println("Java���������");
				break;
			}else if(bookid==2){
				System.out.println("ʹ��HTML���Կ���վ��");
				break;
			}else if(bookid==3){
				System.out.println("ʹ��SQL Server����Ͳ�ѯ����");
				break;
			}
		}
		}
	}
	public static void test2(){
		/*10.ʵ���������Ƽ�ʵ�ֲ��裺
				1.������ݡ��·ݣ��ж���������껹��ƽ�ꡣ
				2.��ʾ��ǰ�·ݹ��ж����죿
				3.����������ݾ���1900��1��1�յ�������
				4.���������·ݾ���1900��1��1�յ�������
				5.������µĵ�һ�������ڼ���
				��ʾ�����µ�һ�������ڼ���������Ϊ0������һ~������Ϊ1~6��1900��1��1��Ϊ����һ
				6.��ӡ������������Ϊ���������С� 
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("���������:");
		int year=sc.nextInt();
		System.out.println("�������·�:");
		int month=sc.nextInt();
		boolean isF=false;
		   if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("����������");
			isF=true;
			
		   }else{
			   System.out.println("������ƽ��");
			  
		  }  
		
		
			switch(month){
			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
				month=31;
				System.out.println("����µ�����Ϊ31�죡");
				break;
			case 4:case 6: case 9:case 11:
				System.out.println("����µ�����Ϊ30�죡");
				month=30;
				break;
			case 2:
				if(isF){
		    	System.out.println("����µ�����Ϊ28�죡");
		    	month=28;
		    
		    }else{
		    	System.out.println("����µ�����Ϊ29�죡");
		    	month=29;
		    	
		    }
		   break;
		    default:
		    	System.out.println("�����·�����");
		   }
		int day=0;
		for(int i=1990;i<=year;i++){
			if(isF=true){
				day=day+365;
			}else{
				day=day+366;
			}	
			System.out.println("��������ʹ��"+day);
		
		}
		for(int i=1990;i>=year;i++){
			if(isF=true){
				day=day+365;
			}else{
				day=day+366;
			}	
			System.out.println("��������ʹ��"+day);
			break;
		}
		int day2,day3;
		day2 = 0;
		for(int a=0;a<=month;a++ ){
			if(isF=true){
				day2=day-a*30;
				
			}else{
				day2=day-a*30;
				
			}	
			System.out.println("����£�"+day2);
		}
	}	
}