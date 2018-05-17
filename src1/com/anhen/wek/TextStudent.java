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
		
		
		Student students0 = new Student("��1",1,89);
		Student students1 = new Student("��2",1,89);
		Student students2 = new Student("��3",1,89);
		Student students3 = new Student("��4",2,89);
		Student students4 = new Student("��5",2,89);
		Student students5 = new Student("��6",2,89);
		Student students6 = new Student("��7",3,89);
		Student students7 = new Student("��8",3,89);
		Student students8 = new Student("��9",3,89);
		Student students9 = new Student("��10",3,89);
		
		//�����༶map
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
		
		//1.���ѧ��
		
		//��ѧ�����з���
		for(int i = 0;i<students.size();i++){
			Student stu =  students.get(i);//��ȡѧ��
			int classNumber = stu.getClassNumber();//��ȡѧ���༶��
			
			if(map.containsKey(classNumber)){//���ڰ༶��
				List<Student> list = map.get(classNumber);//��map��ȡ�ð༶��
				list.add(stu);
			}else{//�����ڰ༶��
				List<Student> list = new ArrayList<Student>();//����༶����
				list.add(stu);
				map.put(classNumber, list);//���༶�� key��ѧ��list����map��
				
			}
		}	
		System.out.print(map);
		
	} 
	
}

class Student{
	//����
	private String name;
	private int classNumber;
	private double score;
	
	//����
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
		return "����:"+name+"�༶:"+classNumber+"�ɼ�:"+score;
		
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
