package com.anhen.day6;

public class Textcar {
	public static void main(String[] args){
		//�������ʵ��
	Car car1 = new Car();
	System.out.println(car1.color);
	System.out.println(car1.speed);
	//�޸Ķ��������
	car1.color = "��ɫ";
	car1.speed = 100;
	System.out.println(car1.color);
	//���ö���ķ���
	car1.run(2);
	String logo = car1.getlogo();
	System.out.println(logo);
	//���ݲ���
	String n = "����";
	int a = 20;
	int speed = 100;
	car1.show(n,a,speed);//ʵ�ε���
	//�����µĶ���
	Car car2 =  new Car();
	System.out.println("car2����ɫ"+car2.color);
	car2.speed = 150;
	car2.run(3);
	
	}
}
