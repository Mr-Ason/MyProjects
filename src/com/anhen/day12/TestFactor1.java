package com.anhen.day12;

public class TestFactor1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Computer1 com = Factor1.getComputer("PC1");
		com.show();
		com.work();

	}

}

//电脑工厂 生产产品
class Factor1{
	private Factor1(){//私有 外部不可访问
		
	}
	public static  Computer1  getComputer(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Computer1 computer = null;
		
	/*	switch(type){
		case "PC":{
			computer = new PC1();
			break;
		}
		case "NoteBook":{
			computer = new NoteBook1();
			break;
		}
		default:{
			System.out.println("无产品！");
		}
		}*/
		//反射 不用改代码
		//通过类名获得Class类对象
		Class clazz = Class.forName("com.anhen.day12."+type);//Class 获取被编译后的文件
		//生产新实例
		computer  = (Computer1) clazz.newInstance();//向上转型
		return computer;
	}
		
		
}


//子类 notebook
class NoteBook1 extends Computer1{

	public NoteBook1(){}
	public NoteBook1(String name){
		super(name);
	}
	@Override
	public void show() {
		System.out.println("NoteBook电脑正在工作....");
		
	}
	
}
//子类pc
class PC1 extends Computer1{
	public PC1(){}
	public PC1(String name){
		super(name);
	}

	@Override
	public void show() {
		System.out.println("pc电脑正在工作....");
		
	}
	
}

//抽象的父类 电脑类
abstract class Computer1{
	private String name;
	
	public Computer1(){}
	public Computer1(String name){
		this.name = name;
	}
	
	//实现方法
	public void work(){
		System.out.println("正在工作.....");
	}
	//抽象方法 子类实现
	public  abstract void show();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}