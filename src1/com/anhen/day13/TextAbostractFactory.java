package com.anhen.day13;

public class TextAbostractFactory {
	@SuppressWarnings({ "static-access", "unused" })
	public static void main (String[] args){
		//���󹤳� �� ����Ʒ
		@SuppressWarnings("unused")
		Factory carFactory = Factory.getCarFactory();
		System.out.println(Factory.getCarFactory().getBaoMaCar());
		
		
	}

}
//���󹤳�
abstract class Factory{
	public abstract Factory getFactory();//����  ��ù���
	public static CarFactory getCarFactory(){//���ʵ�ֹ���
	  return new CarFactory();	 
	}
}
//ʵ�ֹ���
class CarFactory extends Factory{ //�̳�
	CarFactory(){
		
	}
	@Override
	public Factory getFactory() {//�Լ�ʵ��������
		
		return null;
	}
	public static String getBaoMaCar(){//�ṩ����
		return "����";
	}
}


