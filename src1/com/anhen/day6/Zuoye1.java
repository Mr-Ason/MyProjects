//package com.anhen.day6;
//
//public class Zuoye1 {//定义类
//	public static void main(String[] args) {//主方法 程序入口
//	Student student1 = new Student("二麻子","男",18,1.7,01,50);
//	student1.show();//自我介绍
//	student1.student();
//	Student student2 = new Student("小麻子","女",16,1.9,02,49);
//	student2.show();//自我介绍
//	student2.student();
//	Student student3 = new Student("大麻子","男",17,1.8,03,55);
//	student3.show();//自我介绍
//	student3.student();
//	//比较身高
//	student1.showHeight(student2,student3);
//	}
//}
//class Student{
////属性
//	public String name;
//	public String sex;
//	public int age;
//	public double height;
//	public int studentnumber;
//	public double weight;
//	//构造方法  对属性设置初始值
//		public Student(String name,String sex,int age,double height,int studentnumber,double weight){
//			//System.out.println("调用了构造方法");
//			this.name = name;
//			this.sex = sex;
//			this.age = age;
//			this.height=height;
//			this.studentnumber = studentnumber;
//			this.weight = weight;
//		}
//	
//	//方法
//	public void show(){
//		System.out.println("姓名："+this.name+"\t性别："+this.sex+"\t年龄: "+this.age+"\t身高："+this.height+"\t学号："+this.studentnumber+"\t体重："+this.weight);
//	}
//	public void showHeight( Student stu2,Student stu3 ){
//		if(this.height>stu2.height && this.height>stu3.height){
//			System.out.println(this.name+"更高");
//			
//		}else if(stu2.height>stu3.height){
//			System.out.println(stu2.name+"更高");
//		}else {
//			System.out.println(stu3.name+"更高");
//		}
//	}
//	//构造方法
//	public void student(){
//		System.out.println("身高体重比："+(this.height/this.weight));
//	}
//}
//
//
//
//
