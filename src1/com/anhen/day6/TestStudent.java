package com.anhen.day6;

public class TestStudent {
	Student student = new Student("wo",12);
	Student student2 = new Student("ni",13);
}

class Student{
	public String name;
	public double height;
	
	//���췽�� ���������ó�ʼֵ
	public Student(String name,double height){
		System.out.println("���õĹ��췽��");
		this.name= name;
		this.height = height;
	}
	 public void show(){
		 System.out.println("���ߣ�");
	 }
	 
	}

