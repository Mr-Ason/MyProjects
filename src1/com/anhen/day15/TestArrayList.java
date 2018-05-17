package com.anhen.day15;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// 创建List的对象
//		List list = new List();接口无法实例化
		ArrayList list = new ArrayList();
		
		//1.添加元素
		list.add(1);
		list.add("B");
		list.add(true);
		list.add(new Student());//学生类来源于 TsetStudent 的class  输出：Student [name=null, age=0, weight=0.0, id=0, birthday=null]
		list.add(1);
		//指定位置添加元素
		list.add(0, 2);
		//集合的大小
		System.out.println("集合长度"+list.size());
		
		//2.查看元素
		System.out.println(list.get(1));
		
		//4.删除元素
		list.remove(3);//下标删除
		list.remove("B");//元素删除
		list.remove((Integer)1);//object 对象
		list.remove(new Integer(1));//创建对象
		//3.遍历集合
		System.out.println("遍历集合：");
		for(int i = 0; i <list.size(); i++){//有下标 有for循环
			System.out.println(list.get(i));
		}
		System.out.println("foreach遍历集合：");
		for(Object obj : list){
			if(obj instanceof Student){//如果obj 属于 Student 
				Student student = (Student)obj;
				System.out.println(student.getName());
			}
		}
	}

}

