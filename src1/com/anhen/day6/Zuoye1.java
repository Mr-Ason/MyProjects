//package com.anhen.day6;
//
//public class Zuoye1 {//������
//	public static void main(String[] args) {//������ �������
//	Student student1 = new Student("������","��",18,1.7,01,50);
//	student1.show();//���ҽ���
//	student1.student();
//	Student student2 = new Student("С����","Ů",16,1.9,02,49);
//	student2.show();//���ҽ���
//	student2.student();
//	Student student3 = new Student("������","��",17,1.8,03,55);
//	student3.show();//���ҽ���
//	student3.student();
//	//�Ƚ����
//	student1.showHeight(student2,student3);
//	}
//}
//class Student{
////����
//	public String name;
//	public String sex;
//	public int age;
//	public double height;
//	public int studentnumber;
//	public double weight;
//	//���췽��  ���������ó�ʼֵ
//		public Student(String name,String sex,int age,double height,int studentnumber,double weight){
//			//System.out.println("�����˹��췽��");
//			this.name = name;
//			this.sex = sex;
//			this.age = age;
//			this.height=height;
//			this.studentnumber = studentnumber;
//			this.weight = weight;
//		}
//	
//	//����
//	public void show(){
//		System.out.println("������"+this.name+"\t�Ա�"+this.sex+"\t����: "+this.age+"\t��ߣ�"+this.height+"\tѧ�ţ�"+this.studentnumber+"\t���أ�"+this.weight);
//	}
//	public void showHeight( Student stu2,Student stu3 ){
//		if(this.height>stu2.height && this.height>stu3.height){
//			System.out.println(this.name+"����");
//			
//		}else if(stu2.height>stu3.height){
//			System.out.println(stu2.name+"����");
//		}else {
//			System.out.println(stu3.name+"����");
//		}
//	}
//	//���췽��
//	public void student(){
//		System.out.println("������رȣ�"+(this.height/this.weight));
//	}
//}
//
//
//
//
