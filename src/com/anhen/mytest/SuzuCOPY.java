/**   
 * projectName: MyJava   
 * fileName: SuzuCOPY.java   
 * packageName: com.anhen.mytest   
 * date: 2018��8��26������10:34:44   
 * copyright(c) 2017-2020 xxx��˾  
 */ 
package com.anhen.mytest;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SuzuCOPY {
	public static void main(String[] args){
		int[] x = {1,2,3,4,5,6,7,8,9};
		int[] y = {11,22,33,44,55,66,77,88,99};
		
		System.out.println("�Զ��帴�����麯����");
		SuzuCOPY.copy(x,2,y,1,4);
		System.out.println();
		System.out.println("��������з�����");
		System.arraycopy(x, 3, y, 3, 4);
		print(y);
		
		Integer[] a = { 5, 2, 4, 7, 9, 1, 3, 10, 8, 6 };// 1-10
		Integer[] b = { 15, 9, 13, 12, 7, 8, 14, 6, 10, 11 };// 6-15
		Set<Integer> set = new TreeSet<Integer>();// ����TreeSet�����Ҳ��ظ�������
		set.addAll(Arrays.asList(a));
		set.addAll(Arrays.asList(b));
		/*
		 * ���new Integer�д��ݵĳ���С�ڼ��ϵĳ��ȣ�����ഴ�������鳤��Ϊ���ϳ��� ���new
		 * Integer�д��ݵĳ��ȴ��ڼ��ϵĳ��ȣ�����ഴ�������鳤��Ϊ���ݵĳ��� ��ô��볤�ȶ���Ϊ���ϵĳ��ȣ�����Ϊset.size()
		 */
		Integer[] c = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(c));
	}
	
	/**
	 * int����תinteger����: ����ÿ��ͨ��int����ĳ��ȶ���һ��������ͬ��Integer���飬֮��ѭ����ȡ��int�����ֵ����Integer����Ϳ����ˡ�
	 * ��� ��һ��Integer�������ת��Ϊint[]?(�㵱Ȼ������forѭ������) ���£�
	 */
	public static void  int_toInteger(int[] a,Integer[] b){
		for(int i = 0;i<b.length;i++){
			b[i] = i;
		}
		a = Arrays.stream(b).mapToInt(Integer :: valueOf).toArray();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+"\t");
		}
	}
	
	public static void copy(int[] s,int s1,int[] o,int s2,int len){
		for(int i = 0;i<len ;i++){
			o[s2+i] = s[s1+i];
		}
		for(int i=0;i<o.length;i++){
			System.out.print(o[i]+"\t");
		}
	}
	
	public static void print(int[] temp){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+"\t");
		}
	}

}
