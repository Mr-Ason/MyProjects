package com.anhen.mytest;

import java.util.Arrays;

//��������
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
		System.out.println("�����Դ�����"+Arrays.toString(su3));
		zJPX(su3);
		fZPX(su3);
	}
	//ð�����򷽷�

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
		System.out.println("ð������"+Arrays.toString(temp));
		for(int m = 0;m<temp.length;m++){//����д�ɷ�������
			System.out.print(temp[m]+"\t");
		}
	}
	
	//ֱ�����򷽷�
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
		System.out.println("ֱ������"+Arrays.toString(temp));
	}
	
	//��ת����
	public static void fZPX(int temp[]){
		for(int i = 0;i<temp.length/2;i++){
			int tem = temp[i];
			temp[i] = temp[temp.length-i-1];
			temp[temp.length-i-1] = tem;
		}
		System.out.println("��ת����"+Arrays.toString(temp));
	}
	

}
