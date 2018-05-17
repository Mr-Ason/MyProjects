package com.anhen.day4;
/*1、循环的嵌套一次，内部循环执行完毕后，再进入下一次外部循环
 *    外部循环执行
 * 2、控制流程语句 对 嵌套循环的影响
 *     break：写在内部循环，终止内部循环，对外部循环无影响
 *               写在外部循环，终止外部循环，减少内部循环的操作次数
 *     continue：写在内部循环，跳过内部的当前循环（后面的代码），进入内部的下一次循环
 *                   写在外部循环，跳过外部的当前循环，进入外部下一次循环
 *标签的使用：
 *   当对外部循环取标签后，内部循环  使用 break outer，结束外部循环
 *   当对外循环取标签后，内部循环使用 continue outer，跳过当前循环，进入外部下一次循环
 *   return 不能和标签配合使用
 */
public class Testxunhuanqintao {
	public static void main(String[] args){
		test1();
	}
	/*      打印
	 *       *
	 *       **
	 *       ***
	 *       **** 
	 *       	.
	 *          .
	 *         十行
	 */
	public static void test1(){
	for(int i =0;i<10;i++){
		for(int j=0;j<=i;j++){
			System.out.print("*");
		}
		/*System.out.println("");
		System.out.println("");
		 for(int a =0;a<10;a++){
			for(int j=0;j<5;j++){
				System.out.print("*");
			}
			System.out.println("~~~~~~~~~~");
			//1!+2!.......10!的和
			
			int sum =0;
			for(int k = 1;k<11;k++){
				int sums=1;
				for(int j=1;j<=i;j++){
					sums*=j;//个数阶乘
				}
				sum+=sums;
			}
			System.out.println(sum);
		}
			}*/
	}
	}
}

