/**   
 * projectName: MyJava   
 * fileName: Runtime.java   
 * packageName: com.myReview.to   
 * date: 2018��8��8������10:42:20   
 * copyright(c) 2017-2020 xxx��˾  
 */ 
package com.myReview.to;

import java.io.IOException;

/**     
 * @title: Runtime.java   
 * @package com.myReview.to   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018��8��8�� ����10:42:20   
 * @version: V1.0     
*/
public class RuntimeDemo {
	public static void main(String[] args){
		RuntimeDemo.jvmDemo();
	}
	
	public static void jvmDemo(){
		Runtime rt = Runtime.getRuntime();
		System.out.println("jvm����ڴ�����"+rt.maxMemory());
		System.out.println("jvm�������ڴ棺"+rt.freeMemory());
		System.out.println("?:"+rt.totalMemory());
		
		String str = "Hello"+"Your"+"World"+"!!!"+"\t"+"welcom to there!!";
		System.out.println(str);
		for(int i = 0;i<100;i++){
			str += i;
		}
		System.out.println("������Ŀ����ڴ�"+rt.freeMemory());
		rt.gc();
		System.out.println("�������պ�Ŀ����ڴ棺"+rt.freeMemory());
	}
	
	public static void processDemo(){
		Runtime runtime = Runtime.getRuntime();
		Process pro = null; //����һ��process����һ�������Ľ���
		try {
			pro = runtime.exec("notepad.exe");//�򿪼��±�����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//��ӡ�쳣
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro.destroy();//�����򿪵Ľ���
	}

}
