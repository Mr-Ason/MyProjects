package com.anhen.mytest;
//抽象类的实际应用
/*人分为学生和工人，都可以说话，说的内容不同
 * */
public class AbstractCaseDemo {

	public static void main(String[] args) {
		Personss p = new Students("刘继东",23,100);
		//System.out.println(p.getContent());
		p.show();
	}

}
//定义抽象父类
abstract class Personss{
	//定义封装属性
	private String name;
	private int age;
	
	//有参构造
	public Personss(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//定义普通显示方法
	public void show(){
		System.out.println(this.getContent());
	}
	//定义说法方法
	public abstract String getContent();
}
//定义学生子类
class Students extends Personss{
	//定义学生专有属性
	private float score;
	//带参构造
	public Students(String name, int age,float score) {
		super(name, age);
		this.score=score;
	}
	@Override
	public String getContent() {
		return "学生姓名："+super.getName()+";学生年龄："+super.getAge()+";学生成绩:"+this.score;
	}
	
}
//定义工人子类
class Works extends Personss{
	private float salary;
	
	public Works(String name,int age,float salary){
		super(name, age);
		this.salary =salary;
	}
	@Override
	public String getContent(){
		return "工人姓名："+super.getName()+";工人年龄："+super.getAge()+";工人工资:"+this.salary;
	}
}










