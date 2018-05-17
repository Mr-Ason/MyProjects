package com.anhen.day11;

public class TextInterface {
	public static void main(String [] args){
		//创建外部类
		Outer outer = new Outer();
		outer.show();
		//创建内部类
		Outer.Inner inner = new Outer().new Inner();
		inner.iShow();
		
	}
	
	}
class Outer{
	//属性
	public String name ="姓名";
	public static String age ="20";
	
	public void show(){
		System.out.println("外部类的实例方法");
	}
	
	public static void shows(){
		System.out.println("外部类的静态方法");
	}
	//内部类
	public class Inner{
		//属性
		public String innerName = "内部类";
		public String name = "";
		public static final String  innerAge ="20";//必须是最终的静态
//		public static void iShow(){//不能创建静态方法	
//		}
		public void iShow(){
			System.out.println(Outer.this.name);//外部属性
			show();//外部方法
			System.out.println(Outer.age );
			Outer.shows();//外部静态方法
			System.out.println("内部类的实例方法");
		}
		
	}
	
}



