/*package com.anhen.day9;
//��̬Ӧ��
public class TestTeacher {
	public static void main(String[] args) {
		Tr teacher = new Tr();
		//teacher.show();
		Tr JavaTr = new JavaTr("����");
		JavaTr.show();
		Tr PhpTr = new PhpTr("������");
		PhpTr.show();
	}

}
//����
class Tr{
	//����
	private String name;
	private String classname;
	//����
	public  Tr(){
		
	}
	public Tr(String name,String classname){
		this();
		this.name = name;
		this.classname = classname;
	}
	//��ͨ����  ������ʾ ��Ϣ
	public void show(){
		//����������ֱ�Ӹ�ֵprivate String name = "����";private String classname="����";
		System.out.println("���� "+name+"\t�Ǽ����"+classname+"��ʦ");
	}
}
//���� 
class JavaTr extends Tr{
	//�޲η���
	public JavaTr(){
		
	}
	public JavaTr(String name){//���ø��෽��
		super(name,"java");
	}
	public void show(){
		super.show();
		System.out.println("�����ʲô��");
	}
}
class PhpTr extends Tr{
	//�޲η���
	public PhpTr(){
		
	}
	public PhpTr(String name){
		super(name,"Php");
	}
	//��ͨ����
	public void show(){
		super.show();
		System.out.println("����ô�ѣ�");
	}
}
*/
package com.anhen.day9;

public class TestTeacher{
	   public static void main(String [] args){
		   //��ӡ����
		   Tr  fu = new Tr("����",23);
		   fu.show();
		   Tr student = new Student("������");
		   student.show();
		   Tr xinxi = new Tr();
		   xinxi.showTr(student);
		   xinxi.showTr(student);
		
	}
}
//����
class Tr{
	//����
	public String name;
	public int age;
	//����
	public Tr(){//�޲ι���  ��ֱֵ�������Ժ�
		
	}
	public void showTr(Tr student) {
		// TODO Auto-generated method stub
		
	}
	public Tr(String name,int age){
		this();//this �����޲�
		this.name = name;
		this.age = age;
	}
	//��ͨ����  ��ӡ
	public void show(){//��ӡ��������
		System.out.println("���֣�"+name+"\t���䣺"+age);
	}
}
//����
class Student extends Tr{
	//�޲ι���
	public Student(){
		
	}
	//�вι���
	public Student(String name){
		super(name,24);
	}
	public void show(){
		super.show();
		
	}	
}
// ��ѯ��Ϣ
class Xinxi{
	public void showTr(Tr tr){
		//Ĭ�ϵ��� ����
		tr.show();
	}
}

