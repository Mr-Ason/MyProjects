package com.anhen.mytest;

public class Bijiao {

	public static void main(String[] args) {
		Person per1 = new Person("李四",20);
		Person per2 = new Person("李四",23);
		per1.compare(per2);
	}

}

class Person{
	//属性
	private String name;
	private  int age;
	
	//构造方法
	public Person(){//无参构造
		
	}
	public Person(String name,int age){
		this.name = name;//不加 this 的话 在传参时找不到无参
		this.age = age;
	}
	public boolean compare(Person per){
		if(this.name.equals(per.name)&&this.age==per.age){//'=='比较的是地址，equls是比较内容
			System.out.println("这两个人相等");
		}else{
			System.out.println("这两个人不同！");
		}
		return true;
	}
	//set get 读取和访问封装对象
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
