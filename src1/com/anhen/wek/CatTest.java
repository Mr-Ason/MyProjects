package com.anhen.wek;

import java.util.*;

public class CatTest {
	public static void main(String [] args){
		Cat c= new Cat("���ı�ʱ");
		c.show();
		//��������CatList
		ArrayList  al = new ArrayList();
		
		//���Ԫ��
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("����");
		
		//��ӡ����
		sop(al);
		//��������
		Iterator it = al.iterator();
		while(it.hasNext()){
			sop("����Ԫ�أ�"+it.next());
		}
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}





//Cat��
class Cat{
	//����
	private String name;
	
	//�޲ι��� ��ʼ������
	public Cat(){
		
	}
	public Cat(String name){
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.println("è����"+this.name);

	}
}	


