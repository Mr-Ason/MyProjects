package com.anhen.day4;
/*for �﷨�ṹ��
 *     for����ʼֵ���������ʽ��������䣩{
 *         ѭ���壻
 *         }
 *   forѭ�������̣�
 *          1����ʼֵ
 *          2���������ʽ
 *          3��ѭ����
 *          4���������
 *          5���������ʽ   234��ѭ����
 * 
 * ��ѭ����ȷ��ʱ��ѡ��while ��   do������while
 * ��ѭ������ȷ��ʱ��ѡ�� for
 * 
 */
public class TextFor {
	public static void main(String[] args){
		test2();
	}
	public static void test1(){
		//1~10000���
		int sum = 0;
		for(int i=1;i<=10000;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	//�����д���10000Ԫ��ÿ����Ϣ��3/1000��������� ���Ϊ����
	public static void test2(){
		/*��� = ���� + ��Ϣ*������*�����ʣ�=����*��1+�����ʣ�
		 *  1  10030
		 */
		double money=10000;
		for(int i=1;i<=8;i++){
			money = money*(1.003);
			System.out.println("��"+i+"��֮����"+ money);
		}
		System.out.println(money);//ֱ�Ӵ�ӡ�������ܺ�
	}
}
