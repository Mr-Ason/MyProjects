package com.anhen.day7;
/*�ࣺ������ͬ���Ժ���Ϊ�Ķ���ĳ���
 * ���󣺿͹۴��ڵ���ľ���
 *  �������Ĺ�ϵ�� ������ �� è��è�Ƕ���
 *  ��Ķ��壺
 *    �����η��� class  ����{
 *    	//����
 *     //
 *     ����
 *    }
 * 1���η��Ƿ���Ȩ��
 *    public protectde private static final 
 *  2������
 *      ���η�  �������� �����������Ը�ֵ����public String color;
 * 3������
 * 		���η�  ��������  ��������<�����б�>��{
 * 				return �������͵�ֵ��//void ���Բ�дreturn
 * 		}
 * 		�����б��������� ����1���������� ����2......��
 * 		1.�������������ޣ������Ƽ���һ���ĵ����
 * 		2.�������ͱ���һһ��Ӧ
 * 		3.�βΣ���ʽ�ϵĲ��������ڷ��������ʱ�������ֵȡ�����֣�����������������
 *         ʵ�Σ����������ݣ��������õ�ʱ��д�ڲ����б�ģ���������������
 * */

public class MyCar {
	//����
	public String color="��ɫ";
	public double prices=152.30;
	public String  logo = "����";
	public double speed;//�ٶ�
	
	//����speed�ķ���
	public  void run(int hours){
		System.out.println("����" +(this.speed *hours)+"ǧ��");
	}
	
	//�з���ֵ�÷���
	public String getLogo(){//��ȡ����Ʒ��
		String str = "�Ϻ�"+this.logo;
		return str;
	}
	
	//�����б������   û�з��ز��� ֱ�Ӵ�ӡ
	public void show(String name,int age){//�β� ���յ��÷�������������ֵ
		System.out.println(name+","+age);
	}
}
