//package com.anhen.day8;
////构造方法
///*1、构造方法的作用：对成员属性初始化（赋值）
// * 2、构造方法的语法：
// * 	    修饰符  类名（）{ 
// * 		 语句
// * }
// * 3、注意事项：
// *       1）当类中没有定义任何构造方法时，编译器会自动会自动补全一个无参构造方法，所有成员属性都赋值为默认值
// *       2）当在类中写了任意一个构造方法，编译器都不会再自动补全一个构造方法，如果没有进行成员属性的赋值，编译器不会自动补全（属性为默认值）
// *       3）一个类中可以有多个构造方法，构造方法彼此调用通过this()，this()不能在普通方法中调用，必须在构造方法中的第一行使用
// *            构造方法配合  new 关键字，实例化对象；不能通过对象打点的方式调用
// *            
// *  4、重载：同一个类里面多个方法同名、参数列表不同
// *  	1）重载 受 方法名 和参数列表影响，和修饰符、返回值列表没有关系
// *      2）参数列表不同：参数的数据类型 和参数的个数 及 参数类型的顺序 
// * */
//public class TestConstructor {
//
//	public static void main(String[] args) {
//		//1、调用默认的构造方法
//		Admin admin = new Admin("100");
//		System.out.println(admin.id);
//		System.out.println(admin.pwd);
//		//2、构造方法对成员变量初始化 默认值
//		//String pwd = null;//声明变量
//		//System.out.println(pwd);
//		//3、带参构造方法
//		Admin admin1 = new Admin("1111","1222");
//		System.out.println(admin1.id);
//		System.out.println(admin.pwd);
//		
//		//4、方法的重载   修饰符不影响重载 
//		admin1.show();
//		admin1.show("方法的重载");
//		admin1.show(25);
//
//	}
//	
//}
//class Admin{
//	//成员属性
//	public String id;
//	public String pwd="123";
//	
//	//构造方法
//	public Admin(){
//		
//		System.out.println("有参调用无参构造");
//	}
//	public Admin(String id){
//		this();//调用无参构造方法
//		//this();不能同时调用两个
//		this.id = id;
//	}
//	public  Admin(String id ,String pwd){
//		this(id);//调用第二个构造方法
//		this.pwd = pwd;
//	}
//	public void test(){
//	System.out.println("不能在普通方法中调用构造方法");
//   }
//	
//	//普通方法的重载
//	public void show(){
//		System.out.println("文字打印");
//	}
//	
//	public void show(String str){
//		System.out.println(str);
//	}
//	public void show(int num){
//		System.out.println(num);
//	}
////   public int show(int num){//不属于重载
////		return num;
////	}
//}
//
