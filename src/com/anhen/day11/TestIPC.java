package com.anhen.day11;
/*匿名内部类特点：没有名字的实体类
 * 创建 语法：
 * 			new 接口(){
 *    			//实现抽象方法
 *    }
 *    new 类名(){
 *    			//继承父类
 *    }
 * 为什么要使用匿名内部类：简化代码，用于事件的绑定
 * */
public class TestIPC {

	public static void main(String[] args) {
		// 创建TestClass实例
		TestClass test = new  TestClass();
		IPC ipc = new TIPC();
		test.test(ipc);
		
		//匿名内部类
		test.test(new IPC(){//被实例化的是花括号中的东西
			//可以加属性、相应方法
			@Override
			public void show() {
				System.out.println("匿名内部类的方法调用");
				
			}
			
		});
		//变量存放匿名内部类  不推荐
		new IPC(){

			public String name = "匿名";
			public void print(){
				
			}
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
	
		}.print();;
	}

}

//抽象类
abstract class Parent{
	public abstract void  print();
}

class TestClass{
	public void test(IPC ipc){//接口作为数据类型
	System.out.println("测试接口的实现类");
	ipc.show();
	}
}
//类实现接口
class TIPC implements IPC{

	@Override
	public void show() {
		System.out.println("类实现接口");
		
	}
	
}
//一个接口可以继承多个接口
 interface IPC extends TIPCA,TIPCB{
	public void show();
	
}

interface TIPCA{
	
}
interface TIPCB{
	
}