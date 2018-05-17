package com.anhen.day13;
/*单利例式：
 *   内存中只能有一个该类的实例
 *   1、在系统中业务逻辑只能有一个该类的实例，一般这个类属于业务核心类。如管理类、经济操作类；
 *   2、当一个类包含大量资料，消耗内存资源严重，使用单例。
 *   3、工具类，实现功能，可重复使用。
 *   
 *   静态方法：线程不安全，当同时调用时可能生产不同的对象。
 *   静态代码快安全
 */
public class TextSingleton {
	public static void main(String [] args){
		
		Singleton single = Singleton.getSingleton();
		Singleton single2 = Singleton.getSingleton();
		
		System.out.println(single==single2);
	}
}
//静态代码快
//class Singleton{
//	//1.私有静态属性
//	@SuppressWarnings("unused")
//	private static Singleton singleton;
//	//静态代码块
//	static {
//		singleton = new Singleton();
//	}
//	
//	
//	//2.私有构造方法
//	private Singleton(){
//		
//	}
//	//3.静态访问方法
//	public  static Singleton getSingleton(){
//		return null;
//	}	
//}

//静态方法   会被反复调用  导致线程不安全
class Singleton{
	//3.私有化一个该类数据类型的属性
	private static Singleton singleton;//默认值 null
	//1.私有化构造方法
	private Singleton(){
		
	}
	//2.公开静态的获得该类对象方法
	public  static Singleton getSingleton(){
		//singleton = new Singleton();//有这个结果为false
		if(singleton==null){
			singleton = new Singleton();
			//return singleton;
		}
		return singleton;
	}
	
}




