/**   
 * projectName: MyJava   
 * fileName: Runtime.java   
 * packageName: com.myReview.to   
 * date: 2018年8月8日上午10:42:20   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.myReview.to;

import java.io.IOException;

/**     
 * @title: Runtime.java   
 * @package com.myReview.to   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年8月8日 上午10:42:20   
 * @version: V1.0     
*/
public class RuntimeDemo {
	public static void main(String[] args){
		RuntimeDemo.jvmDemo();
	}
	
	public static void jvmDemo(){
		Runtime rt = Runtime.getRuntime();
		System.out.println("jvm最大内存量："+rt.maxMemory());
		System.out.println("jvm最大空闲内存："+rt.freeMemory());
		System.out.println("?:"+rt.totalMemory());
		
		String str = "Hello"+"Your"+"World"+"!!!"+"\t"+"welcom to there!!";
		System.out.println(str);
		for(int i = 0;i<100;i++){
			str += i;
		}
		System.out.println("操作后的空闲内存"+rt.freeMemory());
		rt.gc();
		System.out.println("垃圾回收后的空闲内存："+rt.freeMemory());
	}
	
	public static void processDemo(){
		Runtime runtime = Runtime.getRuntime();
		Process pro = null; //声明一个process接收一个启动的进程
		try {
			pro = runtime.exec("notepad.exe");//打开记事本进程
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//打印异常
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro.destroy();//结束打开的进程
	}

}
