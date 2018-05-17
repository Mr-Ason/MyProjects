package com.anhen.day14;

public class TextMyEception {
	public static void main(String[] args) {
		Man man = new Man();
		try {
			//
			man.setAge(34);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println(man.getAge());
		
	}
}
class Man{
	private int age;
	
	public void setAge(int age) throws MyException{
		if(age<=0||age>120){
			throw(new MyException("���������"));//�׳����ܴ���
		}else{
		    this.age=age;
		}
	}	
	public int getAge(){
		return age;
	}
}
//�Զ����쳣��
class MyException extends Exception{
	public MyException(){
		super();
	}	
	public MyException(String message){
		super(message);
	}	
}
