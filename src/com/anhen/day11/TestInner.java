package com.anhen.day11;

public class TestInner {

	public static void main(String[] args) {
		//ʵ�����ⲿ��
		Outer1 outer = new Outer1();
		//ʵ�����ڲ���
		Outer1.Inner in = outer.new Inner();
		in.innerName="wo ";
		System.out.println(in.innerName="wo ");
		in.iShow();

	}

}

class Outer1{//�ⲿ��
	public String name = "����";       //ʵ������
	public static String age = "����";//��̬����
	 
	public void show(){//ʵ������
		System.out.println("�ⲿ���ʵ��������");
	}
	public static void shows(){//ʵ������
		System.out.println("�ⲿ��ľ�̬����");
	}
	//��ͨ�ڲ���  
	public class Inner{
		public String innerName = "�ڲ�������";
		//public static  String innerAge = "�ڲ�������";//�ڲ��಻�����þ�̬����
		public static  final String innerAge = "�ڲ�������";//������final�ؼ���
		
		public void iShow(){
			new Outer1().show();//�����ⲿ�෽��
			new Outer1().name="�ⲿ������";//�����ⲿ������
			System.out.println("�ڲ����ʵ������");
		}
//		public static void iShows(){���ܶ��徲̬����
//			
//		}
	}
	
}
