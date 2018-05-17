package com.anhen.day16;

import java.util.ArrayList;
import java.util.*;


public class TextEmployee {
	public static void main(String [] args){
		
		Employee[] employee = new Employee[999999];
		employee[1] = new Employee("小李",22,10600.5);
		employee[2] = new Employee("小王",23,16600.6);
		employee[3] = new Employee("小柳",21,14600.3);
		employee[4] = new Employee("小于",20,16200.7);
		employee[5] = new Employee("小二",24,14900.9);
		employee[6] = new Employee("小林",25,15900.4);
		employee[7] = new Employee("小雪",22,16900.4);
		//创建集合
		ArrayList al = new ArrayList();
		
		//1.添加元素   把若干Employee对象放在List中【添加元素】，至少5个Employee对象
		al.add(employee[1]);
		al.add(employee[2]);
		al.add(employee[3]);
		al.add(employee[4]);
		al.add(employee[5]);
		al.add(employee[6]);
		//遍历集合
//		Iterator it =  al.iterator();
//		while(it.hasNext()){
//			sop(it.next());
//		}
		//2.获取所有元素      
		for(int i = 0;i<al.size();i++){
			sop("对象("+i+")="+al.get(i));
		}
		sop("**************************");
		//3.在第三个Employee后面添加一个新Employee对象
		al.add(3,employee[7]);
		for(int i = 0;i<al.size();i++){
			sop("对象("+i+")="+al.get(i));
		}
		sop("**************************");
		//4.删除第二个Employee对象信息
		al.remove(2);
		for(int i = 0;i<al.size();i++){
			sop("对象("+i+")="+al.get(i));
		}
		sop("**************************");
		//5.判断某个Employee是否存在在该集合里面 （通过indexof获取对象位置）
		sop("ndexof:"+al.indexOf(employee[2]));
		List sub = al.subList(1, 6);//子列表
		sop("sub:"+sub);

		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

}

class Employee{
	//属性
	private String name;
	private int age;
	private double salary;
	
	//无参构造
	public Employee(){
		
	}
	//带参构造
	public Employee(String name,int age,double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String toString(){
		return "姓名:"+this.name+"年龄:"+this.age+"薪资:"+this.salary;
	}
	//set 和get方法
	public void setName(String name){
		this.name= name;
	}
	public String getName(String name){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(int age){
		return age;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(double salary){
		return salary;
	}
	
	public void show(){
		System.out.println();
	}
}




























