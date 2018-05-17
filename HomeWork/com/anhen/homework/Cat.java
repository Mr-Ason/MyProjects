package com.anhen.homework;

public class Cat implements Pet {
	private String name;
	private String color;
	private String jiao = "喵~";
	private int age;
	
	public Cat(String name,String color,String jiao,int age){//构造方法为属性赋值
		this.name = name;
		this.color = color;
		this.jiao = jiao;
		this.age = age;
	}
	public String getJiao() {
		return jiao;
	}

	public void setJiao(String jiao) {
		this.jiao = jiao;
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


}
