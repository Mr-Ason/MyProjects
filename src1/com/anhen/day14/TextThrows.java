package com.anhen.day14;

public class TextThrows {

	public static void main(String[] args)  {
		try {
			test();
		}
			 catch (Exception e) {
			System.out.println("���쳣��");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		    System.out.println("���Դ���");

	}
	public static void test(){
		String str =  "12";
		if(str.length()<=10){
			
			System.out.println("���Ȳ���11λ��");
			throw(new StringIndexOutOfBoundsException());
		}
		System.out.println("�������̿�����䣡");
	}

}
