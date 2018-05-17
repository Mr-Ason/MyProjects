package com.anhen.day9;

//import com.anhen.day9.Outer.Inner;

/*static 
 *   类  可以修饰内部类，先与类的对象存在
 *   构造代码块  无论类被使用多少次 代码块只执行一次
 *   属性   类中共用的统一的属性
 *   方法  类中共用的统一的方法  直接 类名.方法  调用
 *   
 *final 
 *   类   这个类不能被继承
 *   构造代码块    没意义
 *   属性    将属性转换未常量（不可修改）
 *   方法   子类不能重写这个方法 
 * 
 * */

public class TesModifiler {

	public static void main(String[] args) {
	//	Inner in = new Inner();
		Outer ou = new Outer();
		Outer ou1 = new Outer();
		
		//调用静态属性方法
		
		System.out.println(Outer.name);
		
	}

}

class Outer{
	public   static String name="调用静态方法";
	{//用static修饰代码块 那么无论创建多少个对象 都只执行一次
		name = "ceshi";
		System.out.println("执行了代码块:"+name);
	}
	public Outer(){//先执行代码块 再执行构造方法
		System.out.println("构造方法");
	}
//	static class Inner{
//		
//	}
}
