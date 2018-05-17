package com.anhen.day8;
/*类的封装：
 *    访问权限修饰符：
 *       public        当前类   当前包   子类   其他包
 *       protected    当前类   当前包  子类
 *       default       当前类   当前包   
 *       private       当前类   
 */
public class TextPackaging {
	
	public static void main(String[] args){
		//访问Text1
		Text text = new Text();
		text.setAge(13);
		
	}
}
class Text{
	//属性
	public String name;
	private int  age;
	private char  sex;
	
	//方法
	public void setAge(int age){
		if(age<0||age>110){
		    System.out.println("年龄有误，请输入正确年龄！");
			return;
		}else{
			this.age=age;
		  }
	}
	
		
	}



