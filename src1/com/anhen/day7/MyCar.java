package com.anhen.day7;
/*类：具有相同属性和行为的对象的抽象
 * 对象：客观存在的类的具体
 *  类与对象的关系： 动物类 ， 猫；猫是对象
 *  类的定义：
 *    【修饰符】 class  类名{
 *    	//属性
 *     //
 *     方法
 *    }
 * 1修饰符是访问权限
 *    public protectde private static final 
 *  2、属性
 *      修饰符  数据类型 属性名（可以赋值）；public String color;
 * 3、方法
 * 		修饰符  返回类型  方法名（<参数列表>）{
 * 				return 返回类型的值；//void 可以不写return
 * 		}
 * 		参数列表（数据类型 参数1，数据类型 参数2......）
 * 		1.参数理论是无限，但不推荐，一般四到五个
 * 		2.数据类型必须一一对应
 * 		3.形参：形式上的参数，是在方法定义的时候给参数值取的名字，不代表真正的数据
 *         实参：真正的数据，方法调用的时候，写在参数列表的，代表真正的数据
 * */

public class MyCar {
	//属性
	public String color="白色";
	public double prices=152.30;
	public String  logo = "大众";
	public double speed;//速度
	
	//定义speed的方法
	public  void run(int hours){
		System.out.println("跑了" +(this.speed *hours)+"千米");
	}
	
	//有返回值得方法
	public String getLogo(){//获取车的品牌
		String str = "上海"+this.logo;
		return str;
	}
	
	//参数列表的列子   没有返回参数 直接打印
	public void show(String name,int age){//形参 接收调用方法处传过来的值
		System.out.println(name+","+age);
	}
}
