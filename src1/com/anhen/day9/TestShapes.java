package com.anhen.day9;
//��������ת��
public class TestShapes {
	public static void main(String[] args) {
		Shape shape =  new Shape();
		shape.show();
		Circle circle = new Circle();
		circle.showCirlce();
		circle.show();
	}
}
//����
class Shape{
	public void show (){
		System.out.println("���Ǹ��෽��");
	}
}
//����
class Circle extends Shape{
	public void showCirlce(){
		System.out.println("��������ķ���");
	}
	
//    public void show(){
//    	
//		System.out.println("��д����ķ���");
//	}
    public void show(){
    	super.show();
    }
}













