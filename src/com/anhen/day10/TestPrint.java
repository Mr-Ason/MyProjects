package com.anhen.day10;
/*
 * ����һ�������ࣺ��ӡ��
 * ����  �ڰ״�ӡ��
 *       ��ɫ��ӡ��
 * */
public class TestPrint {

	public static void main(String[] args) {
		
		// Printer printer = new Printer(); ����ʵ����������
		Printer black = new BlackPrinter();
		Printer color = new ColorPrinter();
		
		//����ѧУ
		School sc = new School(black);//���������  java.lang.NullPointerException
		sc.printInfo("messge");
		sc.setPrinter(color);
		sc.printInfo("��ɫ��ӡ����ӡ");
	}

}
//ѧУ
class School{
	private Printer printer;//��ӡ��

	public School(){
		
	}
    public School(Printer printer){
		this.printer = printer;
	}
    public void printInfo(String messge){
    	this.getPrinter().print(messge);
    }
	private Printer getPrinter() {//��װ �õ��ķ�����װ��ֻ��ͨ���Լ��ķ�������
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
}

//�ڰ״�ӡ�������ࣩ
class BlackPrinter extends Printer{

	@Override
	void print(String messge) {//��ǰû��abstract �����ʵ�ֳ��󷽷� ��Ȼ����
	System.out.println("�ڰ״�ӡ�������С�������"+messge);
		
	}
	
}
//��ɫ��ӡ�������ࣩ
class ColorPrinter extends Printer{

	@Override
	void print(String messge) {
		System.out.println("��ɫ��ӡ�������С�������"+messge);
		
	}
	
}
//������  ���Բ�д���󷽷�
abstract class Printer{
	public  String name;
	
	public Printer(){//���췽��
		
	}
	
	public void show(){
		System.out.println("��ӡ��");
	}
	//���󷽷�
	abstract void print(String messge);//��֪��ִ��ʲô  �������������Ҫ��ʲô
}
