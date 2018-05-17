package com.anhen.day16;

public class Cat泛型使用 {
	public static void main(String [] args){
		Cats<String> cats = new Cats<String>();
		cats.setName("是猫");
		String name = cats.getName();//定义变量名 name（随便取）  接收 name值
		System.out.println(name);
		cats.show();
		Car<String> car = new Car<String>();
		car.setName("车");
		String name1 = car.getName();//
		System.out.println(name1);
		
	}
}
//car类
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
//Cat类
class Cats<T>{
	//属性
	private T name;
	
	//无参构造 初始化属性
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
		System.out.println("猫名："+this.name);

	}
}	
