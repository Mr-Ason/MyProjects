package com.anhen.day15;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	public static void main(String[] args){
		//����HashSet����  ����  ���ظ�
		HashSet set = new HashSet();
		//����Ԫ��
		set.add(1);
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add(1);
		set.add(2);
		set.add(3);
		set.add("A");//����
		//��ȡ��С
		System.out.println(set.size());
		
		//�������� ���Ƽ�ʹ��
		System.out.println("foreach�������ϣ�");
		for(Object ele:set){//foreach�����±���� �������
			sop(ele);
		}
		
		//���������� 
		System.out.println("�������������ϣ�");
		Iterator it = set.iterator();//��ȡ���ϵĵ����� ö����
		while(it.hasNext()){//�ж���һ��Ԫ���Ƿ����  hasNext():��������Ԫ�أ�������һ��Ԫ��
			Object obj = it.next();//�����һ��Ԫ��  it.next()��õ��Ƕ��� ��object�������
			System.out.println(obj);
		}
	/*	Iterator it = set.iterator();//��ȡ���ϵĵ�����
		//tͬ�����Ա���
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

}







