package com.anhen.day15;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	public static void main(String[] args){
		//创建HashSet对象  无序  不重复
		HashSet set = new HashSet();
		//新增元素
		set.add(1);
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add(1);
		set.add(2);
		set.add(3);
		set.add("A");//覆盖
		//获取大小
		System.out.println(set.size());
		
		//遍历集合 不推荐使用
		System.out.println("foreach遍历集合：");
		for(Object ele:set){//foreach不用下标遍历 输出无序
			sop(ele);
		}
		
		//迭代器遍历 
		System.out.println("迭代器遍历集合：");
		Iterator it = set.iterator();//获取集合的迭代器 枚举器
		while(it.hasNext()){//判断下一个元素是否存在  hasNext():若果扔有元素，返回下一个元素
			Object obj = it.next();//获得下一个元素  it.next()获得的是对象 用object变量存放
			System.out.println(obj);
		}
	/*	Iterator it = set.iterator();//获取集合的迭代器
		//t同样可以遍历
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

}







