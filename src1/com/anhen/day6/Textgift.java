package com.anhen.day6;

public class Textgift {
	public static void main(String[] args){
	//ʵ������
	Gift gift1 = new Gift();
	//�޸�����
	 gift1.name ="����ֽ";
	 gift1.price = 23.4;
	System.out.println("��Ʒ����"+gift1.name);
	System.out.println("�۸�"+gift1.price);
	gift1.show(gift1.name, gift1.price);

}
}