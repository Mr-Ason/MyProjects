package com.anhen.day11;
/*适配器：一个半实现半抽象类的抽象类
 * */
public class TestAdapter {

	public static void main(String[] args) {
		//创建接口实现类
//		windowInterface w = new windowInterface(){接口方法太多
//
//		};
		//使用适配器实现功能
		windowAdater adater = new windowAdater(){

			@Override
			public void testA() {
				// TODO Auto-generated method stub
				
			}
			
		};

	}

}
//创建接口的适配器
abstract class windowAdater implements windowInterface{
	public void testB(){};
	public void testC(){};
	public void testD(){};
	public void testE(){};
	
}
//大量抽象方法接口
interface windowInterface{
	public void testA();
	public void testB();
	public void testC();
	public void testD();
	public void testE();
}