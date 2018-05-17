package com.anhen.day5;
/*数组：存放相同数据类型的一组有序的集合体。
 *    数据分类：
 *        一位数组  多维数组
 *     数组的应用：
 *         数据结构操作（排序）
 *         算法：查询
 * 数组的定义：
 *    1、数组类型数据名 【】
 *    2、数组类型【】  数组名；
 * 数据的初始化
 *   1、静态初始化 
 *       数据类型【】 数组名 = {元素}
 *       数据类型 【】数组名 = new 数据类型【】{元素}；
 *   2、动态初始化
 *       数组名 = new 数据类型【数组的大小】
 *       数据类型【】 数组名 = new 数据类型【数组大小】 
 * 数组访问：
 *    数组.length
 *    for（int i= 0； i<数组.length;i++）{
 *    System.out.println(数组[下标])；
 *    }      想用下标或改变元素时使用
 *   增强型的for循环（foreach）
 *   for(数据类型 变量名 ：数组名){
 *      System.out.println(变量名);
 *     }   // 快速显示数组元素时，使用foreach；
 * 数组注意事项：
 *    1、数组定义好后不可改变大小
 *    2、数组访问 通过下标，下标范围：0~~length-1，注意数组越界问题
 * 
 */
public class Textshuzu {
	public static void main(String[] args){
		//1、数组的声明   还未内存分配
		int a[];
		int [] b;//推荐使用
		//2、数组的初始化赋值
		a = new int[100];//分配空间大小
		
		//
		int[] c = {1,2,3};//静态初始化
		
		//动态赋值  数组的下标从0 到数组长度-1
		a[0] = 100;
		a[1] = 200;
		a[1] = 100;//覆盖元素的值
		//访问元素
		System.out.println(a[0]);//打印出100
		System.out.println(a[1]);//打印出200
		System.out.println(a[2]);//打印出0
		//4、数组的遍历
		//System.out.println(a[-1]);//数组越界
		//System.out.println(a[100]);//数组越界
		System.out.println("数组的长度; "+a.length);//打印出  100
		System.out.println("数组的长度; "+c.length);//打印出  4
		
		for(int  i= 0;i<a.length;i++){
			System.out.println(a[i]);//打印出  100
		}
		System.out.println("foreach: ");
		for(int ele : a){
			System.out.println(ele);
		}
		
		
		
		
		boolean[] bArray = new boolean[10];
		char[ ] cArray=new char[10];
		String[] sArray = new String[10];
		//System.out.println(aArray[0]);//打印出false
		//将数组 int[] k= new int[5];{10 20 30 40 50 }	,复制到数组l
		//int[] j = new int[5];
		   int[] k ={1,2,3,4,5};
		   int[] l = new int[a.length];
		   for(int i=0;i<l.length;i++){
			   l[i]  = a[i];
		   }
		
		}
   
}
