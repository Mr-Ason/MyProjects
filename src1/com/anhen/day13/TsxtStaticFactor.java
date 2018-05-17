package com.anhen.day13;
/*��̬����ģʽ��
 *   1.��Ʒ���пɹ��ԣ��������쳣��Ʒ;
 *   2.ȱ�� �� ��Ʒ��һ��
 * ��Ҫ������������ʱ��ʹ�ù���ģʽ��
 * 
 */
public class TsxtStaticFactor {
	public static void main(String [] args){
		Sender sender = SenderFactory.getMailSender();
		sender.send();
		Sender sender1 = SenderFactory.getSmsSender();
		sender1.send();
	}

}

//������Ϣ����
class SenderFactory{
	private SenderFactory(){
		
	}
	public static Sender getMailSender(){//��̬
		return new MailSender();
	}
	public static Sender getSmsSender(){//��̬
		return new SmsSender();
	}	
}

//ʵ����
class MailSender implements Sender{
	@Override
	public void send() {
		System.out.println("�������䷢�ͣ�");
	}
}
//ʵ���� ����
class SmsSender implements Sender{
	@Override
	public void send() {
		System.out.println("���Ƕ��ŷ��ͣ�");
	}	
}
//�ӿ� ������Ϣ
interface Sender{
	public void send();
}