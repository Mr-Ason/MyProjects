package com.anhen.day11;
/*�����ڲ����ص㣺û�����ֵ�ʵ����
 * ���� �﷨��
 * 			new �ӿ�(){
 *    			//ʵ�ֳ��󷽷�
 *    }
 *    new ����(){
 *    			//�̳и���
 *    }
 * ΪʲôҪʹ�������ڲ��ࣺ�򻯴��룬�����¼��İ�
 * */
public class TestIPC {

	public static void main(String[] args) {
		// ����TestClassʵ��
		TestClass test = new  TestClass();
		IPC ipc = new TIPC();
		test.test(ipc);
		
		//�����ڲ���
		test.test(new IPC(){//��ʵ�������ǻ������еĶ���
			//���Լ����ԡ���Ӧ����
			@Override
			public void show() {
				System.out.println("�����ڲ���ķ�������");
				
			}
			
		});
		//������������ڲ���  ���Ƽ�
		new IPC(){

			public String name = "����";
			public void print(){
				
			}
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
	
		}.print();;
	}

}

//������
abstract class Parent{
	public abstract void  print();
}

class TestClass{
	public void test(IPC ipc){//�ӿ���Ϊ��������
	System.out.println("���Խӿڵ�ʵ����");
	ipc.show();
	}
}
//��ʵ�ֽӿ�
class TIPC implements IPC{

	@Override
	public void show() {
		System.out.println("��ʵ�ֽӿ�");
		
	}
	
}
//һ���ӿڿ��Լ̳ж���ӿ�
 interface IPC extends TIPCA,TIPCB{
	public void show();
	
}

interface TIPCA{
	
}
interface TIPCB{
	
}