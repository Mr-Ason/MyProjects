package com.anhen.day16;

import java.util.ArrayList;
import java.util.*;


public class TextEmployee {
	public static void main(String [] args){
		
		Employee[] employee = new Employee[999999];
		employee[1] = new Employee("С��",22,10600.5);
		employee[2] = new Employee("С��",23,16600.6);
		employee[3] = new Employee("С��",21,14600.3);
		employee[4] = new Employee("С��",20,16200.7);
		employee[5] = new Employee("С��",24,14900.9);
		employee[6] = new Employee("С��",25,15900.4);
		employee[7] = new Employee("Сѩ",22,16900.4);
		//��������
		ArrayList al = new ArrayList();
		
		//1.���Ԫ��   ������Employee�������List�С����Ԫ�ء�������5��Employee����
		al.add(employee[1]);
		al.add(employee[2]);
		al.add(employee[3]);
		al.add(employee[4]);
		al.add(employee[5]);
		al.add(employee[6]);
		//��������
//		Iterator it =  al.iterator();
//		while(it.hasNext()){
//			sop(it.next());
//		}
		//2.��ȡ����Ԫ��      
		for(int i = 0;i<al.size();i++){
			sop("����("+i+")="+al.get(i));
		}
		sop("**************************");
		//3.�ڵ�����Employee�������һ����Employee����
		al.add(3,employee[7]);
		for(int i = 0;i<al.size();i++){
			sop("����("+i+")="+al.get(i));
		}
		sop("**************************");
		//4.ɾ���ڶ���Employee������Ϣ
		al.remove(2);
		for(int i = 0;i<al.size();i++){
			sop("����("+i+")="+al.get(i));
		}
		sop("**************************");
		//5.�ж�ĳ��Employee�Ƿ�����ڸü������� ��ͨ��indexof��ȡ����λ�ã�
		sop("ndexof:"+al.indexOf(employee[2]));
		List sub = al.subList(1, 6);//���б�
		sop("sub:"+sub);

		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

}

class Employee{
	//����
	private String name;
	private int age;
	private double salary;
	
	//�޲ι���
	public Employee(){
		
	}
	//���ι���
	public Employee(String name,int age,double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String toString(){
		return "����:"+this.name+"����:"+this.age+"н��:"+this.salary;
	}
	//set ��get����
	public void setName(String name){
		this.name= name;
	}
	public String getName(String name){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(int age){
		return age;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(double salary){
		return salary;
	}
	
	public void show(){
		System.out.println();
	}
}




























