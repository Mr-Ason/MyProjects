package com.anhen.day15;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// ����List�Ķ���
//		List list = new List();�ӿ��޷�ʵ����
		ArrayList list = new ArrayList();
		
		//1.���Ԫ��
		list.add(1);
		list.add("B");
		list.add(true);
		list.add(new Student());//ѧ������Դ�� TsetStudent ��class  �����Student [name=null, age=0, weight=0.0, id=0, birthday=null]
		list.add(1);
		//ָ��λ�����Ԫ��
		list.add(0, 2);
		//���ϵĴ�С
		System.out.println("���ϳ���"+list.size());
		
		//2.�鿴Ԫ��
		System.out.println(list.get(1));
		
		//4.ɾ��Ԫ��
		list.remove(3);//�±�ɾ��
		list.remove("B");//Ԫ��ɾ��
		list.remove((Integer)1);//object ����
		list.remove(new Integer(1));//��������
		//3.��������
		System.out.println("�������ϣ�");
		for(int i = 0; i <list.size(); i++){//���±� ��forѭ��
			System.out.println(list.get(i));
		}
		System.out.println("foreach�������ϣ�");
		for(Object obj : list){
			if(obj instanceof Student){//���obj ���� Student 
				Student student = (Student)obj;
				System.out.println(student.getName());
			}
		}
	}

}

