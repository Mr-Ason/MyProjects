package com.anhen.mytest;
//static����������ʱ���ж������
public class Static {

	public static void main(String[] args) {
		Persons per1 = new Persons("����",20);//ʵ��������
		Persons per2 = new Persons("����",22);//ʵ��������
		Persons per3 = new Persons("����",25);//ʵ��������
		System.out.println("~~~~~�޸�ǰ~~~~~");
		per1.showInfo();
		per2.showInfo();
		per3.showInfo();
		System.out.println("~~~~~�޸ĺ�~~~~~");
		Persons.country = "�Ϻ�";
		
		per1.showInfo();
		per2.showInfo();
		per3.showInfo();
	}

}
//�����˵���Ϣ��
class Persons{
	private String name;
	private int age;
	static String country = "�ɶ�";
	
	public void showInfo(){
		System.out.println("������"+this.name+",���䣺"+this.age+",���У�"+country);
	}
	
	
	//���췽��
	public Persons(){
		
	}
	public Persons(String name,int age){
		this.name = name;
		this.age = age;
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
}