package com.anhen.mytest;
//数组排序
public class shuzupaixu {

	public static void main(String[] args) {
		int su1[] = {1,34,5,65,4,21,45};
		int su2[] = {54,56,8,4,34,7,57};
		sort(su1);
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~");
		sort(su2);

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
		for(int m = 0;m<temp.length;m++){//可以写成方法调用
			System.out.print(temp[m]+"\t");
		}
	}
	

}
