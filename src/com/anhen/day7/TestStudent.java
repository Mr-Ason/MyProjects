package com.anhen.day7;

public class TestStudent {

	public static void main(String[] args) {
		//ʵ����ѧ������
		Student stu1 = new Student("����", 176);
		stu1.show();
		Student stu2 = new Student("����", 170);
		stu2.show();
		//�Ƚ����˵����
		stu1.showHeight(stu2);
	}
}

class Students{
	//����
	public String name;
	public double height;
	
	//���췽�� ���������ó�ʼֵ
	public Students(String name,double height){
		System.out.println("�����˹��췽��");
		this.name = name;
		this.height = height;
	}
	//����
	public void show(){
		System.out.println("�ҵ������ǣ�"+name+",��ߣ�"+height);
	}
	//�Ƚ����
	public void showHeight(Student stu){
		if(this.height>stu.height){//this ������÷����Ķ��� Ҫ�����ȽϵĻ��Ͳ�һ�������Դ���
			System.out.println(this.name+"����");
		}else{
			System.out.println(stu.name+"����");
		}
	}
	
}
