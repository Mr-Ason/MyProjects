package com.anhen.day15;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args){
	/*	//�������
		StudentManager manager = new StudentManager();
		Student[] students = manager.getStudents();
		for(Student student : students){//��д��toString ��������д
			System.out.println(student);
		
		}*/
		//
		StudentManager manager= new StudentManager();
		//����ѧ����Ϣ
		ArrayList students = manager.getStudents();
		System.out.println("ѧԱ��Ϣ��"+students.get(0));
		manager.addStudent(new Student("��",25,62.5,2017090901,"1991-09-19"));
		manager.showStudents();
	}

}
//������
class StudentManager{
	private ArrayList students =new ArrayList() ;
		public StudentManager(){
			//students = new Student[5];
			students.add(new Student("����",25,62.5,2017090901,"1991-09-19")) ;
			students.add(new Student("����",23,60.5,2017090902,"1990-06-11") );
			students.add(new Student("����",21,70.5,2017090903,"1993-09-29"));
			students.add(new Student("����",24,80.5,2017090904,"1990-08-09"));
			students.add(new Student("����",20,55.5,2017090905,"1992-09-09") );
		}
		//����ѧԱ
		public void addStudent(Student student){
			this.getStudents().add(student);
		}
		//ɾ��ѧԱ
		public void removeStudent(int index){
			this.getStudents().remove(index);
		}
		//
		public void showStudents(){
			System.out.println("����ѧ����Ϣ��");
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

//ѧ����
class Student{
	private String name;
	private int age;
	private double weight;
	private int id;
	private String birthday;
	
	
	public Student(){//�޲ι���
		
	}

public Student(String name, int age, double weight, int id, String birthday) {//�вι���
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.id = id;
		this.birthday = birthday;
	}
	@Override
	public String toString() {//��д
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



