package com.anhen.day4;
/*1��ѭ����Ƕ��һ�Σ��ڲ�ѭ��ִ����Ϻ��ٽ�����һ���ⲿѭ��
 *    �ⲿѭ��ִ��
 * 2������������� �� Ƕ��ѭ����Ӱ��
 *     break��д���ڲ�ѭ������ֹ�ڲ�ѭ�������ⲿѭ����Ӱ��
 *               д���ⲿѭ������ֹ�ⲿѭ���������ڲ�ѭ���Ĳ�������
 *     continue��д���ڲ�ѭ���������ڲ��ĵ�ǰѭ��������Ĵ��룩�������ڲ�����һ��ѭ��
 *                   д���ⲿѭ���������ⲿ�ĵ�ǰѭ���������ⲿ��һ��ѭ��
 *��ǩ��ʹ�ã�
 *   �����ⲿѭ��ȡ��ǩ���ڲ�ѭ��  ʹ�� break outer�������ⲿѭ��
 *   ������ѭ��ȡ��ǩ���ڲ�ѭ��ʹ�� continue outer��������ǰѭ���������ⲿ��һ��ѭ��
 *   return ���ܺͱ�ǩ���ʹ��
 */
public class Testxunhuanqintao {
	public static void main(String[] args){
		test1();
	}
	/*      ��ӡ
	 *       *
	 *       **
	 *       ***
	 *       **** 
	 *       	.
	 *          .
	 *         ʮ��
	 */
	public static void test1(){
	for(int i =0;i<10;i++){
		for(int j=0;j<=i;j++){
			System.out.print("*");
		}
		/*System.out.println("");
		System.out.println("");
		 for(int a =0;a<10;a++){
			for(int j=0;j<5;j++){
				System.out.print("*");
			}
			System.out.println("~~~~~~~~~~");
			//1!+2!.......10!�ĺ�
			
			int sum =0;
			for(int k = 1;k<11;k++){
				int sums=1;
				for(int j=1;j<=i;j++){
					sums*=j;//�����׳�
				}
				sum+=sums;
			}
			System.out.println(sum);
		}
			}*/
	}
	}
}

