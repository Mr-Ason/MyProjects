package com.anhen.mytest;
//��������
public class shuzupaixu {

	public static void main(String[] args) {
		int su1[] = {1,34,5,65,4,21,45};
		int su2[] = {54,56,8,4,34,7,57};
		sort(su1);
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~");
		sort(su2);

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
		for(int m = 0;m<temp.length;m++){//����д�ɷ�������
			System.out.print(temp[m]+"\t");
		}
	}
	

}
