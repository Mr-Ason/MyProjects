package com.anhen.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Test���л��ͷ����л� {

	public static void main(String[] args) {
		String path = "D:\\6.txt";
		//���л�
		TestObjectOutputStream(path);
		//�����л�
		TestObjectInputStream(path);
	}
	public static void TestObjectInputStream(String path){
		try(  
				//1.�ֽ���
				InputStream input = new FileInputStream(path);
				//2.���������л���
				ObjectInputStream objectStream =new ObjectInputStream(input);
				
				){
			   //3.�����л�
//			   Student stu = (Student) objectStream.readObject();
//			   System.out.println(stu.name+","+stu.age);
			   
			  List<Student> students = (ArrayList<Student>)objectStream.readObject();
			   for(Student stu:students){
				   System.out.println(stu);
			   }
			
			   System.out.println("�����л��ɹ���");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

	 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void TestObjectOutputStream(String path){
		try{
			//1���ֽ���
			OutputStream out = new FileOutputStream(path,true);
			//2���������л���
			ObjectOutputStream objectStream = new ObjectOutputStream(out);
				//3.2�����л�Student   ���л�����
			List<Student> students = new ArrayList<Student>();
		    students.add(new Student("lisi",23));
		    students.add(new Student("lis",13));
		    students.add(new Student("liei",23));
			objectStream.writeObject(students);//java.io.NotSerializableException
			  //3.3  ���л�List<Student>
			System.out.println("���л��ɹ�");
			//4���ر���
			objectStream.close();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

//������  �����ʵ���Լ���Serializabele�ӿ� ���������л��ͷ����л�
class Student implements Serializable {
	public String name;
	public int age ;
	
	public Student(){
		
	}
	public Student (String name,int age){
		this.name = name;
		this.age = age;
		
	}
	public String toString(){
		return String.format("������%s,���䣺%d", this.name,this.age);
	}
}
