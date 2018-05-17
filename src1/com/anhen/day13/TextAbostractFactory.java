package com.anhen.day13;

public class TextAbostractFactory {
	@SuppressWarnings({ "static-access", "unused" })
	public static void main (String[] args){
		//抽象工厂 生 产产品
		@SuppressWarnings("unused")
		Factory carFactory = Factory.getCarFactory();
		System.out.println(Factory.getCarFactory().getBaoMaCar());
		
		
	}

}
//抽象工厂
abstract class Factory{
	public abstract Factory getFactory();//方法  获得工厂
	public static CarFactory getCarFactory(){//获得实现工厂
	  return new CarFactory();	 
	}
}
//实现工厂
class CarFactory extends Factory{ //继承
	CarFactory(){
		
	}
	@Override
	public Factory getFactory() {//自己实例化对象
		
		return null;
	}
	public static String getBaoMaCar(){//提供车子
		return "宝马";
	}
}


