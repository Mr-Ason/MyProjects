package com.anhen.mytest;

public class InterfaceCaseDemo {

	public static void main(String[] args) {
		showInfor show = new showInfor();
		show.showWork(new  Flash());//若类中的方法不是静态的 可通过实例化调用
		showInfor.showWork(new Print());//静态：    类名.方法  调用

	}

}
//定义一个方法  所谓的工厂类
class showInfor{
	public static void showWork(USB usb){
		usb.startWork();
		usb.stopWork();
		
	}
}

//定义一个USB接口
interface USB{
	//定义接口方法
	public void startWork();
	public void stopWork();
}
//定义实现接口的方法
class Flash implements USB{
	public void startWork(){
		System.out.println("U盘开始工作....");
	}
	public void stopWork(){
		System.out.println("U盘停止工作....");
	}
}
//定义实现接口类
class Print implements USB{
	public void startWork(){
		System.out.println("打印机开始工作...");
	}
	public void stopWork(){
		System.out.println("打印机停止工作！");
	}
}






