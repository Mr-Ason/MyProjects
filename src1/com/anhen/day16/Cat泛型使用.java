package com.anhen.day16;

public class Cat����ʹ�� {
	public static void main(String [] args){
		Cats<String> cats = new Cats<String>();
		cats.setName("��è");
		String name = cats.getName();//��������� name�����ȡ��  ���� nameֵ
		System.out.println(name);
		cats.show();
		Car<String> car = new Car<String>();
		car.setName("��");
		String name1 = car.getName();//
		System.out.println(name1);
		
	}
}
//car��
class Car<C>{
	private C name;
	
	public Car(){
		
	}
	public Car(C name){
		this.name = name;
	}
	public void  setName(C name){
		this.name = name;
	}
	public C getName(){
		return name;
	}
	
}
//Cat��
class Cats<T>{
	//����
	private T name;
	
	//�޲ι��� ��ʼ������
	public Cats(){
		
	}
	public Cats(T name){
		this.name =name;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public void show(){
		System.out.println("è����"+this.name);

	}
}	
