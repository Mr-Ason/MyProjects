package com.anhen.wek;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.*;



public class TextStudent {
	
	public static void main(String[] args){
		
		
		Student students0 = new Student("张1",1,89);
		Student students1 = new Student("张2",1,89);
		Student students2 = new Student("张3",1,89);
		Student students3 = new Student("张4",2,89);
		Student students4 = new Student("张5",2,89);
		Student students5 = new Student("张6",2,89);
		Student students6 = new Student("张7",3,89);
		Student students7 = new Student("张8",3,89);
		Student students8 = new Student("张9",3,89);
		Student students9 = new Student("张10",3,89);
		
		//创建班级map
		Map<Integer,List<Student>> map = new HashMap<Integer,List<Student>>();
		
		
		List<Student> students = new ArrayList<Student>();
		students.add(students0);
		students.add(students1);
		students.add(students2);
		students.add(students3);
		students.add(students4);
		students.add(students5);
		students.add(students6);
		students.add(students7);
		students.add(students8);
		students.add(students9);
		
		//1.添加学生
		
		//对学生进行分组
		for(int i = 0;i<students.size();i++){
			Student stu =  students.get(i);//获取学生
			int classNumber = stu.getClassNumber();//获取学生班级号
			
			if(map.containsKey(classNumber)){//存在班级号
				List<Student> list = map.get(classNumber);//从map中取得班级号
				list.add(stu);
			}else{//不存在班级号
				List<Student> list = new ArrayList<Student>();//各班班级集合
				list.add(stu);
				map.put(classNumber, list);//将班级号 key和学生list放如map中
				
			}
		}	
		System.out.print(map);
		
	} 
	
}

class Student{
	//属性
	private String name;
	private int classNumber;
	private double score;
	
	//方法
	public Student(String string, String string2, int i){
		
	}
	public static Student get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Student(String name,int classNumber,double score){
		this.name = name;
		this.classNumber = classNumber;
		this.score = score;
	}
	@Override
	public String toString(){
		return "姓名:"+name+"班级:"+classNumber+"成绩:"+score;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
