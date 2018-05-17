package com.anhen.day12;

public class TestFactor1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Computer1 com = Factor1.getComputer("PC1");
		com.show();
		com.work();

	}

}

//���Թ��� ������Ʒ
class Factor1{
	private Factor1(){//˽�� �ⲿ���ɷ���
		
	}
	public static  Computer1  getComputer(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Computer1 computer = null;
		
	/*	switch(type){
		case "PC":{
			computer = new PC1();
			break;
		}
		case "NoteBook":{
			computer = new NoteBook1();
			break;
		}
		default:{
			System.out.println("�޲�Ʒ��");
		}
		}*/
		//���� ���øĴ���
		//ͨ���������Class�����
		Class clazz = Class.forName("com.anhen.day12."+type);//Class ��ȡ���������ļ�
		//������ʵ��
		computer  = (Computer1) clazz.newInstance();//����ת��
		return computer;
	}
		
		
}


//���� notebook
class NoteBook1 extends Computer1{

	public NoteBook1(){}
	public NoteBook1(String name){
		super(name);
	}
	@Override
	public void show() {
		System.out.println("NoteBook�������ڹ���....");
		
	}
	
}
//����pc
class PC1 extends Computer1{
	public PC1(){}
	public PC1(String name){
		super(name);
	}

	@Override
	public void show() {
		System.out.println("pc�������ڹ���....");
		
	}
	
}

//����ĸ��� ������
abstract class Computer1{
	private String name;
	
	public Computer1(){}
	public Computer1(String name){
		this.name = name;
	}
	
	//ʵ�ַ���
	public void work(){
		System.out.println("���ڹ���.....");
	}
	//���󷽷� ����ʵ��
	public  abstract void show();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}