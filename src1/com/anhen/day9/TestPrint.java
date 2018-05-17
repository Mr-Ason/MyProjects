package com.anhen.day9;
//抽象
public class TestPrint {
	public static void main(String[] args){
		
	    new BlackPrinter();
		
		
	}

}

abstract class Printer{//定义抽象
	abstract void println(String message);
}

//黑白打印机
class BlackPrinter extends Printer{
	@Override
	void println(String message) {
		// TODO Auto-generated method stub
		System.out.println("黑白电视剧真在工作、、、");
	}
}
class School{
	 //private Printer printer;//打印机
     public School(){
	  
  }
}
