package com.anhen.day13;

public class TestAbstractFactory {

	public static void main(String[] args) {
		//���󹤳�������Ʒ
		Factory2 f2 = Factory2.getCarFactory();

	}

}
//���󹤳�
abstract class Factory2{
	public abstract Factory2 getFactory();
	public static Factory2 getCarFactory(){
		return new CarFactory1();
	}
	
}

//ʵ�ֹ���
class CarFactory1 extends Factory2{
	 CarFactory1(){} 
	
	@Override
	public Factory2 getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public static  String  getBaoMaCar(){
		return "����";
		}
	
}

