/*package com.anhen.day9;
//多态应用
public class TestTeacher {
	public static void main(String[] args) {
		Tr teacher = new Tr();
		//teacher.show();
		Tr JavaTr = new JavaTr("张三");
		JavaTr.show();
		Tr PhpTr = new PhpTr("王麻子");
		PhpTr.show();
	}

}
//父类
class Tr{
	//属性
	private String name;
	private String classname;
	//方法
	public  Tr(){
		
	}
	public Tr(String name,String classname){
		this();
		this.name = name;
		this.classname = classname;
	}
	//普通方法  用于显示 信息
	public void show(){
		//在属性名后直接赋值private String name = "李四";private String classname="王五";
		System.out.println("我是 "+name+"\t是几班的"+classname+"老师");
	}
}
//子类 
class JavaTr extends Tr{
	//无参方法
	public JavaTr(){
		
	}
	public JavaTr(String name){//调用父类方法
		super(name,"java");
	}
	public void show(){
		super.show();
		System.out.println("今天干什么？");
	}
}
class PhpTr extends Tr{
	//无参方法
	public PhpTr(){
		
	}
	public PhpTr(String name){
		super(name,"Php");
	}
	//普通方法
	public void show(){
		super.show();
		System.out.println("真特么难！");
	}
}
*/
package com.anhen.day9;

public class TestTeacher{
	   public static void main(String [] args){
		   //打印父类
		   Tr  fu = new Tr("蛮子",23);
		   fu.show();
		   Tr student = new Student("王老五");
		   student.show();
		   Tr xinxi = new Tr();
		   xinxi.showTr(student);
		   xinxi.showTr(student);
		
	}
}
//父类
class Tr{
	//属性
	public String name;
	public int age;
	//方法
	public Tr(){//无参构造  赋值直接在属性后赋
		
	}
	public void showTr(Tr student) {
		// TODO Auto-generated method stub
		
	}
	public Tr(String name,int age){
		this();//this 调用无参
		this.name = name;
		this.age = age;
	}
	//普通方法  打印
	public void show(){//打印父类属性
		System.out.println("名字："+name+"\t年龄："+age);
	}
}
//子类
class Student extends Tr{
	//无参构造
	public Student(){
		
	}
	//有参构造
	public Student(String name){
		super(name,24);
	}
	public void show(){
		super.show();
		
	}	
}
// 查询信息
class Xinxi{
	public void showTr(Tr tr){
		//默认调用 父类
		tr.show();
	}
}

