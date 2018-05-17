package com.anhen.day13;
/*��̬����ģʽ
 * 1����Ʒ���пɹ��Բ�����ֲ�Ʒ�쳣��
 * ��Ҫ������������ʱ��ʹ�ù���ģʽ
 * */

public class TestStaticFactory {

	public static void main(String[] args) {
		//�����Ϣ���Ͷ���
		Sender1 sender = SenderFactory1.getMailSender();
		sender.send();

	}

}
//���͹���
class SenderFactory1{
	private SenderFactory1(){}
	public static Sender1 getMailSender(){
		return new MailSender1();
		
	}
	public static Sender1 getSmsSender1(){
		return new SmsSender1();
		
	}
}
//ʵ���� ����
class MailSender1 implements Sender1{

	@Override
	public void send() {
		System.out.println("���䷢��");
		
	}
	
}

//ʵ���� ����
class SmsSender1 implements Sender1{

	@Override
	public void send() {
		System.out.println("���ŷ���");
		
	}
	
}
//�ӿ�  ������Ϣ�ӿ�
interface Sender1{
	public void send();
	
}
