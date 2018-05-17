package com.anhen.mytest;

public class Test {
	
	private static final boolean ture = false;

	public static void main(String[] args) {
		String name = "adbsde";
		System.out.println("初始字符串！");
	    int b = name.indexOf("s");
		System.out.println("找到指定内容的位置："+name.indexOf("s"));
		String num = null;
		if(b>0){
			//num=name.substring(b);//删除b前面的内容
			num=name.replace("s", "");//删除字符串内容的指定内容
		}
		System.out.println(num);
	}
}
