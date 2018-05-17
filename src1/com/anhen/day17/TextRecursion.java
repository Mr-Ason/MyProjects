package com.anhen.day17;

public class TextRecursion {
//	public static long cout(long i){
//		if(i==1||i==0){
//			return i;
//		}else{
//			return i*cout(i-1)+cout(i-1);
//		}
//	}不可以	
	public static void main(String[] args) {
		//System.out.println(cout(10));不可以
//		int sum = 0;
//		int i =1;
//		for(int k = 1;k<=10;k++){
//			i= k*i;
//			sum = sum+i;
//		}
//		System.out.println(sum);可以
		
		
		
	}

	public static class MethodText{
		 static int sum = 0;
		public static int factorail(int num){
			if(num==1||num==0){
				return 1;
			}else{
				return num*factorail(num-1);
			}
		}
	
		public static int total(int num1){
			if(num1==1||num1==0){
				return num1;
			}else{
				sum += factorail(num1);
				total(--num1);
			}
			return sum;
		}
	}	
	
}








