package com.anhen.week;

import java.util.Random;
import java.util.Scanner;

public class TextZUOYE {
	public static void main(String[] args){
		text3();
	}
	public static void text1(){
		/*10.实现万年历推荐实现步骤：
		1.输入年份、月份；判断年份是润年还是平年。
		2.显示当前月份共有多少天？
		3.计算输入年份距离1900年1月1日的天数。
		4.计算输入月份距离1900年1月1日的天数。
		5.计算该月的第一天是星期几？
		提示：当月第一天是星期几：星期日为0，星期一~星期六为1~6、1900年1月1日为星期一
		6.打印输出日历，如果为星期六换行*/
		int day = 0;
		Scanner sc =new Scanner(System.in);
		//1.输入年份、月份；判断年份是润年还是平年。
		System.out.println("请输入年份： ");
		int year = sc.nextInt();
		System.out.println("请输入月份： ");
		int month = sc.nextInt();
		boolean isF= false;
		if((year % 4 ==0 && year % 100!=0) || year % 400==0){
			System.out.println("这年是闰年！");
			isF =true;
		}else{
			System.out.println("这年是平年！");
		}
		//	2.显示当前月份共有多少天？
		switch(month){
		    case 1:  case 3: case 5:  case 7:case 8: case 10:  case 12:
			System.out.println("此月天数为：31天");
			day = 31;
			break;
		    case 4:  case 6: case 9:  case 11:
		    System.out.println("次月天数为：30天");	
		    day = 30;
		    break;
		    case 2:
		    	if(isF=true){
		    		System.out.println("此月天数为：29天");
		    		day = 29;
		    	}else{
		    		System.out.println("此月天数为：28天");
		    		day = 28;
		    	}
		    break;	
		    default:
		    	System.out.println("输入年份有误！");
		}
	    //3.计算输入年份距离1900年1月1日的天数。
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
		//4.计算输入月份距离1900年1月1日的天数。
		int days =0;
		days = sum +day;
		System.out.println("从1900年距今共："+days+"天");
		//5.计算该月的第一天是星期几？
		 int a = 0;//设第一天 天数为a
		 int temp = 1 + days % 7 ;
		 
		 if(temp == 7){
		 a = 0; //周日
		 }else{
		 a = temp;
		 }
		 /* 输出日历 */
		 System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
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
		/*2.抓阄案例(从存放10个学生姓名的数组中，随机获取一位学生，
                 被抓过的学生，不能再被抓取，
                 一直抓到最后一个人，最后一人接受随机惩罚)（数组缩容） 
		 */
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		String[] chengfa = {"ds"," sd","fd"};
		int xiabiao2 = (int) (Math.random()*chengfa.length);
		Scanner sc = new Scanner(System.in);
		for(int e : array){//打印array
			System.out.print(e+"\t " );
		}
		for(int j = 1;j<10;j++){//用于随机函数长度的判断
			int xiabiao = (int) (Math.random()*array.length);
		//产生随机函数
			System.out.println("\n随便输入一个数子开始！");
			sc.nextLine();
//			int nums= sc.nextInt();
			
			System.out.println("被抓的 是："+array[xiabiao]);
			
			int[] newArray = new int[array.length - 1];
			//对array.length 做判断
			for(int i = 0;i<newArray.length;i++){
				if(i< xiabiao){
						newArray[i] = array[i];
					}else{
						newArray[i] = array[i+1];
					}
				}
					array = newArray;
					newArray = null;
					System.out.println("剩下的是：");
					for(int e:array){
						System.out.print(e +"\t");
						
		}
	}
		System.out.println("惩罚是： "+chengfa[xiabiao2]);
	}
	public static void text3(){
		//首页
		System.out.println("*****************************\n*             客户信息管理系统                   *\n*****************************");
		System.out.println("1. 显 示 所 有 客 户 信 息");
		System.out.println("2. 添 加 客 户 信 息");
		System.out.println("3. 修 改 客 户 信 息");
		System.out.println("4. 查 询 客 户 信 息");
		System.out.println("*****************************");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String[][] users ={{"1001\t","小王\t","12月15日\t","1000\t","\n"},{"1002\t","张三\t","13月32日\t","200\t","\n"},{"1003\t","小明\t","11月1日\t","2500\t","\n"},}; 
		while(num==1){//打印表
			System.out.print("所有客户信息如下：\n");
			for(int i = 0;i<users.length;i++){
				for(int j = 0;j<users[i].length;j++){
					System.out.print(users[i][j]);
		         }
	        }
			break;
		}
		
		while(num==2){//添加客户信息
			String[][] newArray=new String[users.length+1][4];
			for(int i=0;i<users.length;i++){
				for(int j=0;j<users[i].length;j++){
					if(i == newArray.length-1){
						newArray[i][0] ="1005";
						newArray[i][1] ="小李";
						newArray[i][2] ="2月 20日";
						newArray[i][3] ="1010";
					}else{
						newArray[i][j] = users[i][j];//加多个  对 i  j   减1
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