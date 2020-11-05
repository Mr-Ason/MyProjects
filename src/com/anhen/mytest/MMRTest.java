/**   
 * projectName: MyJava   
 * fileName: MMRTest.java   
 * packageName: com.anhen.mytest   
 * date: 2018年7月28日上午11:11:12   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.anhen.mytest;

/**     
 * @title: MMRTest.java   
 * @package com.anhen.mytest   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年7月28日 上午11:11:12   
 * @version: V1.0     
*/
public class MMRTest {

	/**  
	 *@title: main   
	 *@description: TODO  
	 *@author: LiuJiDong  
	 *@date: 2018年7月28日 上午11:11:13  
	 *@param args  
	 *@throws:   
	 */
	public static void main(String[] args) {
		Integer f1=100,f2=100,f3=150,f4=150;
		System.out.println(f1==f2);
		System.out.println(f3==f4);//integer取值范围  -128~127
		
		A ab = new B();
		ab = new B();

	}

}

class A{
	static{
		System.out.println("1");
	}
	public void a(){
		System.out.println("2");
	}
}

class B extends A{
	static{
		System.out.println("b");
	}
	public void  b(){
		System.out.println("c");
	}
}
