package com.ljd.java001;

public class Java002 {
	/*
	 * �ж�101-200֮���ж��ٸ����������������������
	 * ������ֻ�ܱ�1�ͱ�������������
	 * �ж������ķ�������һ������n��ȥ��2��sqrt��n��,����ܱ�����������������
	 */
	public static void main(String[] args){
		int sum = 0;
		for(int i=101;i<=200;i++){
			if(IsRightNum(i)){
				System.out.print(i+" ");
				sum++;
				if(sum%10==0){
					System.out.println();//����
				}
			}
		}
		System.out.println();
		System.out.println("�����ĸ����У�"+sum);
	}

	private static boolean IsRightNum(int i) {
		for(int j = 2;j<=Math.sqrt(i);j++){
			if(i%j==0){//���i������j������������
				return false;
			}
		}
		return true;
	}

}
