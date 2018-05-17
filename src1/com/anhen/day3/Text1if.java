package com.anhen.day3;
/*分支结构：通过条件判断，选择执行货路过的结构。
 * if  switch
 *  1、 if 语法
 *      if（条件表达式）{
 *             代码块：//只有条件表达式结果为true时，执行此语句
 *      
 *      }
 *      if....else语法：
 *          if（条件表达式）{
 *             代码块：//只有条件表达式结果为true时，执行此语句
 *      }else{
 *          代码块：//只有条件表达式为false时执行
 *      
 *      }
 *      if ...else if 
 *      if（条件表达式）{
 *             代码块：//只有条件表达式结果为true时，执行此语句
 *      }else   if(条件表达式){   
 *          代码块：前面表达式为false时，并且当前条件表达式为true才能执行
 *      
 *      }
 *      
 *      
 */
public class Text1if {
	public static void main(String[] args){
		System.out.println("今天下不下雨");
		boolean bl = false;
		int num = 100 ;
		if(bl){
		   System.out.println("下雨了!");
		   if(num >= 100){
			   System.out.println("num>100");
		   }
		}else{
			 System.out.println("没下雨了!");
		}
		if(num>100){
			System.out.println("num大于10");		
			}else if(num>20){
				System.out.println("num大于20");
			}else if(num>20){
				System.out.println("num大于30");
			}else if(num>20){
				System.out.println("num小于10");
			}
		/*学生等级判断  0~100的分数
		 *                90~100  A
		 *                60~90    B
		 *                0~60     C 
		 */
	}
	
  
}
