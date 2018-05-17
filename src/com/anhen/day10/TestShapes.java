package com.anhen.day10;
/*多太
 * */

public class TestShapes {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.show();
		Circle circle = new Circle();
		circle.show();
		circle.showCicle();
		//类型转换
		//向上转型：父类的数据类型 子类的实例对象 
		//1、编译时，这种对象不能找到子类特有的属性或方法
		//2、运行时，这种对象的方法会先从子类中调用
		Shape cr =  new Circle();
		//cr.showCicle();子类方法丢失
		cr.show();//此处调用的是子类的方法（重写了父类方法）
		System.out.println(cr.name);//属性没有重写的概念 所以调用的父类的属性
		//数据类型：限定了变量只能使用的属性和方法
		//当有重写时 ，这个变量调用的方法会先去找子类对象是否存在
		//掉用属性时，还是从父类中调用
		
		//向下转型(强制转换)  子类的数据类型 父类的实例对象
		System.out.println("向下转型~~~~~");
		//向下转换不安全   java.lang.ClassCastException  
		//System.out.println(sh.name);
		//避免出错
//		if(cr instanceof Circle){
//			System.out.println("这个对象时Circle对象");
//		}
		Circle[]  arrays = {circle,(Circle) new Shape()};
		for(Circle ele:arrays){
			if(ele instanceof Circle){//验证是不是属于Circle
				System.out.println(ele);
			}else{
				System.out.println("这个对象不是Circle对象");
			}
			
		}
 	}

}

class Circle extends Shape{
	public String name="子类";
	public int age;
	//子类方法
	public void showCicle(){
		System.out.println("子类的方法");
	}
	//重写
	public void show(){
		System.out.println("重写父类的方法");
	}	
	
}

class Shape{
	public String name="父类";
	public void show(){
		System.out.println("父类的方法");
	}	
}
