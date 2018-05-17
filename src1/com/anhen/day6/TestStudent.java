package com.anhen.day6;

public class TestStudent {
	Student student = new Student("wo",12);
	Student student2 = new Student("ni",13);
}

class Student{
	public String name;
	public double height;
	
	//构造方法 对属性设置初始值
	public Student(String name,double height){
		System.out.println("调用的构造方法");
		this.name= name;
		this.height = height;
	}
	 public void show(){
		 System.out.println("升高：");
	 }
	 
	}

