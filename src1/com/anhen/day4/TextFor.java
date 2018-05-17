package com.anhen.day4;
/*for 语法结构：
 *     for（初始值；条件表达式；迭代语句）{
 *         循环体；
 *         }
 *   for循环的流程：
 *          1、初始值
 *          2、条件表达式
 *          3、循环体
 *          4、迭代语句
 *          5、条件表达式   234（循环）
 * 
 * 当循环不确定时，选择while 、   do、、、while
 * 当循环次数确定时，选择 for
 * 
 */
public class TextFor {
	public static void main(String[] args){
		test2();
	}
	public static void test1(){
		//1~10000求和
		int sum = 0;
		for(int i=1;i<=10000;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	//在银行存了10000元，每年利息是3/1000，八年后与 余额为多少
	public static void test2(){
		/*余额 = 本金 + 利息*（本金*年利率）=本金*（1+年利率）
		 *  1  10030
		 */
		double money=10000;
		for(int i=1;i<=8;i++){
			money = money*(1.003);
			System.out.println("第"+i+"年之后，余额："+ money);
		}
		System.out.println(money);//直接打印八年后的总和
	}
}
