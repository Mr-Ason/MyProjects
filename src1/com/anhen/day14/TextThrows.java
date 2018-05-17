package com.anhen.day14;

public class TextThrows {

	public static void main(String[] args)  {
		try {
			test();
		}
			 catch (Exception e) {
			System.out.println("有异常！");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		    System.out.println("测试代码");

	}
	public static void test(){
		String str =  "12";
		if(str.length()<=10){
			
			System.out.println("长度不够11位。");
			throw(new StringIndexOutOfBoundsException());
		}
		System.out.println("测试流程控制语句！");
	}

}
