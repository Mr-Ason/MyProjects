package com.anhen.week;

public class Kuorong {
	public static  void main(String[] args){
		Kuorong.TestArrayAdd();
	}
	//���������
	public static void TestArrayAdd(){
		String[] students = {"����","����","����","����","���»�"};
		String name = "��ѧ��";
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
