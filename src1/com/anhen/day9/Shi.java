package com.anhen.day9;

public class Shi {
	public static void main(String []  args){
		Teacher tr = new Teacher();
		tr.show();
		
	}
}
//父类
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
	
//子类
class Javateacher{
	public Javateacher(){
		System.out.println("java 很牛！");
	}
	public Javateacher(Teacher javateacher){
		System.out.println("ta java 很牛！");
	}
	public void show(){
		System.out.println("ta java 很牛！");
		//super.show(javateacher);
	}
}




