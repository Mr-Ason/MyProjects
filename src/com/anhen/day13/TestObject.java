package com.anhen.day13;

public class TestObject {

	public static void main(String[] args) {
		//����ѧ����
		Student1 stu1 = new Student1("����",12,1001);
		Student1 stu2 = new Student1("����",12,1001);
		
		//�����ַ
		System.out.println(stu1);
		System.out.println(stu2.toString());
		//�ж��ǲ���ͬһ����
		System.out.println(stu1.equals(stu2));//Ĭ�ϵ��õ� ==
		System.out.println(stu1==stu2);//false
		
	}

}
class Student1{
	public String name;
	public int age;
	public int id;
	
	public Student1(){}
	public Student1(String name,int age,int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public void show(){
		
	}
	//��дobject����
	public String toString(){
		//return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return "������"+this.name +"���䣺"+this.age +"ѧ�ţ�"+this.id;
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}else{
			if(obj instanceof Student1){
				Student1 stu =(Student1)obj;
				if(this.name.equals( stu.name )&& this.age == stu.age && this.id == stu.id){
					return true;
				}
			}
		}
		return false;
	}
	public int hashCode(){
		return 0;
		
	}
}