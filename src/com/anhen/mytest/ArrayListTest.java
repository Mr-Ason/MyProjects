/**   
 * projectName: MyJava   
 * fileName: ArrayListTest.java   
 * packageName: com.anhen.mytest   
 * date: 2018年2月12日上午11:02:07   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.anhen.mytest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**     
 * @title: ArrayListTest.java   
 * @package com.anhen.mytest   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年2月12日 上午11:02:07   
 * @version: V1.0     
*/
public  class ArrayListTest{
	public static void main(String[] args){
		ListTest.add();
	}
}
class ListTest {
	public static  void add(){
		List<String> list = new ArrayList<String>();
		list.add("me");
		list.add("you");
		list.add("her");
		list.add("she");
		list.add("he");
		//第一种遍历方法
		for(String str: list){//也可以改写for(int i=0;i<list.size();i++)这种形式
			//System.out.println(list);//传入list时 有几个元素就遍历几遍
			System.out.print(str+"、");//遍历一遍元素
		}
		//第二种遍历方法,把链表变为数组相关的内容进行遍历
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		String[] str = new String[list.size()];
		list.toArray(str);
		for(int i = 0;i<str.length;i++){//这里也可以改写为  foreach(String str:strArray)这种形式
			System.out.println(str[i]);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		//第三种遍历  使用迭代器进行相关遍历
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
