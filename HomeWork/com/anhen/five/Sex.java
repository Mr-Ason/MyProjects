package com.anhen.five;

import java.util.Arrays;
import java.util.Comparator;
//對象排序
public class Sex {
	public static void main(String[] args){
		Student[] stu = {new Student("琳",23),new Student("林玲",25),new Student("倪兒",22)};
		StudentsComparator sc = new StudentsComparator();
		Arrays.sort(stu,sc);
		for(int i = 0;i<stu.length;i++){
			System.out.println(stu[i]);
		}
	}
	

}

class Student{
	private String name;
	private int age;
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//覆寫equals方法
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Students)){
			return false;
		}
		Student stu = (Student) obj;
		if(this.name.equals(stu.name)&&this.age==stu.age){
			return true;
		}else{
			return false;
		}
	}
	public String toString(){
		return name+"\t"+age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	
}
//定義比較規則 comparator
class StudentsComparator implements Comparator<Student>{

	@Override
	public int compare(Student stu01, Student stu02) {
		// TODO Auto-generated method stub  1:表示大於  -1：表示小於  0：表示等於
		if(stu01.equals(stu02)){
			return 0;
		}else if(stu01.getAge()<stu02.getAge()){
			return 1;
		}else{
			return -1;
		}
	}
	
}
