package com.anhen.day12;
/*��װ�࣬�����������Ͷ��ж�Ӧ���࣬�û������Ӧ��������������
 *     byte         Byte
 *     short       Short
 *     int           Integer
 *     long        Long
 *     float        Float
 *     double      Double
 *      boolean   Boolean
 *      char        Character
 * ���ã���λ�� java.lang ʹjava�еĻ����������� �������
 */
public class TestBoxing {
	public static void main(String[] args){
		//δʹ��װ��
		
		int[] nums =new int[10000000];
		long start = System.currentTimeMillis();
		System.out.println(start);
		for(int i= 0 ; i<nums.length;i++){//��ֵ
			nums[i] = i;
			i = nums[i];
		}
		long end = System.currentTimeMillis();
		System.out.println("��ʹ��װ��ʱ�䣺"+(end-start));
		//ʹ�÷�װ
		Integer[] nums2  =  new Integer[10000000];
		start = System.currentTimeMillis();
		for(int i= 0; i<nums2.length;i++){
			nums2[i] = i;//װ��
			i= nums2[i];//����
			
		}
		end = System.currentTimeMillis();
		System.out.println("װ�����ʱ�䣺"+(end-start));
		//int num =Integer.parseInt("123");
		
	}

}
