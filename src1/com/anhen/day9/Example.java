package com.anhen.day9;

public class Example {
	public static void main(String [] args){
//	Vehicle vehicle = new Vehicle("�µ�","����ɫ",4);//���δ�ӡ
//	System.out.println("���ƣ�"+vehicle.name+"��ɫ��"+vehicle.color);
//	System.out.println(vehicle.name);//�޲θ�ֵ��ӡ
	Car car = new Car();//��������޲�
	car.name = "�µ�Q7";
	car.color = "����ɫ";
	car.seat =  2;
	car.size = "����";
	System.out.println("���ƣ�"+car.name+"\t��ɫ��"+car.color+"\t���Σ�"+car.seat+"\t��С��"+car.size);
	
	}

}

class Vehicle{
	//����
	 public String name;
	 public  String color;
	 public int seat;
	
	//����
	public Vehicle(){
		this.name = "�µ�";//�޲θ�ֵ
		//System.out.println("ado");
	}
	public Vehicle(String name,String color,int seat){
		this.name = name;
		this.color = color;
		this.seat = seat;
	}
//	public void show(){
//		System.out.println("mingzi"+this.name);  ��ӡ
//	
//	}
}
	//�̳�
 class Car extends Vehicle{
		public String size;
		public void setSize(String size){
			this.size = size;
		}
		public String getSize(){
			return this.size;
		}
	}










