package com.anhen.mytest;

public class Bijiao {

	public static void main(String[] args) {
		Person per1 = new Person("����",20);
		Person per2 = new Person("����",23);
		per1.compare(per2);
	}

}

class Person{
	//����
	private String name;
	private  int age;
	
	//���췽��
	public Person(){//�޲ι���
		
	}
	public Person(String name,int age){
		this.name = name;//���� this �Ļ� �ڴ���ʱ�Ҳ����޲�
		this.age = age;
	}
	public boolean compare(Person per){
		if(this.name.equals(per.name)&&this.age==per.age){//'=='�Ƚϵ��ǵ�ַ��equls�ǱȽ�����
			System.out.println("�����������");
		}else{
			System.out.println("�������˲�ͬ��");
		}
		return true;
	}
	//set get ��ȡ�ͷ��ʷ�װ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
