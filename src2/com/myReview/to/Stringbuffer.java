/**   
 * projectName: MyJava   
 * fileName: Stringbuffer.java   
 * packageName: com.myReview.to   
 * date: 2018��8��8������10:25:49   
 * copyright(c) 2017-2020 xxx��˾  
 */ 
package com.myReview.to;

/**     
 * @title: Stringbuffer.java   
 * @package com.myReview.to   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018��8��8�� ����10:25:49   
 * @version: V1.0     
*/
public class Stringbuffer {
	public static void main(String[] args){
		StringBuffer  buf = new StringBuffer();
		buf.append("hello ").append("your");
		buf.append("world!!");
		System.out.println(buf);
		String str = buf.delete(6, 10).toString();
		System.out.println(str);
	}

}
