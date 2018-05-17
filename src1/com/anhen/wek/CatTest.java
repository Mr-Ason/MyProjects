package com.anhen.wek;

import java.util.*;

public class CatTest {
	public static void main(String [] args){
		Cat c= new Cat("懒的背时");
		c.show();
		//创建集合CatList
		ArrayList  al = new ArrayList();
		
		//添加元素
		al.add("华华");
		al.add("花花");
		al.add("哗哗");
		al.add("桦桦");
		
		//打印集合
		sop(al);
		//遍历集合
		Iterator it = al.iterator();
		while(it.hasNext()){
			sop("遍历元素："+it.next());
		}
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}





//Cat类
class Cat{
	//属性
	private String name;
	
	//无参构造 初始化属性
	public Cat(){
		
	}
	public Cat(String name){
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.println("猫名："+this.name);

	}
}	


