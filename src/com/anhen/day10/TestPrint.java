package com.anhen.day10;
/*
 * 定义一个抽象类：打印机
 * 子类  黑白打印机
 *       彩色打印机
 * */
public class TestPrint {

	public static void main(String[] args) {
		
		// Printer printer = new Printer(); 不能实例化抽象类
		Printer black = new BlackPrinter();
		Printer color = new ColorPrinter();
		
		//创建学校
		School sc = new School(black);//不传入参数  java.lang.NullPointerException
		sc.printInfo("messge");
		sc.setPrinter(color);
		sc.printInfo("彩色打印机打印");
	}

}
//学校
class School{
	private Printer printer;//打印机

	public School(){
		
	}
    public School(Printer printer){
		this.printer = printer;
	}
    public void printInfo(String messge){
    	this.getPrinter().print(messge);
    }
	private Printer getPrinter() {//封装 得到的方法封装，只能通过自己的方法访问
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
}

//黑白打印机（子类）
class BlackPrinter extends Printer{

	@Override
	void print(String messge) {//类前没有abstract 则必须实现抽象方法 不然报错
	System.out.println("黑白打印机工作中。。。。"+messge);
		
	}
	
}
//彩色打印机（子类）
class ColorPrinter extends Printer{

	@Override
	void print(String messge) {
		System.out.println("彩色打印机工作中。。。。"+messge);
		
	}
	
}
//抽象类  可以不写抽象方法
abstract class Printer{
	public  String name;
	
	public Printer(){//构造方法
		
	}
	
	public void show(){
		System.out.println("打印机");
	}
	//抽象方法
	abstract void print(String messge);//不知道执行什么  传入参数后明白要做什么
}
