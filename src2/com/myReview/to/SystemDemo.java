/**   
 * projectName: MyJava   
 * fileName: SystemDemo.java   
 * packageName: com.myReview.to   
 * date: 2018年8月8日上午11:42:16   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.myReview.to;

/**     
 * @title: SystemDemo.java   
 * @package com.myReview.to   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年8月8日 上午11:42:16   
 * @version: V1.0     
*/
public class SystemDemo {

	
	public static void main(String[] args) {
		SystemDemo.getSystemInfo();

	}
	public static void getAllSystemInfo(){
		System.getProperties().list(System.out);//列出系统的全部属性
	}
	
	public static void getSystemInfo(){
		System.out.println("当前系统版本："+System.getProperty("os.name")+System.getProperty("os.version")+"\t"+System.getProperty("os.arch"));
		System.out.println("系统用户："+System.getProperty("user.name"));
		System.out.println("当前用户目录："+System.getProperty("user.home"));
		System.out.println("当前用户工作目录："+System.getProperty("user.dir"));
	}

}
