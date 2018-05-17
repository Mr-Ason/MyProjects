package com.anhen.mytest;
//私有化构造方法
//单列设计模式：无论程序怎样运行，类永远只有一个实例化对象
public class Danli_siyouhua {

	public static void main(String[] args) {
		Singletion sl = Singletion.getSingletion();
		Singletion sl1 = Singletion.getSingletion();
		sl.Info();
		sl1.Info();

	}
}

//构造方法私有化
class Singletion{
	//类中的属性必须封装
	private static Singletion st = new Singletion();//构造方法已封装，外界不可实例化，只能在内部实例化
	private Singletion(){//封装构造方法，外届无法调用
		
	}
	
	//由于实例化的属性被封装,必须通过方法获得，所以要一个静态方法去获取
	public static Singletion getSingletion(){//Singletion 相当于属性类型 如：String
		return st;
	}
	
	public void  Info(){
		System.out.println("Hell word!!");
	}
}
