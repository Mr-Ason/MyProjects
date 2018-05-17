package com.anhen.day13;
/*静态工厂模式
 * 1、产品具有可观性不会出现产品异常。
 * 需要创建大量对象时，使用工厂模式
 * */

public class TestStaticFactory {

	public static void main(String[] args) {
		//获得信息发送对象
		Sender1 sender = SenderFactory1.getMailSender();
		sender.send();

	}

}
//发送工厂
class SenderFactory1{
	private SenderFactory1(){}
	public static Sender1 getMailSender(){
		return new MailSender1();
		
	}
	public static Sender1 getSmsSender1(){
		return new SmsSender1();
		
	}
}
//实现类 邮箱
class MailSender1 implements Sender1{

	@Override
	public void send() {
		System.out.println("邮箱发送");
		
	}
	
}

//实现类 短信
class SmsSender1 implements Sender1{

	@Override
	public void send() {
		System.out.println("短信发送");
		
	}
	
}
//接口  发送消息接口
interface Sender1{
	public void send();
	
}
