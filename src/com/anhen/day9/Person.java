package com.anhen.day9;
//继承
/*继承：在已存在的类中派生出新的类，新类具有父类的属性方法和属性，并可以扩展自己的属性和方法。
 *   好处： 1、代码的重用性  2、减少开发周期
 *   使用：使用关键字  extends 
 *           子类 extends 父类{ }
 *     1）继承 extends 只能单继承，不能同时继承多个父类
 *     2）继承具有传递性，C类继承了B类，B类继承了A类，C类就具有了A类和B类的属性和方法
 *     3）创建子类对象时，会调用父类的构造方法。必须指定一个父类的构造方法，默认指定父类的无参构造方法
 *     注意：当父类定义了构造方法而没有构造无参构造方法时 子类必须指定调用父类的一个存在的构造方法
 * 子类继承父类后的影响：
 * 	  1、成员属性：当子类中有和父类中的属性相同时，覆盖父类中的属性，调用子类的属性（没有必要覆盖已有属性，扩展新属性就行）
 *    2、方法：当使用重写时，子类的方法会覆盖父类的方法，调用子类的方法
 *    3、构造方法：总是先调用父类的构造方法super()；  super.run();
 *    
 *  重写：子类覆盖父类的方法
 *       1）方法名必须相同
 *       2）参数列表相同（数据类型，个数）
 *       3）访问修饰符权限 不能比父类小
 *       
 * 构造方法:
 *    1、this() 和  super()不能同时出现在一个构造方法中
 *    2、有参的调用无参的构造方法
 */
public class Person {
	public String name;
	public String age;
	
	public void run(){
		System.out.println("人类正在跑...");
	}
	
	//构造方法
	public Person(){
		System.out.println("子类调用了父类的构造方法");
	}
	public Person(String name,String age){
		this.name = name;
		this.age = age;
	}
	
	
	public static void main(String[] args){
		//创建人类
		Person person = new Person("亚当","1000");
		person.run();
		//创建子类
		Man man = new Man();
		man.run();//调用父类方法
		man.eatFood();//调用子类中自己的方法
		System.out.println("子类调用父类的属性："+man.name);
		
	}
	
	
	
}
//继承  只能单继承
class Man extends Person{
	public String job;
	//public String name;//会覆盖父类的name属性
	
//	public Man(){//可以解决父类中没有无参构造方法
//		super("男人","35");
//	}
//	
	public Man(){
		super("Man","50");
		System.out.println("子类的无参构造方法");//先调用父类的无参构造 在调用自己的
	}
	
	public Man(String jod){
		this();//调用自己的无参方法
		this.job = job;
	}
	public Man(String name,String age,String job){
		super(name,age);
		this.job = job;
	}
	
	public void eatFood(){
		System.out.println("男人在吃东西...");
		
	}
	public  void run(){//已经将父类的方法覆盖了
		super.run();//调用父类中的方法   同时打印两个run（）方法
		System.out.println("男人在跑...");
	}
}
