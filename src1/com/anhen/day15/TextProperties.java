package com.anhen.day15;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TextProperties {
	public static void main(String[] args){
		//创建properties(属性集)对象
		Properties pro = new Properties();
		//创建InputStream（接口）对象
		InputStream input = TextProperties.class.getResourceAsStream("data");//反射赋值 反射重要思想：获得class文件		
		try{
			pro.load(input);//加载属性集文件
			//1、用户登录
			String user = pro.getProperty("用户名："+"userId");
			String pwd = pro.getProperty("用户密码："+"passWord");
			if("admin".equals(user)&&"123423".equals(pwd)){
				System.out.println(pro.getProperty("登录成功！"));
			}else{
				System.out.println(pro.getProperty("登录失败！"));
			}
			System.out.println(pro.getProperty("userId"));
			System.out.println(pro.getProperty("passWord"));
			System.out.println(pro.getProperty("product"));
		}catch(IOException e){
		e.printStackTrace();
		}		
	}
}

/////电脑工厂 生产指定电脑
//class Factor{
//	private Factor(){//外部不可以访问
//		
//	}
//	public static Computer getComputer(String type) throws ClassNotFoundException , InstantiationException, IllegalAccessException{
//			Computer computer= null;
//			//switch 和 Class 只用其一
////			switch(type){
////					case "PC":{
////					computer  = new PC();
////					break;
////				}
////					case "NoteBook":{
////					computer  = new NoteBook();
////					break;
////				}
////					default:
////					{
////						System.out.println("产品名称有误");
////				}
////	       }
//			//反射
//			//通过类名获得Class类对象
//			@SuppressWarnings("rawtypes")
//			Class clazz = Class.forName("com.anhen.day15."+type);
//			//生产新实例
//			computer =(Computer) clazz.newInstance();
//	        return computer;
//    }
//	
//}	
////子类 NoteBook
//class NoteBook extends Computer{
//	public  NoteBook(){
//		
//	}
//	public NoteBook(String name){
//		super(name);
//	}
//	@Override
//	public void show() {
//		System.out.println("这是一台NoetBook电脑！");
//		
//	}
//		
//}
////子类 PC
//class PC extends Computer{
//	public PC(){
//		
//	}
//	public PC(String name){
//		super(name);
//	}
//
//	@Override
//	public void show() {
//		System.out.println("这是一台pc电脑！");
//		
//	}
//	
//}
//
////抽象父类
//abstract class Computer{
//	private String name;//品牌
//
//	public Computer(){
//		
//	}
//	public Computer(String name){
//		this.name = name;
//	}
//	//实现方法
//	public void work(){
//		System.out.println("正在工作、、、");
//	}
//	//抽象方法 子类实现
//	public abstract void show();
//		
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
// }	
