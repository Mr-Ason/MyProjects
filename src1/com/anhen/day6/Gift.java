package com.anhen.day6;

public class Gift {//��Ķ��壨������ࣩ
	//����
	public String name;//����
	public double price;//�۸�
	
	//����
	public void run(String name){
		System.out.println("��Ʒ����"+name);
	}
	public void run(double price){
		System.out.println("��Ʒ�۸�"+price);
	}
	public void show(String name,double price){
		System.out.println("��Ʒ����"+name+"\n"+"��Ʒ�۸�"+price);
	}
}
