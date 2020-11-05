package com.anhen.mytest;

import java.util.Arrays;

//数组排序
public class shuzupaixu {

	public static void main(String[] args) {
		int su1[] = {1,34,5,65,4,21,45};
		int su2[] = {54,56,8,4,34,7,57};
		int su3[] = {14,3,6,5,7,9,45};
		sort(su1);
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~");
		sort(su2);
		System.out.println();
		Arrays.sort(su3);
		System.out.println("数组自带排序："+Arrays.toString(su3));
		zJPX(su3);
		fZPX(su3);
	}
	//冒泡排序方法

	public static  void sort(int temp[]){
		for(int i = 1;i<temp.length;i++){
			for(int j = 0;j<temp.length;j++){
				if(temp[i]<temp[j]){
					int sum = temp[i];
					temp[i] = temp[j];
					temp[j] = sum;
				}
			}
		}
		System.out.println("冒泡排序："+Arrays.toString(temp));
		for(int m = 0;m<temp.length;m++){//可以写成方法调用
			System.out.print(temp[m]+"\t");
		}
	}
	
	//直接排序方法
	public static void zJPX(int temp[]){
		for(int i = 0;i<temp.length;i++){
			int tem = i;
			for(int j = i;j<temp.length;j++){
				if(temp[tem]>temp[j]){
					tem = j;
				}
			}
			int temp1 = temp[i];
			temp[i] = temp[tem];
			temp[tem] = temp1;
		}
		System.out.println("直接排序："+Arrays.toString(temp));
	}
	
	//反转排序
	public static void fZPX(int temp[]){
		for(int i = 0;i<temp.length/2;i++){
			int tem = temp[i];
			temp[i] = temp[temp.length-i-1];
			temp[temp.length-i-1] = tem;
		}
		System.out.println("反转排序："+Arrays.toString(temp));
	}
	

}
