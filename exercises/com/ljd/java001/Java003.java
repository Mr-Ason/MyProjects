package com.ljd.java001;

public class Java003 {
	/*
	 * ��ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ����
	 * ���λ���������͵��ڸ����������磺153��һ��"ˮ�ɻ���"��
	 * ��Ϊ153=1�����η���5�����η���3�����η���
	 * �������Ƚ���λ���ֽ⣬�����ӷ�
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
		System.out.println("ˮ�ɻ�������"+sum);
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
