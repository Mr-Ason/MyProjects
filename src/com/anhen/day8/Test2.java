package com.anhen.day8;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1  tt = new 	Test1();
		Test t = new Test();
		t.name = "lisi";//age 已私有 不能访问
		
		t.setAge(20);
		t.setSex('女');
		System.out.println(t.getAge());
		
	}

}
