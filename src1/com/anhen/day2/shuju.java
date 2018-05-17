package com.anhen.day2;
/*常量：固定不变的数据
 * 变量：可以改变的量
 * 声明的语法格式：
 *       【修饰符】数据类型 变量名;
 *赋值的格式:
 *       【修饰符】数据类型 变量名= 值;
 *  变量的定义规范：
 *  1.字母、数字、 _、$组成，只能数字不能开头；
 *  2.变量的大小写严格区分： name NAME 不一样
 *  3.不能使用关键字和保留字
 *  4.长度无限制 15
 *  5. 首字母小写、后面单词的首字母都大写  myName oName
 *  6.命名的单词，见明知意
 *    java使用Unicode码，一个字母和中午都占16位字节         
 **/
public class shuju {
	//1.属性 成员变量 局部变量
	//String name
	
	public static void main(String[] args){
		//变量声明 局部变量
		String name;
		//2.变量赋值
		name = "姓名";
		
		System.out.println(name);
		System.out.println(100);
		name ="年龄";
		//100=1000;//variable 等号左边
		System.out.println(name);
		System.out.println(1000);
		
		//String public =""; 关键字 保留字 无法定义
	}

}
