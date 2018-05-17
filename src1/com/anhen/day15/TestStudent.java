package com.anhen.day15;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args){
	/*	//数组访问
		StudentManager manager = new StudentManager();
		Student[] students = manager.getStudents();
		for(Student student : students){//重写了toString 可以这样写
			System.out.println(student);
		
		}*/
		//
		StudentManager manager= new StudentManager();
		//访问学生信息
		ArrayList students = manager.getStudents();
		System.out.println("学员信息："+students.get(0));
		manager.addStudent(new Student("张",25,62.5,2017090901,"1991-09-19"));
		manager.showStudents();
	}

}
//管理类
class StudentManager{
	private ArrayList students =new ArrayList() ;
		public StudentManager(){
			//students = new Student[5];
			students.add(new Student("张三",25,62.5,2017090901,"1991-09-19")) ;
			students.add(new Student("李四",23,60.5,2017090902,"1990-06-11") );
			students.add(new Student("王五",21,70.5,2017090903,"1993-09-29"));
			students.add(new Student("赵六",24,80.5,2017090904,"1990-08-09"));
			students.add(new Student("王七",20,55.5,2017090905,"1992-09-09") );
		}
		//新增学员
		public void addStudent(Student student){
			this.getStudents().add(student);
		}
		//删除学员
		public void removeStudent(int index){
			this.getStudents().remove(index);
		}
		//
		public void showStudents(){
			System.out.println("所有学生信息：");
			for(int i = 0;i<this.getStudents().size();i++){
				System.out.println(this.getStudents().get(i));
				
			}
		}
		
		public ArrayList getStudents(){
			return students;
		}
		public void setStudents(Student[] student){
			this.students = students;
			
		}
	
}

//学生类
class Student{
	private String name;
	private int age;
	private double weight;
	private int id;
	private String birthday;
	
	
	public Student(){//无参构造
		
	}

public Student(String name, int age, double weight, int id, String birthday) {//有参构造
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.id = id;
		this.birthday = birthday;
	}
	@Override
	public String toString() {//重写
		return "Student [name=" + name + ", age=" + age + ", weight=" + weight + ", id=" + id + ", birthday=" + birthday
				+ "]";
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}		



