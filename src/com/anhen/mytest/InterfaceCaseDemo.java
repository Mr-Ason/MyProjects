package com.anhen.mytest;

public class InterfaceCaseDemo {

	public static void main(String[] args) {
		showInfor show = new showInfor();
		show.showWork(new  Flash());//�����еķ������Ǿ�̬�� ��ͨ��ʵ��������
		showInfor.showWork(new Print());//��̬��    ����.����  ����

	}

}
//����һ������  ��ν�Ĺ�����
class showInfor{
	public static void showWork(USB usb){
		usb.startWork();
		usb.stopWork();
		
	}
}

//����һ��USB�ӿ�
interface USB{
	//����ӿڷ���
	public void startWork();
	public void stopWork();
}
//����ʵ�ֽӿڵķ���
class Flash implements USB{
	public void startWork(){
		System.out.println("U�̿�ʼ����....");
	}
	public void stopWork(){
		System.out.println("U��ֹͣ����....");
	}
}
//����ʵ�ֽӿ���
class Print implements USB{
	public void startWork(){
		System.out.println("��ӡ����ʼ����...");
	}
	public void stopWork(){
		System.out.println("��ӡ��ֹͣ������");
	}
}






