package com.ljd.java001;

public class Java002 {
	/*
	 * 判断101-200之间有多少个素数，并输出所用素数；
	 * 素数：只能被1和本身整除的数。
	 * 判断素数的方法：用一个数（n）去除2到sqrt（n）,如果能被整除，则不是素数。
	 */
	public static void main(String[] args){
		int sum = 0;
		for(int i=101;i<=200;i++){
			if(IsRightNum(i)){
				System.out.print(i+" ");
				sum++;
				if(sum%10==0){
					System.out.println();//换行
				}
			}
		}
		System.out.println();
		System.out.println("素数的个数有："+sum);
	}

	private static boolean IsRightNum(int i) {
		for(int j = 2;j<=Math.sqrt(i);j++){
			if(i%j==0){//如果i能整除j，则不是素数。
				return false;
			}
		}
		return true;
	}

}
