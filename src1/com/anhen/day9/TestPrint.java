package com.anhen.day9;
//����
public class TestPrint {
	public static void main(String[] args){
		
	    new BlackPrinter();
		
		
	}

}

abstract class Printer{//�������
	abstract void println(String message);
}

//�ڰ״�ӡ��
class BlackPrinter extends Printer{
	@Override
	void println(String message) {
		// TODO Auto-generated method stub
		System.out.println("�ڰ׵��Ӿ����ڹ���������");
	}
}
class School{
	 //private Printer printer;//��ӡ��
     public School(){
	  
  }
}
