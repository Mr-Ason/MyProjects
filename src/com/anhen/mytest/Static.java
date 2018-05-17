package com.anhen.mytest;
//static声明的属性时所有对象共享的
public class Static {

	public static void main(String[] args) {
		Persons per1 = new Persons("张三",20);//实例化对象
		Persons per2 = new Persons("张四",22);//实例化对象
		Persons per3 = new Persons("张五",25);//实例化对象
		System.out.println("~~~~~修改前~~~~~");
		per1.showInfo();
		per2.showInfo();
		per3.showInfo();
		System.out.println("~~~~~修改后~~~~~");
		Persons.country = "上海";
		
		per1.showInfo();
		per2.showInfo();
		per3.showInfo();
	}

}
//创建人的信息类
class Persons{
	private String name;
	private int age;
	static String country = "成都";
	
	public void showInfo(){
		System.out.println("姓名："+this.name+",年龄："+this.age+",城市："+country);
	}
	
	
	//构造方法
	public Persons(){
		
	}
	public Persons(String name,int age){
		this.name = name;
		this.age = age;
	}
	

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