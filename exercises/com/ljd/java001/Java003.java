package com.ljd.java001;

public class Java003 {
	/*
	 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
	 * 其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，
	 * 因为153=1的三次方＋5的三次方＋3的三次方。
	 * 分析：先将三位数分解，再做加法
	 */
	public static void main(String[] args){
		int sum = 0;
		/*for(int i = 100;i<=1000;i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100;
			if(i==(ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai)){
				System.out.print(i+" ");
				sum++;
			}
		}*/
		for(int i1 = 100;i1<=1000;i1++){
			int ge = i1%10;
			int shi = i1/10%10;
			int bai = i1/100;
			if(i1==(int)Math.pow(ge, 3)+(int)Math.pow(shi, 3)+(int)Math.pow(bai, 3)){
				System.out.print(i1+" ");
				sum++;
			}
		}
		System.out.println("水仙花总数："+sum);
		System.out.println(88.8%10);
		System.out.println(888%100);
	}
	public static boolean Flowe(int i){
		int sum = 0;
		for(int i1 = 100;i1<1000;i1++){
			int ge = i1%10;
			int shi = i1/10%10;
			int bai = i1/100;
			if(i1==(int)Math.pow(ge, 3)+(int)Math.pow(shi, 3)+(int)Math.pow(bai, 3)){
				System.out.println(i1+" ");
				sum++;
			}
		}
		System.out.println(sum);
		return false;
		
	}

}
