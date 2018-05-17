package com.anhen.week;

public class Kuorong {
	public static  void main(String[] args){
		Kuorong.TestArrayAdd();
	}
	//数组的扩容
	public static void TestArrayAdd(){
		String[] students = {"张三","李四","万物","赵六","刘德华"};
		String name = "张学友";
		String[] newArray = new String[students.length+1];
		for(int i =0;i<students.length;i++){
			newArray[i] = students[i];
		}
		newArray[newArray.length-1]= name;
		for(String e: newArray){
			System.out.println(e);
		}
	}
}
