package com.anhen.day11;

public class TestInner {

	public static void main(String[] args) {
		//实例化外部类
		Outer1 outer = new Outer1();
		//实例化内部类
		Outer1.Inner in = outer.new Inner();
		in.innerName="wo ";
		System.out.println(in.innerName="wo ");
		in.iShow();

	}

}

class Outer1{//外部类
	public String name = "姓名";       //实例属性
	public static String age = "年龄";//静态属性
	 
	public void show(){//实例方法
		System.out.println("外部类的实例化方法");
	}
	public static void shows(){//实例方法
		System.out.println("外部类的静态方法");
	}
	//普通内部类  
	public class Inner{
		public String innerName = "内部类姓名";
		//public static  String innerAge = "内部类年龄";//内部类不能设置静态属性
		public static  final String innerAge = "内部类年龄";//必须用final关键字
		
		public void iShow(){
			new Outer1().show();//调用外部类方法
			new Outer1().name="外部类姓名";//调用外部类姓名
			System.out.println("内部类的实例方法");
		}
//		public static void iShows(){不能定义静态方法
//			
//		}
	}
	
}
