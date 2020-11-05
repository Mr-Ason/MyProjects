/**   
 * projectName: MyJava   
 * fileName: SuzuCOPY.java   
 * packageName: com.anhen.mytest   
 * date: 2018年8月26日下午10:34:44   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.anhen.mytest;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SuzuCOPY {
	public static void main(String[] args){
		int[] x = {1,2,3,4,5,6,7,8,9};
		int[] y = {11,22,33,44,55,66,77,88,99};
		
		System.out.println("自定义复制数组函数：");
		SuzuCOPY.copy(x,2,y,1,4);
		System.out.println();
		System.out.println("调用类库中方法：");
		System.arraycopy(x, 3, y, 3, 4);
		print(y);
		
		Integer[] a = { 5, 2, 4, 7, 9, 1, 3, 10, 8, 6 };// 1-10
		Integer[] b = { 15, 9, 13, 12, 7, 8, 14, 6, 10, 11 };// 6-15
		Set<Integer> set = new TreeSet<Integer>();// 利用TreeSet有序且不重复的特性
		set.addAll(Arrays.asList(a));
		set.addAll(Arrays.asList(b));
		/*
		 * 如果new Integer中传递的长度小于集合的长度，则左侧创建的数组长度为集合长度 如果new
		 * Integer中传递的长度大于集合的长度，则左侧创建的数组长度为传递的长度 最好传入长度定义为集合的长度，如下为set.size()
		 */
		Integer[] c = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(c));
	}
	
	/**
	 * int数组转integer数组: 就是每次通过int数组的长度定义一个长度相同的Integer数组，之后循环获取到int数组的值赋给Integer数组就可以了。
	 * 如何 将一个Integer数组拆箱转换为int[]?(你当然可以用for循环来做) 如下：
	 */
	public static void  int_toInteger(int[] a,Integer[] b){
		for(int i = 0;i<b.length;i++){
			b[i] = i;
		}
		a = Arrays.stream(b).mapToInt(Integer :: valueOf).toArray();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+"\t");
		}
	}
	
	public static void copy(int[] s,int s1,int[] o,int s2,int len){
		for(int i = 0;i<len ;i++){
			o[s2+i] = s[s1+i];
		}
		for(int i=0;i<o.length;i++){
			System.out.print(o[i]+"\t");
		}
	}
	
	public static void print(int[] temp){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+"\t");
		}
	}

}
