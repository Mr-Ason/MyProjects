package com.anhen.day8;
/*封装：隐藏实现的细节，实现功能
 * 封装的使用：
 *    1、 类的封装  类  属性 方法
 *     2、接口的封装  业务流程的封装
 * 类的封装：
 *       访问权限的修饰符：
 *       		public           当前类  当前包   子类  其他包
 *       		protect         当前类  当前包    子类
 *       		default          当前类  当前包
 *       		private          当前类
 *        * */
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Test{
	//属性
	public String name;
	private int age;
	private char sex;
	
	//赋值方法
	public void setAge(int age){
		
	 if(age<0||age>130){
		 System.out.println("输入年龄有误！");
		 return;
	 }
		this.age= age;
	}
	public void setSex(char sex){
		this.sex=sex;
	}
	//取值方法
	public int getAge(){
		if(this.sex == '女'){
			System.out.println("年龄保密！");
			return 9999;
			//return ' '; 可以返回空字符
		}else{
		    return this.age;
		}
	}
	public char getSex(){
		
		return this.sex;
	}
}
