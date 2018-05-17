package com.anhen.day16;
/*泛型
 *   1、定义泛型
 *        类名<T>{
 *         private T name;
 *         
 *        }
 * 2、使用泛型
 *     类名<T>  变量名 = new 类名<T>();
 * 3、泛型的好处
 *     a.没有限制类型的使用范围，只是起一个规范作用，
 *        使用泛型后只能存放一种数据类型；
 *     b.在取值时不需要转型，并且会有编译提醒错误提示；
 *     c.不需要进行类型转换，提高效率。
 */
public class TextBox {
	public static void main(String[] args) {
		//测试容器类
		//存放stirng
		Boxing box = new Boxing();
		box.setBoxing("值");//装箱
		Object obj = box.getBoxing();//拆箱
		//存放cloth值
		box.setBoxing(new Cloth("引用值"));
		Cloth cloth =(Cloth) box.getBoxing();
		System.out.println("clothde name:"+cloth.getName());
		//存放int值
		box.setBoxing(100);
		Integer integer = (Integer) box.getBoxing();
		
		//使用泛型编程
		Boxing<String> box2= new Boxing<String>();
		box2.setBoxing("字符串");
		String str = box2.getBoxing();//不需要拆箱
		//box2.setBoxing(new Cloth(""));//编译报错
		Boxing<Cloth> box3 = new Boxing<Cloth>();
		box3.setBoxing(new Cloth("泛型"));
		Cloth val = box3.getBoxing();
		System.out.println(val.getName());
		Boxing<Integer> box4 = new Boxing<Integer>();
		box4.setBoxing(200);
		System.out.println(box4.getBoxing()-100);

	}
}
//容器类  使用泛型
class Boxing<T>{//T数据类型
	private T boxing;

	public T getBoxing() {
		return boxing;
	}

	public void setBoxing(T boxing) {
		this.boxing = boxing;
	}

}
class Cloth{
	private String name;

	public Cloth(String getBoxing){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}