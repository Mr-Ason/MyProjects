package com.anhen.homework;

public class Dog implements Pet {
	private String name;
	private String color;
	private String jiao = "ÍôÍô";
	private int age;
	
	public Dog(String name,String color,String jiao,int age){
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
