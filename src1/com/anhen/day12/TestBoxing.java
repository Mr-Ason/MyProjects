package com.anhen.day12;
/*封装类，基本数据类型都有对应的类，用户存放响应的数据类型数据
 *     byte         Byte
 *     short       Short
 *     int           Integer
 *     long        Long
 *     float        Float
 *     double      Double
 *      boolean   Boolean
 *      char        Character
 * 作用：均位于 java.lang 使java中的基本数据类型 面向对象
 */
public class TestBoxing {
	public static void main(String[] args){
		//未使用装箱
		
		int[] nums =new int[10000000];
		long start = System.currentTimeMillis();
		System.out.println(start);
		for(int i= 0 ; i<nums.length;i++){//赋值
			nums[i] = i;
			i = nums[i];
		}
		long end = System.currentTimeMillis();
		System.out.println("不使用装箱时间："+(end-start));
		//使用封装
		Integer[] nums2  =  new Integer[10000000];
		start = System.currentTimeMillis();
		for(int i= 0; i<nums2.length;i++){
			nums2[i] = i;//装箱
			i= nums2[i];//拆箱
			
		}
		end = System.currentTimeMillis();
		System.out.println("装箱拆箱时间："+(end-start));
		//int num =Integer.parseInt("123");
		
	}

}
