package com.anhen.day11;
/*��������һ����ʵ�ְ������ĳ�����
 * */
public class TestAdapter {

	public static void main(String[] args) {
		//�����ӿ�ʵ����
//		windowInterface w = new windowInterface(){�ӿڷ���̫��
//
//		};
		//ʹ��������ʵ�ֹ���
		windowAdater adater = new windowAdater(){

			@Override
			public void testA() {
				// TODO Auto-generated method stub
				
			}
			
		};

	}

}
//�����ӿڵ�������
abstract class windowAdater implements windowInterface{
	public void testB(){};
	public void testC(){};
	public void testD(){};
	public void testE(){};
	
}
//�������󷽷��ӿ�
interface windowInterface{
	public void testA();
	public void testB();
	public void testC();
	public void testD();
	public void testE();
}