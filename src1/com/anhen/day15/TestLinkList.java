package com.anhen.day15;

import java.util.LinkedList;

public class TestLinkList {

	public static void main(String[] args) {
		//创建LinkList对象
		LinkedList list = new LinkedList();
		//添加元素
		list.add(null);
		list.addFirst("A");
		list.addLast("B");
		list.add(2, "C");
		list.add(10, "a");//报错 越界  addLast限定了下标
		//删除元素
		list.removeLast();
		//push操作（压）  先进后出
		list.push("D");
		list.push("E");
		
		//pop 操作 弹出一个元素，并删除
		System.out.println("pop操作："+list.pop());
		//peek操作  取出元素
		System.out.println("pop操作："+list.peek());
		//遍历集合
		System.out.println("集合遍历：");
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
