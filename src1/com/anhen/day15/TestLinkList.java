package com.anhen.day15;

import java.util.LinkedList;

public class TestLinkList {

	public static void main(String[] args) {
		//����LinkList����
		LinkedList list = new LinkedList();
		//���Ԫ��
		list.add(null);
		list.addFirst("A");
		list.addLast("B");
		list.add(2, "C");
		list.add(10, "a");//���� Խ��  addLast�޶����±�
		//ɾ��Ԫ��
		list.removeLast();
		//push������ѹ��  �Ƚ����
		list.push("D");
		list.push("E");
		
		//pop ���� ����һ��Ԫ�أ���ɾ��
		System.out.println("pop������"+list.pop());
		//peek����  ȡ��Ԫ��
		System.out.println("pop������"+list.peek());
		//��������
		System.out.println("���ϱ�����");
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
