package com.anhen.day14;
class Teacher{
	public Teacher teacher;
	//public Teacher teacher= new Teacher();  系统奔溃
}
public class TestExceptiongs {
	public static void main (String [] args) {
		text2();
	}
	//内存溢出
	public static void error(){
		Teacher teacher = new Teacher();
		System.out.println("老师实例化");
	}
	//checked Exception
	public static void text4() throws ClassNotFoundException{
		Class clazz = Class.forName("");
		
	}
	
	
	//java.lang.ArithmeticExcepton
	public static void text3(){
		System.out.println(100/0);
	}
	
	
	
	//空指针
public static void text2(){
	String str = null;
	str.trim();//去除前后空格
}


public static void text1(){//下标越界
	int[] arrary = new int[10] ;
	for(int i = 0;i<=arrary.length;i++){
		System.out.println(arrary[i]);
	}
	System.out.println("hehe");
}

}





