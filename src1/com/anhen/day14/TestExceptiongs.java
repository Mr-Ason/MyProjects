package com.anhen.day14;
class Teacher{
	public Teacher teacher;
	//public Teacher teacher= new Teacher();  ϵͳ����
}
public class TestExceptiongs {
	public static void main (String [] args) {
		text2();
	}
	//�ڴ����
	public static void error(){
		Teacher teacher = new Teacher();
		System.out.println("��ʦʵ����");
	}
	//checked Exception
	public static void text4() throws ClassNotFoundException{
		Class clazz = Class.forName("");
		
	}
	
	
	//java.lang.ArithmeticExcepton
	public static void text3(){
		System.out.println(100/0);
	}
	
	
	
	//��ָ��
public static void text2(){
	String str = null;
	str.trim();//ȥ��ǰ��ո�
}


public static void text1(){//�±�Խ��
	int[] arrary = new int[10] ;
	for(int i = 0;i<=arrary.length;i++){
		System.out.println(arrary[i]);
	}
	System.out.println("hehe");
}

}





