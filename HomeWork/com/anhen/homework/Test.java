package com.anhen.homework;

public class Test {

	public static void main(String[] args) {
		PetShop ps = new PetShop(5);
		ps.add(new Cat("��è","��ɫ��","��", 1));
		ps.add(new Cat("��è","��ɫ��","��", 1));
		ps.add(new Cat("��è","��ɫ��","��", 1));
		ps.add(new Cat("�׺�è","�׺�ɫ��","��", 1));
		ps.add(new Dog("��ë��","��ɫ��","��", 1));
		ps.add(new Dog("�ڹ�","��ɫ��","��", 1));
		showInfo(ps.search("��"));

	}
public static void showInfo(Pet p[]){
	for(int i = 0;i<p.length;i++){
		if(p[i]!=null){
			System.out.println("����:"+p[i].getName()+";��ɫ:"+p[i].getColor()+";����:"+p[i].getAge());
		}
	}
}

}
