package com.anhen.day16;
/*����
 *   1�����巺��
 *        ����<T>{
 *         private T name;
 *         
 *        }
 * 2��ʹ�÷���
 *     ����<T>  ������ = new ����<T>();
 * 3�����͵ĺô�
 *     a.û���������͵�ʹ�÷�Χ��ֻ����һ���淶���ã�
 *        ʹ�÷��ͺ�ֻ�ܴ��һ���������ͣ�
 *     b.��ȡֵʱ����Ҫת�ͣ����һ��б������Ѵ�����ʾ��
 *     c.����Ҫ��������ת�������Ч�ʡ�
 */
public class TextBox {
	public static void main(String[] args) {
		//����������
		//���stirng
		Boxing box = new Boxing();
		box.setBoxing("ֵ");//װ��
		Object obj = box.getBoxing();//����
		//���clothֵ
		box.setBoxing(new Cloth("����ֵ"));
		Cloth cloth =(Cloth) box.getBoxing();
		System.out.println("clothde name:"+cloth.getName());
		//���intֵ
		box.setBoxing(100);
		Integer integer = (Integer) box.getBoxing();
		
		//ʹ�÷��ͱ��
		Boxing<String> box2= new Boxing<String>();
		box2.setBoxing("�ַ���");
		String str = box2.getBoxing();//����Ҫ����
		//box2.setBoxing(new Cloth(""));//���뱨��
		Boxing<Cloth> box3 = new Boxing<Cloth>();
		box3.setBoxing(new Cloth("����"));
		Cloth val = box3.getBoxing();
		System.out.println(val.getName());
		Boxing<Integer> box4 = new Boxing<Integer>();
		box4.setBoxing(200);
		System.out.println(box4.getBoxing()-100);

	}
}
//������  ʹ�÷���
class Boxing<T>{//T��������
	private T boxing;

	public T getBoxing() {
		return boxing;
	}

	public void setBoxing(T boxing) {
		this.boxing = boxing;
	}

}
class Cloth{
	private String name;

	public Cloth(String getBoxing){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}