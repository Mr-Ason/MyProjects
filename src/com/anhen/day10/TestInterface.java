package com.anhen.day10;
/*
 * */
public class TestInterface {

	public static void main(String[] args) {
		//�ӿڲ��ܱ�ʵ����
		PrinterInterface black = new BlackPrinter2();
		black.print("�γ�");
		PrinterInterface color = new ColorPrinter2();//����ת��
		color.print("wo");
		System.out.println(PrinterInterface.NAME_PRINTER);
		
		PrinterInterface[] array = {black,color};//��ӡ������
		for(PrinterInterface ele:array){
			if(ele instanceof BlackPrinter2){
				BlackPrinter2 bl = (BlackPrinter2) ele;//����ת��
				bl.show();
			}
		}
	}

}

//�ڰ״�ӡ��   ʵ�ֽӿ�
class BlackPrinter2 implements PrinterInterface{

	@Override
	public void print(String message) {//��д�ӿڵķ���
		System.out.println("�ڰ״�ӡ��ʵ�ֽӿڵĹ��ܣ�"+message);
		
	}
	public void show(){
		System.out.println("");
	}
	
}
//��ɫ��ӡ��   ʵ�ֽӿ�
class ColorPrinter2 implements PrinterInterface{

	@Override
	public void print(String message) {
		System.out.println("��ɫ��ӡ��ʵ�ֽӿڵĹ��ܣ�"+message);
		
	}
	
}

//�ӿ� ��ӡ��
	interface PrinterInterface{
		public final static String NAME_PRINTER="��ӡ��";  //Ҫ�������Եĸ�ʽ �� �Լ���ɳ�ʼ���ı�����
		public void print(String message);
		
	}
