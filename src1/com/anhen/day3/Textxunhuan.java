package com.anhen.day3;
/*循环结构：反复执行循环体代码的机构
 *     while  do。。。while   for
 *     1、while（条件表达式）{
 *            循环代码
 *     }
 *     2、do、、、、while
 *      do{
 *          循环体
 *          迭代语句
 *      }while()
 * while 和 do...while 的区别：
 *     do、、、while 至少执行一次循环代码
 *     while必须满足条件表达式才执行循环体代码
 */
public class Textxunhuan {
	
	public static void main(String[] args){
		test4();
	}
	//3、请根据程序说出运行结果
	public static void test5(){
	int i =1,j =10; 
	do {
	   i = i + 1;
	   j = j - 1;
	   if (i < j) {
	   break;  //提示这里break语句是终止循环
	   }
	   } while (i <5); 
	   System.out.println("i = " +i+ "and j = "+j); 
	}
	//1、给定一个数字int a = 32932792;请把变量a翻译成中文的大写数字
	public static void test4(){
		int a = 1234567890;
		//获取各个位的数字
		//转换
		int num = 0;
		String str="";
		while(a>0){
			num = a%10;//没次取最后一位
			a /= 10;
			System.out.println(num);
			String strNum ="";
			switch(num){
			case 0:
				strNum = "零";
				break;
			case 1:
				strNum = "一";
				break;
			case 2:
				strNum = "二";
				break;
			case 3:
				strNum = "三";
				break;
			case 4:
				strNum = "四";
				break;
			case 5:
				strNum = "五";
				break;
			case 6:
				strNum = "六";
				break;
			case 7:
				strNum = "七";
				break;
				
			case 8:
				strNum = "八";
				break;
			case 9:
				strNum = "九";
				break;
			}
			str = strNum + str;
		}
		System.out.println(str);
	}
	//1~1000奇数之和
    public static void test3(){
    	int i = 1;
    	int sum = 0;
    	do {
    		if(i%2!=0){
    			sum +=i;
    		}
    		i++;
    	}while(i<1001);
    		System.out.println("奇数之和 :"+sum);
    		
    }
	//1~1000偶数之和
	public static void test2(){
		int i = 1;
		int sum = 0;
		while(i<=1000){
			if(i%2==0){
				sum += i;
			}
			i++;
		}
		System.out.println("偶数之和 ："+sum);
	}
    public static void test1(){
    	//1~1000的和
    	int i = 1;//初始值
    	int sum=0;
    	while(i<1001){
    		sum += i;//求和
    		i++;//迭代
    	}
    	System.out.println("和为"+sum);
    }
}
