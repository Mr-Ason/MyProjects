/**   
 * projectName: MyJava   
 * fileName: ArrayListTest.java   
 * packageName: com.anhen.mytest   
 * date: 2018��2��12������11:02:07   
 * copyright(c) 2017-2020 xxx��˾  
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
 * @date: 2018��2��12�� ����11:02:07   
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
		//��һ�ֱ�������
		for(String str: list){//Ҳ���Ը�дfor(int i=0;i<list.size();i++)������ʽ
			//System.out.println(list);//����listʱ �м���Ԫ�ؾͱ�������
			System.out.print(str+"��");//����һ��Ԫ��
		}
		//�ڶ��ֱ�������,�������Ϊ������ص����ݽ��б���
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		String[] str = new String[list.size()];
		list.toArray(str);
		for(int i = 0;i<str.length;i++){//����Ҳ���Ը�дΪ  foreach(String str:strArray)������ʽ
			System.out.println(str[i]);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		//�����ֱ���  ʹ�õ�����������ر���
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
