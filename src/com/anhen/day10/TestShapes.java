package com.anhen.day10;
/*��̫
 * */

public class TestShapes {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.show();
		Circle circle = new Circle();
		circle.show();
		circle.showCicle();
		//����ת��
		//����ת�ͣ�������������� �����ʵ������ 
		//1������ʱ�����ֶ������ҵ��������е����Ի򷽷�
		//2������ʱ�����ֶ���ķ������ȴ������е���
		Shape cr =  new Circle();
		//cr.showCicle();���෽����ʧ
		cr.show();//�˴����õ�������ķ�������д�˸��෽����
		System.out.println(cr.name);//����û����д�ĸ��� ���Ե��õĸ��������
		//�������ͣ��޶��˱���ֻ��ʹ�õ����Ժͷ���
		//������дʱ ������������õķ�������ȥ����������Ƿ����
		//��������ʱ�����ǴӸ����е���
		
		//����ת��(ǿ��ת��)  ������������� �����ʵ������
		System.out.println("����ת��~~~~~");
		//����ת������ȫ   java.lang.ClassCastException  
		//System.out.println(sh.name);
		//�������
//		if(cr instanceof Circle){
//			System.out.println("�������ʱCircle����");
//		}
		Circle[]  arrays = {circle,(Circle) new Shape()};
		for(Circle ele:arrays){
			if(ele instanceof Circle){//��֤�ǲ�������Circle
				System.out.println(ele);
			}else{
				System.out.println("���������Circle����");
			}
			
		}
 	}

}

class Circle extends Shape{
	public String name="����";
	public int age;
	//���෽��
	public void showCicle(){
		System.out.println("����ķ���");
	}
	//��д
	public void show(){
		System.out.println("��д����ķ���");
	}	
	
}

class Shape{
	public String name="����";
	public void show(){
		System.out.println("����ķ���");
	}	
}
