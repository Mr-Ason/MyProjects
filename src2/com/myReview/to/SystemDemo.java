/**   
 * projectName: MyJava   
 * fileName: SystemDemo.java   
 * packageName: com.myReview.to   
 * date: 2018��8��8������11:42:16   
 * copyright(c) 2017-2020 xxx��˾  
 */ 
package com.myReview.to;

/**     
 * @title: SystemDemo.java   
 * @package com.myReview.to   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018��8��8�� ����11:42:16   
 * @version: V1.0     
*/
public class SystemDemo {

	
	public static void main(String[] args) {
		SystemDemo.getSystemInfo();

	}
	public static void getAllSystemInfo(){
		System.getProperties().list(System.out);//�г�ϵͳ��ȫ������
	}
	
	public static void getSystemInfo(){
		System.out.println("��ǰϵͳ�汾��"+System.getProperty("os.name")+System.getProperty("os.version")+"\t"+System.getProperty("os.arch"));
		System.out.println("ϵͳ�û���"+System.getProperty("user.name"));
		System.out.println("��ǰ�û�Ŀ¼��"+System.getProperty("user.home"));
		System.out.println("��ǰ�û�����Ŀ¼��"+System.getProperty("user.dir"));
	}

}
