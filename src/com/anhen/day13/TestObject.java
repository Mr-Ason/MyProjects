package com.anhen.day13;

public class TestObject {

	public static void main(String[] args) {
		//创建学生类
		Student1 stu1 = new Student1("张三",12,1001);
		Student1 stu2 = new Student1("张三",12,1001);
		
		//对象地址
		System.out.println(stu1);
		System.out.println(stu2.toString());
		//判断是不是同一个人
		System.out.println(stu1.equals(stu2));//默认调用的 ==
		System.out.println(stu1==stu2);//false
		
	}

}
class Student1{
	public String name;
	public int age;
	public int id;
	
	public Student1(){}
	public Student1(String name,int age,int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public void show(){
		
	}
	//重写object方法
	public String toString(){
		//return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return "姓名："+this.name +"年龄："+this.age +"学号："+this.id;
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}else{
			if(obj instanceof Student1){
				Student1 stu =(Student1)obj;
				if(this.name.equals( stu.name )&& this.age == stu.age && this.id == stu.id){
					return true;
				}
			}
		}
		return false;
	}
	public int hashCode(){
		return 0;
		
	}
}