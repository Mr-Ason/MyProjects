package com.anhen.day12;

//import com.anhen.day12.Factor.Computer;

public class TestFactor {
	public static void main(String [] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//Factor fa = new Factor();����ʵ��������
		//���ָ������
		Computer computer = Factor.getComputer("NoteBook");
		computer.show();
		computer.work();
	}

}
//���Թ��� ����ָ������
class Factor{
	private Factor(){//�ⲿ�����Է���
		
	}
	public static Computer getComputer(String type) throws ClassNotFoundException , InstantiationException, IllegalAccessException{
			Computer computer= null;
			//switch �� Class ֻ����һ
//			switch(type){
//					case "PC":{
//					computer  = new PC();
//					break;
//				}
//					case "NoteBook":{
//					computer  = new NoteBook();
//					break;
//				}
//					default:
//					{
//						System.out.println("��Ʒ��������");
//				}
//	       }
			//����
			//ͨ���������Class�����
			@SuppressWarnings("rawtypes")
			Class clazz = Class.forName("com.anhen.day12."+type);
			//������ʵ��
			computer =(Computer) clazz.newInstance();
	        return computer;
    }
	
}	
//���� NoteBook
class NoteBook extends Computer{
	public  NoteBook(){
		
	}
	public NoteBook(String name){
		super(name);
	}
	@Override
	public void show() {
		System.out.println("����һ̨NoetBook���ԣ�");
		
	}
		
}
//���� PC
class PC extends Computer{
	public PC(){
		
	}
	public PC(String name){
		super(name);
	}

	@Override
	public void show() {
		System.out.println("����һ̨pc���ԣ�");
		
	}
	
}

//������
abstract class Computer{
	private String name;//Ʒ��

	public Computer(){
		
	}
	public Computer(String name){
		this.name = name;
	}
	//ʵ�ַ���
	public void work(){
		System.out.println("���ڹ���������");
	}
	//���󷽷� ����ʵ��
	public abstract void show();
		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 }	

	
