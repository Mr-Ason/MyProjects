package com.anhen.day7;

public class TestCars {
	public static void main(String[] args){
		//ʵ����Car��
		Car car = new Car();
		//ֱ�ӵ���Car���color���� ���õ�ֵ
		System.out.println(car.color);
		//����Car���color���ԣ����޸�����ֵ
		car.color="��ɫ";
		System.out.println(car.color);
		//����Car���run()����
		car.speed=65.0;
		car.run(2);
		//����getLogo() ����
		car.getLogo();
		System.out.println(car.getLogo());//ֱ�Ӵ�ӡ
		String logo = car.getLogo();//��һ���ַ���������Ϊ�˷���������յĶ�������
		System.out.println(logo);
		
		//����show()����  �����Ĵ���
		car.show("����", 20);//ʵ��
		
		String n = "����";
		int a =20;
		//String s = car.show(n, a);//ӦΪ���������ǿ� ���Բ��ܽ���
		car.show(n, a);
		
		//�����¶��� ֤���¶���֮����Զ���
		Car car1 = new Car();
		System.out.println("car1����ɫ��"+car1.color);
		car1.speed=150;
		car1.run(2);
	}
	
	

}
