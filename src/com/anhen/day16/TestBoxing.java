package com.anhen.day16;
/*泛型
 * 1、定义泛型:对象建立时不指定类中的属性的具体类型，而由外部在声明及实例化时指定
 *   类名<T>{//T表示数据类型或者类名
 *   	private T name;
 *   2、使用泛型
 *    类名<T> 变量名 = new 类名<T>(); 
 *   }
 *   3、泛型的好处
	 *    1.没有限制类型的使用范围，只是规范作用，使用泛型后只能存放同一种数类型的数据
	 *    2.在取值的时候，不需要转型，并且有编译错误提示
	 *    3.不需要进行类型转换，提高效率
 * */
 
public class TestBoxing {

	public static void main(String[] args) {
	/*	// 测试容器类
		//存放String 值
		Boxing1 box = new Boxing1();
		box.setBoxing("值");//把字符串转换为 String 装箱
		Object obj = (String)box.getBoxing();//拆箱
		//存放Cloth值
		box.setBoxing(new Cloth1("引用值"));
		Cloth1 cloth = (Cloth1) box.getBoxing();
		System.out.println("cloth的值："+cloth.getName());
		//存放int值
		box.setBoxing(100);
		Integer integer = (Integer) box.getBoxing();
	 */
		Boxing1<String> box2 =  new Boxing1<String>();
		box2.setBoxing("字符集");
		String str = box2.getBoxing();//不需要拆箱
//		box2.setBoxing(new Cloth1(""));//编译报错
		Boxing1<Cloth1> box3 = new Boxing1<Cloth1>();
		box3.setBoxing(new Cloth1("泛型"));
		Cloth1 val = box3.getBoxing();
		System.out.println(val.getName());
		Boxing1<Integer> box4 = new Boxing1<Integer>();//只能存放int型
		box4.setBoxing(100);
		System.out.println(box4.getBoxing()-20);
	}

}
//容器类
class Boxing1<T>{//<>定义泛型
	private T boxing;

	public T getBoxing() {
		return boxing;
	}

	public void setBoxing(T boxing) {
	this.boxing = boxing;
		
	}

	public void T(T boxing) {
		this.boxing = boxing;
	}
}
class Cloth1{
	private String name;

	public Cloth1(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}