package com.anhen.day13;
/*静态工厂模式：
 *   1.产品具有可观性，不会有异常产品;
 *   2.缺点 ： 产品单一；
 * 需要创建大量对象时，使用工厂模式。
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

//发送信息工厂
class SenderFactory{
	private SenderFactory(){
		
	}
	public static Sender getMailSender(){//静态
		return new MailSender();
	}
	public static Sender getSmsSender(){//静态
		return new SmsSender();
	}	
}

//实现类
class MailSender implements Sender{
	@Override
	public void send() {
		System.out.println("这是邮箱发送！");
	}
}
//实现类 短信
class SmsSender implements Sender{
	@Override
	public void send() {
		System.out.println("这是短信发送！");
	}	
}
//接口 发送消息
interface Sender{
	public void send();
}