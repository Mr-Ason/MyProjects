package com.anhen.day11;
/*�ӿڣ���ȫ�ֱ����ͳ��󷽷����
 * 
 * �ͳ����������
 * 1����ͬ�㣺������ʵ�ֶ�̬��
 * 2����������ṩ��Ա������ʵ�֣��ӿڶ��ǳ��󷽷���
 * 3���ӿ��г�Ա����ֻ����public static final�ģ������಻�ޣ�
 * 4���ӿ��в����о�̬����鼰��̬�����������಻�ޣ�
 * 5��һ����ֻ�ܼ̳�һ�������࣬ȴ���Լ̳ж���ӿڣ�
 * 6���������Ƕ�һ������ĳ��󣬶��ӿ��Ƕ���Ϊ�ĳ���
 * 7��������Ϊ���࣬��һ��ģ��ʽ��ƣ��ӿ���һ����Ϊ�淶���Ƿ���ʽ��ơ�
 * 8��ʹ�ó�����Ķ����Ǵ���ĸ��ã�ʹ�ýӿڵĶ����ǣ�ʵ�ֶ�̬��
 * */
public interface TestInterface {
	String NAME = "���̶�";// Ĭ��Ϊpublic static final String NAME = "���̶�";
		
   //���󷽷�
	public void test();
}
//�ӿڼ̳нӿ�
interface sonInterface extends  TestInterface{
	public void sonTest();
}

class Test extends  Object implements  TestInterface,sonInterface{

	@Override
	public void sonTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}
