package com.anhen.day2;
/*运算符
 * 通过参与运算的操作的个数划分：
 *       一元运算符  二元运算符  三元运算符
 * 根据功能划分
 *   1、算数运算符      
 *        +  -
 *        ++     ++num(运算前加1)  num++(运算后+1)
 *         ——     ——num               num——                        
 *        + - * / % 
 *   2、关系运算符：比较两个值的大小关系 返回 布尔型
 *      >  >=  <  <=   ==   ！=
 *        
 *    3、逻辑运算符  ！ &&  ||
 *        ！ 逻辑取反
 *        && 全真为真  一假为假
 *        ||  全假为假    
 *    4、位运算 
 *       ~ 取反  0变1  1变0
 *       &  全1 为1 ，可以参与逻辑运算，没有短路功能
 *       |  全 0 为 0  ，可以参与逻辑运算，没有短路功能
 *       ^  异或
 *       <<    左移
 *       >>    右移
 *       
 *       5、赋值运算
 *          
 */
public class ysf {
	public static void main(String[] args){
		//1\自增 自减
		int num = 10;
		++num;  
		System.out.println(++num);
		num=10;
		System.out.println(num++);
		//算术运算 + - * / %
		int num2 = 100;
		double num3 = 200;
		System.out.println(num2 + num3);//向精度大的默认转换
		System.out.println(num2/3);//直接去掉小数
		//取余
		System.out.println(num2 % 3);//取余为1
		
		
		//3、关系运算符
		System.out.println(num2>num3);
		System.out.println(num2==num3);//判断地址
		
		String str3 ="字符串2";
		String str4 ="字符串2";
		System.out.println(str3==str4);//指向同一地址（第一个 字符串2）
		
		
		//4、逻辑运算符
		System.out.println(!(num2>num3));//取反
		System.out.println(true&&false);
		boolean bl = (num2>num3)&&(num2++==100);//短路功能
		
		System.out.println(num2);
		
		boolean bl2 = (num2>num3)||(num2++==100);//短路或
		System.out.println(num2);
		
		//5、位运算
		bl = (100==100)&(num2>num3)&(num2++==100);
		
		
		//赋值运算
		num2 =100;
		num2 +=10;//num2=num2+10
		
		num2 /=5;//num2=
		
		
	}
}
