package com.anhen.day11;

public class TextInterface {
	public static void main(String [] args){
		//�����ⲿ��
		Outer outer = new Outer();
		outer.show();
		//�����ڲ���
		Outer.Inner inner = new Outer().new Inner();
		inner.iShow();
		
	}
	
	}
class Outer{
	//����
	public String name ="����";
	public static String age ="20";
	
	public void show(){
		System.out.println("�ⲿ���ʵ������");
	}
	
	public static void shows(){
		System.out.println("�ⲿ��ľ�̬����");
	}
	//�ڲ���
	public class Inner{
		//����
		public String innerName = "�ڲ���";
		public String name = "";
		public static final String  innerAge ="20";//���������յľ�̬
//		public static void iShow(){//���ܴ�����̬����	
//		}
		public void iShow(){
			System.out.println(Outer.this.name);//�ⲿ����
			show();//�ⲿ����
			System.out.println(Outer.age );
			Outer.shows();//�ⲿ��̬����
			System.out.println("�ڲ����ʵ������");
		}
		
	}
	
}



