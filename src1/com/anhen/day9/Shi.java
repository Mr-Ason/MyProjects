package com.anhen.day9;

public class Shi {
	public static void main(String []  args){
		Teacher tr = new Teacher();
		tr.show();
		
	}
}
//����
class Teacher{
	public  Teacher(){
		//System.out.println("ni shi");
	}
	public Teacher(Teacher teacher){
		System.out.println("laoshi");
	}	
	
	public void show(){
		System.out.println("show");
	}
}
	
//����
class Javateacher{
	public Javateacher(){
		System.out.println("java ��ţ��");
	}
	public Javateacher(Teacher javateacher){
		System.out.println("ta java ��ţ��");
	}
	public void show(){
		System.out.println("ta java ��ţ��");
		//super.show(javateacher);
	}
}




