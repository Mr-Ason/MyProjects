package com.anhen.day13;

public class TextObject {
	public static void main(String [] args){
		Student stu1= new Student ("张三" ,20,10001);
		Student stu2= new Student ("张三" ,20,10001);
		
		//对象地址
		System.out.println(stu1);
		System.out.println(stu2.toString());
		//判断俩个是否相等         系统默认地址相等  我们改为某个主键相等
		System.out.println(stu1.equals(stu2));//方法重写后相等
		System.out.println(stu1==stu2);//永远 false
	}

}
class Student{
	public String name;
	public int age;
	public int id;
	 
	public Student(){
		
	}
	public Student(String name,int age,int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//重写Object
	public String toString() {
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
        return "姓名："+this.name+"年龄："+this.age +"学号："+this.id;
	}
	//重写 equals
	public boolean equals(Object obj){
		if(this ==obj){
			return true;
		}else{
			if(obj instanceof Student){
				Student stu = (Student)obj;
				if(this.name.equals(stu.name)&&this.age==stu.age&&this.id==stu.id){
					   return true;
				}
			}else{
				return false;
			 }
		 }
		return false;
	}
	 public int hashCode(){
		return 0; 
	 }
	
	
}