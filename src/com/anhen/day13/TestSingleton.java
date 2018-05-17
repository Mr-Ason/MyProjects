package com.anhen.day13;
/*单列模式：
 *  内存中只能有一个改类的实例
 *  1、在系统中，业务逻辑只能有一个改类的实例，一般这个类属于业务核心类。如管理类、经济操作类。
 *  2、当一个类中包含了大量的资料，消耗内存资源严重，使用单列。
 *  3、工具类，实现功能，可重复使用；
 *  
 *  静态方法：线程不安全  ,当同时调用时，可能生出不同的对象。
 *  静态代码块：线程安全 
 * */
public class TestSingleton {

	public static void main(String[] args) {
	/*	Singleton1 sig = Singleton1.getSingleton1();
		Singleton1 sig2 = Singleton1.getSingleton1();
		System.out.println(sig == sig2);//判断是否相等*/

	}

}
class Singleton2{
	//1.私有静态属性
	private static Singleton2 singleton;
	static{
		singleton = new Singleton2();
	}
	//2.私有构造方法
	private Singleton2(){}
	//3.静态方法访问
	public static Singleton2 getSingleton(){
		return singleton;
		
	}
}

/*//静态方法
class Singleton1{
	//3、私有化一个改类数据类型的属性
	private static Singleton1 singleton;
	//1、私有化构造方法
	private  Singleton1(){}
	//2、公开静态的获得改类对象的方法
	public static Singleton1 getSingleton1(){//静态方法只能访问静态属性
		if(singleton == null){//保证每次只实例化一个对象
			singleton = new Singleton1();
		}
		
		return singleton;
	}
}*/
