package com.anhen.week;

import java.util.Scanner;

public class Textjie {
	 public static  void main(String[] args) {
			
		 int days = 0; 
		 boolean isrun=false;
		 //�������·�
		 Scanner input = new Scanner(System.in);
		 System.out.print("��������ݺ��·ݣ�");
		int years = input.nextInt();
		 
		int month =input.nextInt();
		
		 //�ж��Ƿ�������
		 if((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)){
		 isrun=true;
		 System.out.println(years+"������");
		 }else{
			 System.out.println(years+"��ƽ��");
		 }
		 int totalDays = 0; //�ۼ�����
		 //�������1900��1��1�յ�����
		 for(int i = 1900; i < years; i++){
		 if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
		 totalDays = totalDays + 366;
		 }else{
		 totalDays = totalDays + 365;
		 }
		
		 }
		 System.out.println("��1900��"+years+"��"+totalDays);
		 int beforeDays = 0;
		 //�����·��ж�����
		 for(int j = 1; j <= month; j++){
		 switch(j){
		 case 1:
		 case 3:
		 case 5:
		 case 7:
		 case 8:
		 case 10:
		 case 12:
		 days = 31;
		 break;
		 case 4:
		 case 6:
		 case 9:
		 case 11:
		 days = 30;
		 break;
		 case 2:
		 if(isrun){
		  days = 29;
		 }else{
		  days = 28;
		 }
		 default:
		
		 }
		 if(j < month){
		 beforeDays = beforeDays + days;
		 }
		 }
		 totalDays = totalDays + beforeDays; //ͳ�Ƶ�Ŀǰ��������
		 System.out.println("��1900�굽"+years+"��"+month+"��"+"��"+totalDays+"��");
		 int firstDayOfMonth = 0;
		 int temp = 1 + totalDays % 7 ;
		 
		 if(temp == 7){
		 firstDayOfMonth = 0; //����
		 }else{
		 firstDayOfMonth = temp;
		 }
		 /* ������� */
		 System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		 for(int k = 0; k < firstDayOfMonth; k++){
		 System.out.print("\t");
		 }
		 for(int m = 1; m <= days; m++){
		 System.out.print( m + "\t");
		 if((totalDays + m) % 7 == 6){
		 System.out.print("\n");
		 }
		 }
		 }

}



