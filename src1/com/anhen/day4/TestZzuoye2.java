package com.anhen.day4;//包的声明

import java.util.Scanner;

public class TestZzuoye2 {//类的定义
	public static void main(String[] args){//程序入口
		test2();
	}
	
	public static void test1(){
		/*实现一个课程名称和课程代号的转换器：输入下表中的课程代号，输出课程的名称。
		用户可以循环进行输入，如果输入0就退出系统。
		课程名称和课程代号对照表
		
		Java面向对象编程		1
		使用HTML语言开发站点		2	
		使用SQL Server管理和查询数据	3*/
		System.out.println("请输入课程代码！");
		
		outer:while(true){Scanner sc=new Scanner(System.in);
		int bookid=sc.nextInt();
		while(bookid>=0||bookid<=3){
			if(bookid==0){
				System.out.println("已退出系统！");
				break outer;
			}else if(bookid==1){
				System.out.println("Java面向对象编程");
				break;
			}else if(bookid==2){
				System.out.println("使用HTML语言开发站点");
				break;
			}else if(bookid==3){
				System.out.println("使用SQL Server管理和查询数据");
				break;
			}
		}
		}
	}
	public static void test2(){
		/*10.实现万年历推荐实现步骤：
				1.输入年份、月份；判断年份是润年还是平年。
				2.显示当前月份共有多少天？
				3.计算输入年份距离1900年1月1日的天数。
				4.计算输入月份距离1900年1月1日的天数。
				5.计算该月的第一天是星期几？
				提示：当月第一天是星期几：星期日为0，星期一~星期六为1~6、1900年1月1日为星期一
				6.打印输出日历，如果为星期六换行。 
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入年份:");
		int year=sc.nextInt();
		System.out.println("请输入月份:");
		int month=sc.nextInt();
		boolean isF=false;
		   if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("今年是闰年");
			isF=true;
			
		   }else{
			   System.out.println("今年是平年");
			  
		  }  
		
		
			switch(month){
			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
				month=31;
				System.out.println("这个月的天数为31天！");
				break;
			case 4:case 6: case 9:case 11:
				System.out.println("这个月的天数为30天！");
				month=30;
				break;
			case 2:
				if(isF){
		    	System.out.println("这个月的天数为28天！");
		    	month=28;
		    
		    }else{
		    	System.out.println("这个月的天数为29天！");
		    	month=29;
		    	
		    }
		   break;
		    default:
		    	System.out.println("输入月份有误！");
		   }
		int day=0;
		for(int i=1990;i<=year;i++){
			if(isF=true){
				day=day+365;
			}else{
				day=day+366;
			}	
			System.out.println("相隔年的天使："+day);
		
		}
		for(int i=1990;i>=year;i++){
			if(isF=true){
				day=day+365;
			}else{
				day=day+366;
			}	
			System.out.println("相隔年的天使："+day);
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
			System.out.println("相差月："+day2);
		}
	}	
}