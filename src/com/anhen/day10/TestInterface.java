package com.anhen.day10;
/*
 * */
public class TestInterface {

	public static void main(String[] args) {
		//接口不能被实例化
		PrinterInterface black = new BlackPrinter2();
		black.print("课程");
		PrinterInterface color = new ColorPrinter2();//向上转型
		color.print("wo");
		System.out.println(PrinterInterface.NAME_PRINTER);
		
		PrinterInterface[] array = {black,color};//打印机数组
		for(PrinterInterface ele:array){
			if(ele instanceof BlackPrinter2){
				BlackPrinter2 bl = (BlackPrinter2) ele;//向下转型
				bl.show();
			}
		}
	}

}

//黑白打印机   实现接口
class BlackPrinter2 implements PrinterInterface{

	@Override
	public void print(String message) {//重写接口的方法
		System.out.println("黑白打印机实现接口的功能："+message);
		
	}
	public void show(){
		System.out.println("");
	}
	
}
//彩色打印机   实现接口
class ColorPrinter2 implements PrinterInterface{

	@Override
	public void print(String message) {
		System.out.println("彩色打印机实现接口的功能："+message);
		
	}
	
}

//接口 打印机
	interface PrinterInterface{
		public final static String NAME_PRINTER="打印机";  //要申明属性的格式 （ 自己完成初始化的变量）
		public void print(String message);
		
	}
