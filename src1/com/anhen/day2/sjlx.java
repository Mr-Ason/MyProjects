package com.anhen.day2;
/*数据类型：限定变量可以存放的值，值的数据类型、范围
 * 数据类型的分类：1、基本数据类型 2、应用数据类型
 *  1.基本数据类型：整形  浮点型  布尔型 字符型
 *    （1）整形：整数（包含负数）1字节 = 8位（二进制）
 *              byte     1字节
 *              short    2字节
 *              int (默认整形)       4字节
 *              long     8字节
 *    （2）浮点型：小数（包含正负数）
 *               float     4 字节     单精度
 *               double  8 字节     双精度(默认的)
 *    （3）布尔型：逻辑值  只有 true 和 false  
 *    （4）字符型：存放字符，可以存放中文或西文字符         
 *               char   2字节    0--6万
 *      byte short int(char) long float double
 *      精度小转大 默认转换 没有精度丢失
 *      精度大转小 需要强制转换 有精度丢失
 *  
 *  
 */
public class sjlx {
	
	//定义整形变量（）
	byte mybyte = -128;
	short myshort = 32767;
	int myint = 200000;
	long mylong=20000000000l;
	
	
	//定义浮点型
	float myFloat = 222222.333343F;
	double myDouble = 222222342.324343243;
	
	
	//定义逻辑型
	boolean myBoolean = true;
	
	//定义字符型
	public static void main(String[] args){
	char myChar ='A';
	myChar = 64;//输出为@ 65输出为A
	System.out.println(myChar);
	
	//数据类型的转换
	int x=100;
	x= 200;
	x=300;
	
	//short=y;
	//y=100
	//y=2 00;
	//y=300;
	short y =(short)x;
	System.out.println(y);
	
	
	
	//小转大 默认转换
	byte oByte = 100;
	int oInt = oByte; 
	long oLong = oInt;
	System.out.println(oLong);
	
	//大转小 强制转换 精度丢失
	oLong = 1000000000L;
	oInt  = (int)oLong;
	System.out.println(oInt);
	
	
	}
}
