package com.anhen.day9;
//�̳�
/*�̳У����Ѵ��ڵ������������µ��࣬������и�������Է��������ԣ���������չ�Լ������Ժͷ�����
 *   �ô��� 1�������������  2�����ٿ�������
 *   ʹ�ã�ʹ�ùؼ���  extends 
 *           ���� extends ����{ }
 *     1���̳� extends ֻ�ܵ��̳У�����ͬʱ�̳ж������
 *     2���̳о��д����ԣ�C��̳���B�࣬B��̳���A�࣬C��;�����A���B������Ժͷ���
 *     3�������������ʱ������ø���Ĺ��췽��������ָ��һ������Ĺ��췽����Ĭ��ָ��������޲ι��췽��
 *     ע�⣺�����ඨ���˹��췽����û�й����޲ι��췽��ʱ �������ָ�����ø����һ�����ڵĹ��췽��
 * ����̳и�����Ӱ�죺
 * 	  1����Ա���ԣ����������к͸����е�������ͬʱ�����Ǹ����е����ԣ�������������ԣ�û�б�Ҫ�����������ԣ���չ�����Ծ��У�
 *    2����������ʹ����дʱ������ķ����Ḳ�Ǹ���ķ�������������ķ���
 *    3�����췽���������ȵ��ø���Ĺ��췽��super()��  super.run();
 *    
 *  ��д�����า�Ǹ���ķ���
 *       1��������������ͬ
 *       2�������б���ͬ���������ͣ�������
 *       3���������η�Ȩ�� ���ܱȸ���С
 *       
 * ���췽��:
 *    1��this() ��  super()����ͬʱ������һ�����췽����
 *    2���вεĵ����޲εĹ��췽��
 */
public class Person {
	public String name;
	public String age;
	
	public void run(){
		System.out.println("����������...");
	}
	
	//���췽��
	public Person(){
		System.out.println("��������˸���Ĺ��췽��");
	}
	public Person(String name,String age){
		this.name = name;
		this.age = age;
	}
	
	
	public static void main(String[] args){
		//��������
		Person person = new Person("�ǵ�","1000");
		person.run();
		//��������
		Man man = new Man();
		man.run();//���ø��෽��
		man.eatFood();//�����������Լ��ķ���
		System.out.println("������ø�������ԣ�"+man.name);
		
	}
	
	
	
}
//�̳�  ֻ�ܵ��̳�
class Man extends Person{
	public String job;
	//public String name;//�Ḳ�Ǹ����name����
	
//	public Man(){//���Խ��������û���޲ι��췽��
//		super("����","35");
//	}
//	
	public Man(){
		super("Man","50");
		System.out.println("������޲ι��췽��");//�ȵ��ø�����޲ι��� �ڵ����Լ���
	}
	
	public Man(String jod){
		this();//�����Լ����޲η���
		this.job = job;
	}
	public Man(String name,String age,String job){
		super(name,age);
		this.job = job;
	}
	
	public void eatFood(){
		System.out.println("�����ڳԶ���...");
		
	}
	public  void run(){//�Ѿ�������ķ���������
		super.run();//���ø����еķ���   ͬʱ��ӡ����run��������
		System.out.println("��������...");
	}
}
