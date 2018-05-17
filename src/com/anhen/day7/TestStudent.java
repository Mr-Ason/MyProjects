package com.anhen.day7;

public class TestStudent {

	public static void main(String[] args) {
		//实例化学生对象
		Student stu1 = new Student("张三", 176);
		stu1.show();
		Student stu2 = new Student("李四", 170);
		stu2.show();
		//比较两人的身高
		stu1.showHeight(stu2);
	}
}

class Students{
	//属性
	public String name;
	public double height;
	
	//构造方法 对属性设置初始值
	public Students(String name,double height){
		System.out.println("调用了构造方法");
		this.name = name;
		this.height = height;
	}
	//方法
	public void show(){
		System.out.println("我的名字是："+name+",身高："+height);
	}
	//比较身高
	public void showHeight(Student stu){
		if(this.height>stu.height){//this 代表调用方法的对象 要两个比较的话就差一个，所以传参
			System.out.println(this.name+"更高");
		}else{
			System.out.println(stu.name+"更高");
		}
	}
	
}
