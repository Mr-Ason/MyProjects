package com.anhen.day6;
/*�ࣺ ������ͬ���Ժ���Ϊ�Ķ���ĳ���
	 *���󣺿͹۴��ڵ���ľ���
	 * ��Ͷ���Ĺ�ϵ��
	 *  1�����Ƕ���ĳ��󣬶�������ľ���
	 *  2�����Ƕ����ģ�壬��������Ĳ�Ʒ
	 * ��Ķ����﷨��
	 *  [���η�] class ����{
		 *  //����
		 *  //������ģ��Ĺ���
	 *  
	 *       }
	 * 1�����η� ����Ȩ��
	 *     public  protected private static final
	 * 2������
	 *      ���η�  ��������  ������;
	 *       public String color="��ɫ";//��ɫ
	 *       public String color;//�������͵�Ĭ��ֵ
	 * 3������
	 *      ���η� ��������  �������������б�{
	 *      return �������͵�ֵ��//void ����д���Բ�дreturn
	 *     }
	 *    �����б���������  ����1����������  ����2  ������������
	 *     1���������������ޣ������Ƽ�
	 *     2���������ͱ���һһ��Ӧ
	 *     3���βΣ���ʽ�ϵĲ��������ڷ��������ʱ�򣬸�����ֵȡ�����֣���������Ĳ���
	 *         ʵ�Σ��������������ڵ��÷�����ʱ��д�ڲ����б���ģ����������Ĳ���
	 * 
	 */
public class Car {//��Ķ���
		//����
		public String color;//��ɫ
		//�ͺ�
		public double privice;//�۸�
		public String logo = "����";//Ʒ��
		public double speed;//�ٶ� KM/H
		//������
		
		//����
		public void run(int hours){ //��
			//
			System.out.println("���ˣ�"+(this.speed*hours)+"KM!");
		}
		
		public String getlogo(){//���Ʒ��
			String str = "�Ϻ�"+this.logo;
			return str;
		}
		public void show(String name,int age,int speed){//�β�
			System.out.println(name+","+age);
		}
}



