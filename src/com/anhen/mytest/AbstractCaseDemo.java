package com.anhen.mytest;
//�������ʵ��Ӧ��
/*�˷�Ϊѧ���͹��ˣ�������˵����˵�����ݲ�ͬ
 * */
public class AbstractCaseDemo {

	public static void main(String[] args) {
		Personss p = new Students("���̶�",23,100);
		//System.out.println(p.getContent());
		p.show();
	}

}
//���������
abstract class Personss{
	//�����װ����
	private String name;
	private int age;
	
	//�вι���
	public Personss(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//get set
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
	//������ͨ��ʾ����
	public void show(){
		System.out.println(this.getContent());
	}
	//����˵������
	public abstract String getContent();
}
//����ѧ������
class Students extends Personss{
	//����ѧ��ר������
	private float score;
	//���ι���
	public Students(String name, int age,float score) {
		super(name, age);
		this.score=score;
	}
	@Override
	public String getContent() {
		return "ѧ��������"+super.getName()+";ѧ�����䣺"+super.getAge()+";ѧ���ɼ�:"+this.score;
	}
	
}
//���幤������
class Works extends Personss{
	private float salary;
	
	public Works(String name,int age,float salary){
		super(name, age);
		this.salary =salary;
	}
	@Override
	public String getContent(){
		return "����������"+super.getName()+";�������䣺"+super.getAge()+";���˹���:"+this.salary;
	}
}










