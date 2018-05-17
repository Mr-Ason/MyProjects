/**   
 * projectName: MyJava   
 * fileName: Test.java   
 * packageName: com.anhen.day2   
 * date: 2018年3月14日下午1:47:17   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.anhen.day2;

public class Test {

	public static void main(String[] args) {
		int a = 3; int b,c;
		b=++a;
		System.out.println("c=b++;前的值："+b);
		c=b++;
		System.out.println("c=b++;后的值："+b);
		System.out.println("c的值为："+c);

	}

}
