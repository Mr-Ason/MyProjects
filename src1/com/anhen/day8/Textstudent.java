package com.anhen.day8;

public class Textstudent {
	public static void main(String [] args){
		
	}

}
class Student1{
	//属性
	private int id;
	private String name;
	private int age;
	private String birthday;
	
	//方法
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
		
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public void setBirthday(String birthdan){
		//this.birthday = birthday;
		String yearStr = birthday.substring(0,4);
		int year = Integer.parseInt(yearStr);
		if(year+this.getAge()==2016){
			this.birthday = birthday;
		}else{
			System.out.println("出生日期与年龄不符！！");
		}
	}
	public String getBirthday(){
		return this.birthday;
	}
	
	
}



