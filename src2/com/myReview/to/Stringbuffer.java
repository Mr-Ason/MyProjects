/**   
 * projectName: MyJava   
 * fileName: Stringbuffer.java   
 * packageName: com.myReview.to   
 * date: 2018年8月8日上午10:25:49   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.myReview.to;

/**     
 * @title: Stringbuffer.java   
 * @package com.myReview.to   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年8月8日 上午10:25:49   
 * @version: V1.0     
*/
public class Stringbuffer {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		StringBuffer  buf = new StringBuffer();
		buf.append("hello ").append("your");
		buf.append("world!!");
		System.out.println(buf);
		String str = buf.delete(6, 10).toString();
		System.out.println(str);
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行的时间："+(startTime-endTime)+"毫秒");
	}

}
