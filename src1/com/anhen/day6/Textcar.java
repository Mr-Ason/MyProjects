package com.anhen.day6;

public class Textcar {
	public static void main(String[] args){
		//创建类的实例
	Car car1 = new Car();
	System.out.println(car1.color);
	System.out.println(car1.speed);
	//修改对象的属性
	car1.color = "红色";
	car1.speed = 100;
	System.out.println(car1.color);
	//调用对象的方法
	car1.run(2);
	String logo = car1.getlogo();
	System.out.println(logo);
	//传递参数
	String n = "张三";
	int a = 20;
	int speed = 100;
	car1.show(n,a,speed);//实参调用
	//创建新的对象
	Car car2 =  new Car();
	System.out.println("car2的颜色"+car2.color);
	car2.speed = 150;
	car2.run(3);
	
	}
}
