package com.anhen.day9;

public class Example {
	public static void main(String [] args){
//	Vehicle vehicle = new Vehicle("奥迪","银灰色",4);//带参打印
//	System.out.println("名称："+vehicle.name+"颜色："+vehicle.color);
//	System.out.println(vehicle.name);//无参赋值打印
	Car car = new Car();//子类调用无参
	car.name = "奥迪Q7";
	car.color = "银灰色";
	car.seat =  2;
	car.size = "精致";
	System.out.println("名称："+car.name+"\t颜色："+car.color+"\t座椅："+car.seat+"\t大小："+car.size);
	
	}

}

class Vehicle{
	//属性
	 public String name;
	 public  String color;
	 public int seat;
	
	//方法
	public Vehicle(){
		this.name = "奥迪";//无参赋值
		//System.out.println("ado");
	}
	public Vehicle(String name,String color,int seat){
		this.name = name;
		this.color = color;
		this.seat = seat;
	}
//	public void show(){
//		System.out.println("mingzi"+this.name);  打印
//	
//	}
}
	//继承
 class Car extends Vehicle{
		public String size;
		public void setSize(String size){
			this.size = size;
		}
		public String getSize(){
			return this.size;
		}
	}










