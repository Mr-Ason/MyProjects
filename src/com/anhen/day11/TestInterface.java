package com.anhen.day11;
/*接口：有全局变量和抽象方法组成
 * 
 * 和抽象类的区别：
 * 1、共同点：都可以实现多态；
 * 2、抽象类可提供成员方法的实现，接口都是抽象方法；
 * 3、接口中成员变量只能是public static final的，抽象类不限；
 * 4、接口中不能有静态代码块及静态方法，抽象类不限；
 * 5、一个类只能继承一个抽象类，却可以继承多个接口；
 * 6、抽象类是对一类事物的抽象，而接口是对行为的抽象；
 * 7、抽象作为父类，是一种模板式设计；接口是一种行为规范，是辐射式设计。
 * 8、使用抽象类的动机是代码的复用，使用接口的动机是，实现多态；
 * */
public interface TestInterface {
	String NAME = "刘继东";// 默认为public static final String NAME = "刘继东";
		
   //抽象方法
	public void test();
}
//接口继承接口
interface sonInterface extends  TestInterface{
	public void sonTest();
}

class Test extends  Object implements  TestInterface,sonInterface{

	@Override
	public void sonTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}
