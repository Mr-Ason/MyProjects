package com.anhen.day9;
//父子类型转换
public class TestShapes {
	public static void main(String[] args) {
		Shape shape =  new Shape();
		shape.show();
		Circle circle = new Circle();
		circle.showCirlce();
		circle.show();
	}
}
//父类
class Shape{
	public void show (){
		System.out.println("这是父类方法");
	}
}
//子类
class Circle extends Shape{
	public void showCirlce(){
		System.out.println("这是子类的方法");
	}
	
//    public void show(){
//    	
//		System.out.println("重写父类的方法");
//	}
    public void show(){
    	super.show();
    }
}













