package com.anhen.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestConnections {

	public static void main(String[] args) throws ParseException {
		// ����ѧ������
		List<Student1> stu = new ArrayList<Student1>();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date date1 = sdf.parse("1992-04-12");
	    Date date2 = sdf.parse("1996-04-07");
		Student1 stu1 = new Student1("����",22,date1);
		Student1 stu2 = new Student1("����s",23,date2);
		//����ѧ������
		stu.add(stu1);
		stu.add(stu2);
		//����
		System.out.println("δ����ģ�");
		for(int i = 0;i<stu.size();i++){
			System.out.println(stu.get(i));
		}
		
		//����
		Collections.sort((List<Student1>) stu);
		System.out.println("����ģ�");
		for(int i = 0;i<stu.size();i++){
			System.out.println(stu.get(i));
		}

	}

}
class Student1 implements Comparable<Student1>{
	private String name;
	private int age;
	private Date birth;
	//��дtoString
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");//��ʽ��ʱ��
		String time = sdf.format(this.birth);
		return "����:"+this.name+",����:"+this.age+",����:"+time;
	}
	//ʵ�ֱȽϽӿڵķ���
		@Override
		public int compareTo(Student1 arg0) {
			// ����Ƚ� -1����
			if(this.age>arg0.age){}
			return -1 ;
		}
	
	public Student1(String name, int age, Date birth) {
		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
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
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	
	
}

