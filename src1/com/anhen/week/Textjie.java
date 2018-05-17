package com.anhen.week;

import java.util.Scanner;

public class Textjie {
	 public static  void main(String[] args) {
			
		 int days = 0; 
		 boolean isrun=false;
		 //输入年月分
		 Scanner input = new Scanner(System.in);
		 System.out.print("请输入年份和月份：");
		int years = input.nextInt();
		 
		int month =input.nextInt();
		
		 //判断是否是闰年
		 if((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)){
		 isrun=true;
		 System.out.println(years+"是闰年");
		 }else{
			 System.out.println(years+"是平年");
		 }
		 int totalDays = 0; //累计天数
		 //计算距离1900年1月1日的天数
		 for(int i = 1900; i < years; i++){
		 if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
		 totalDays = totalDays + 366;
		 }else{
		 totalDays = totalDays + 365;
		 }
		
		 }
		 System.out.println("从1900到"+years+"共"+totalDays);
		 int beforeDays = 0;
		 //根据月份判断天数
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
		 totalDays = totalDays + beforeDays; //统计到目前的棕天数
		 System.out.println("从1900年到"+years+"年"+month+"月"+"共"+totalDays+"天");
		 int firstDayOfMonth = 0;
		 int temp = 1 + totalDays % 7 ;
		 
		 if(temp == 7){
		 firstDayOfMonth = 0; //周日
		 }else{
		 firstDayOfMonth = temp;
		 }
		 /* 输出日历 */
		 System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
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



