package com.anhen.day7;

public class TestCars {
	public static void main(String[] args){
		//实例化Car类
		Car car = new Car();
		//直接调用Car类的color属性 并得到值
		System.out.println(car.color);
		//调用Car类的color属性，并修改属性值
		car.color="黑色";
		System.out.println(car.color);
		//调用Car类的run()方法
		car.speed=65.0;
		car.run(2);
		//调用getLogo() 方法
		car.getLogo();
		System.out.println(car.getLogo());//直接打印
		String logo = car.getLogo();//用一个字符串接收是为了方便对所接收的东西操作
		System.out.println(logo);
		
		//调用show()方法  参数的传递
		car.show("李四", 20);//实参
		
		String n = "张三";
		int a =20;
		//String s = car.show(n, a);//应为方法返回是空 所以不能接收
		car.show(n, a);
		
		//创建新对象 证明新对象之间相对独立
		Car car1 = new Car();
		System.out.println("car1的颜色："+car1.color);
		car1.speed=150;
		car1.run(2);
	}
	
	

}
