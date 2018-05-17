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

public class Test序列化和反序列化 {

	public static void main(String[] args) {
		String path = "D:\\6.txt";
		//序列化
		TestObjectOutputStream(path);
		//反序列化
		TestObjectInputStream(path);
	}
	public static void TestObjectInputStream(String path){
		try(  
				//1.字节流
				InputStream input = new FileInputStream(path);
				//2.反对象序列化流
				ObjectInputStream objectStream =new ObjectInputStream(input);
				
				){
			   //3.反序列化
//			   Student stu = (Student) objectStream.readObject();
//			   System.out.println(stu.name+","+stu.age);
			   
			  List<Student> students = (ArrayList<Student>)objectStream.readObject();
			   for(Student stu:students){
				   System.out.println(stu);
			   }
			
			   System.out.println("反序列化成功！");
			
			
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
			//1、字节流
			OutputStream out = new FileOutputStream(path,true);
			//2、对象序列化流
			ObjectOutputStream objectStream = new ObjectOutputStream(out);
				//3.2、序列化Student   序列化集合
			List<Student> students = new ArrayList<Student>();
		    students.add(new Student("lisi",23));
		    students.add(new Student("lis",13));
		    students.add(new Student("liei",23));
			objectStream.writeObject(students);//java.io.NotSerializableException
			  //3.3  序列化List<Student>
			System.out.println("序列化成功");
			//4、关闭流
			objectStream.close();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

//创建类  类必须实现自己的Serializabele接口 ，才能序列化和反序列化
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
		return String.format("姓名：%s,年龄：%d", this.name,this.age);
	}
}
