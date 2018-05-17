package com.anhen.day3;
/*switch f分支：适合于分支较多的情况
 * 语法：
 *       switch(表达式){
 *           case 匹配值:
 *                         代码块
 *                         break;//终止switch
 *            case 匹配值:
 *                         代码块
 *                         break;//终止switch
 *                         .
 *                         .
 *                         .
 *           default：
 *                     代码块：都不匹配时，              
 *       
 *       注意事项：
 *       1、只有遇到break才会终止switch;
 *       2、表达式的数据类型： byte  short int char String（1.7之后支持）
 *       3、；匹配值和表达式的值必须一致
 *       }
 */
public class Text2Switch {
	public static void main(String[] args){
		char degreen = 'A';//改变值得到相应答案
		switch(degreen){
		case 'A':
			   System.out.println("等级为A");
			   break;
	//		   System.out.println("等级为A");//无效代码
		case 'B':
			   System.out.println("等级为B");
			   break;
		case 'C':
			   System.out.println("等级为C");
			   break;
		case 'D':
			   System.out.println("等级为D");
			   break;
		case 'E':
		case 'F':
		       System.out.println("不及格");//E、F通用 不及格
		default:
			System.out.println("没有找到相应等级");
		}
		
		
	}

}
