package com.anhen.five;

public class Fore {
	public static void main(String[] args){
		Dog dog = new Dog("���","��ɫ",1);
		dog.shoInfo();
	}
}

class Dog{
	private String name;
	private String color;
	private int age;
	
	public  Dog(){}
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "����:"+this.name+";��ɫ:"+this.color+";����:"+this.age;
	}
	public void shoInfo(){
		System.out.println(this.toString());
	}
	
}
