package com.anhen.day6;
/*类： 具有相同属性和行为的对象的抽象
	 *对象：客观存在的类的具体
	 * 类和对象的关系：
	 *  1、类是对象的抽象，对象是类的具体
	 *  2、类是对象的模板，对象是类的产品
	 * 类的定义语法：
	 *  [修饰符] class 类名{
		 *  //属性
		 *  //方法：模板的功能
	 *  
	 *       }
	 * 1、修饰符 访问权限
	 *     public  protected private static final
	 * 2、属性
	 *      修饰符  数据类型  属性名;
	 *       public String color="白色";//颜色
	 *       public String color;//数据类型的默认值
	 * 3、方法
	 *      修饰符 返回类型  方法名（参数列表）{
	 *      return 返回类型的值：//void 可以写可以不写return
	 *     }
	 *    参数列表（数据类型  参数1，参数类型  参数2  、、、、、）
	 *     1、参数理论是无限，但不推荐
	 *     2、数据类型必须一一对应
	 *     3、形参：形式上的参数，是在方法定义的时候，给参数值取的名字，不代表真的参数
	 *         实参：真正参数，是在调用方法的时候，写在参数列表里的，代表真正的参数
	 * 
	 */
public class Car {//类的定义
		//属性
		public String color;//颜色
		//型号
		public double privice;//价格
		public String logo = "大众";//品牌
		public double speed;//速度 KM/H
		//车容量
		
		//方法
		public void run(int hours){ //跑
			//
			System.out.println("跑了："+(this.speed*hours)+"KM!");
		}
		
		public String getlogo(){//获得品牌
			String str = "上海"+this.logo;
			return str;
		}
		public void show(String name,int age,int speed){//形参
			System.out.println(name+","+age);
		}
}



