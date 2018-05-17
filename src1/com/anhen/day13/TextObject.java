package com.anhen.day13;

public class TextObject {
	public static void main(String [] args){
		Student stu1= new Student ("����" ,20,10001);
		Student stu2= new Student ("����" ,20,10001);
		
		//�����ַ
		System.out.println(stu1);
		System.out.println(stu2.toString());
		//�ж������Ƿ����         ϵͳĬ�ϵ�ַ���  ���Ǹ�Ϊĳ���������
		System.out.println(stu1.equals(stu2));//������д�����
		System.out.println(stu1==stu2);//��Զ false
	}

}
class Student{
	public String name;
	public int age;
	public int id;
	 
	public Student(){
		
	}
	public Student(String name,int age,int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//��дObject
	public String toString() {
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
        return "������"+this.name+"���䣺"+this.age +"ѧ�ţ�"+this.id;
	}
	//��д equals
	public boolean equals(Object obj){
		if(this ==obj){
			return true;
		}else{
			if(obj instanceof Student){
				Student stu = (Student)obj;
				if(this.name.equals(stu.name)&&this.age==stu.age&&this.id==stu.id){
					   return true;
				}
			}else{
				return false;
			 }
		 }
		return false;
	}
	 public int hashCode(){
		return 0; 
	 }
	
	
}