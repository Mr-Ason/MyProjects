package com.anhen.day16;
/*����
 * 1�����巺��:������ʱ��ָ�����е����Եľ������ͣ������ⲿ��������ʵ����ʱָ��
 *   ����<T>{//T��ʾ�������ͻ�������
 *   	private T name;
 *   2��ʹ�÷���
 *    ����<T> ������ = new ����<T>(); 
 *   }
 *   3�����͵ĺô�
	 *    1.û���������͵�ʹ�÷�Χ��ֻ�ǹ淶���ã�ʹ�÷��ͺ�ֻ�ܴ��ͬһ�������͵�����
	 *    2.��ȡֵ��ʱ�򣬲���Ҫת�ͣ������б��������ʾ
	 *    3.����Ҫ��������ת�������Ч��
 * */
 
public class TestBoxing {

	public static void main(String[] args) {
	/*	// ����������
		//���String ֵ
		Boxing1 box = new Boxing1();
		box.setBoxing("ֵ");//���ַ���ת��Ϊ String װ��
		Object obj = (String)box.getBoxing();//����
		//���Clothֵ
		box.setBoxing(new Cloth1("����ֵ"));
		Cloth1 cloth = (Cloth1) box.getBoxing();
		System.out.println("cloth��ֵ��"+cloth.getName());
		//���intֵ
		box.setBoxing(100);
		Integer integer = (Integer) box.getBoxing();
	 */
		Boxing1<String> box2 =  new Boxing1<String>();
		box2.setBoxing("�ַ���");
		String str = box2.getBoxing();//����Ҫ����
//		box2.setBoxing(new Cloth1(""));//���뱨��
		Boxing1<Cloth1> box3 = new Boxing1<Cloth1>();
		box3.setBoxing(new Cloth1("����"));
		Cloth1 val = box3.getBoxing();
		System.out.println(val.getName());
		Boxing1<Integer> box4 = new Boxing1<Integer>();//ֻ�ܴ��int��
		box4.setBoxing(100);
		System.out.println(box4.getBoxing()-20);
	}

}
//������
class Boxing1<T>{//<>���巺��
	private T boxing;

	public T getBoxing() {
		return boxing;
	}

	public void setBoxing(T boxing) {
	this.boxing = boxing;
		
	}

	public void T(T boxing) {
		this.boxing = boxing;
	}
}
class Cloth1{
	private String name;

	public Cloth1(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}