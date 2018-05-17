package com.anhen.day6;

public class Textgift {
	public static void main(String[] args){
	//实例创建
	Gift gift1 = new Gift();
	//修改属性
	 gift1.name ="蓝胖纸";
	 gift1.price = 23.4;
	System.out.println("礼品名："+gift1.name);
	System.out.println("价格："+gift1.price);
	gift1.show(gift1.name, gift1.price);

}
}