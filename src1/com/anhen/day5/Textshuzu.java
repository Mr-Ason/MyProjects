package com.anhen.day5;
/*���飺�����ͬ�������͵�һ������ļ����塣
 *    ���ݷ��ࣺ
 *        һλ����  ��ά����
 *     �����Ӧ�ã�
 *         ���ݽṹ����������
 *         �㷨����ѯ
 * ����Ķ��壺
 *    1���������������� ����
 *    2���������͡���  ��������
 * ���ݵĳ�ʼ��
 *   1����̬��ʼ�� 
 *       �������͡��� ������ = {Ԫ��}
 *       �������� ���������� = new �������͡���{Ԫ��}��
 *   2����̬��ʼ��
 *       ������ = new �������͡�����Ĵ�С��
 *       �������͡��� ������ = new �������͡������С�� 
 * ������ʣ�
 *    ����.length
 *    for��int i= 0�� i<����.length;i++��{
 *    System.out.println(����[�±�])��
 *    }      �����±��ı�Ԫ��ʱʹ��
 *   ��ǿ�͵�forѭ����foreach��
 *   for(�������� ������ ��������){
 *      System.out.println(������);
 *     }   // ������ʾ����Ԫ��ʱ��ʹ��foreach��
 * ����ע�����
 *    1�����鶨��ú󲻿ɸı��С
 *    2��������� ͨ���±꣬�±귶Χ��0~~length-1��ע������Խ������
 * 
 */
public class Textshuzu {
	public static void main(String[] args){
		//1�����������   ��δ�ڴ����
		int a[];
		int [] b;//�Ƽ�ʹ��
		//2������ĳ�ʼ����ֵ
		a = new int[100];//����ռ��С
		
		//
		int[] c = {1,2,3};//��̬��ʼ��
		
		//��̬��ֵ  ������±��0 �����鳤��-1
		a[0] = 100;
		a[1] = 200;
		a[1] = 100;//����Ԫ�ص�ֵ
		//����Ԫ��
		System.out.println(a[0]);//��ӡ��100
		System.out.println(a[1]);//��ӡ��200
		System.out.println(a[2]);//��ӡ��0
		//4������ı���
		//System.out.println(a[-1]);//����Խ��
		//System.out.println(a[100]);//����Խ��
		System.out.println("����ĳ���; "+a.length);//��ӡ��  100
		System.out.println("����ĳ���; "+c.length);//��ӡ��  4
		
		for(int  i= 0;i<a.length;i++){
			System.out.println(a[i]);//��ӡ��  100
		}
		System.out.println("foreach: ");
		for(int ele : a){
			System.out.println(ele);
		}
		
		
		
		
		boolean[] bArray = new boolean[10];
		char[ ] cArray=new char[10];
		String[] sArray = new String[10];
		//System.out.println(aArray[0]);//��ӡ��false
		//������ int[] k= new int[5];{10 20 30 40 50 }	,���Ƶ�����l
		//int[] j = new int[5];
		   int[] k ={1,2,3,4,5};
		   int[] l = new int[a.length];
		   for(int i=0;i<l.length;i++){
			   l[i]  = a[i];
		   }
		
		}
   
}
