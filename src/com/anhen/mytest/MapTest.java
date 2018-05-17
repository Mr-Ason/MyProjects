/**   
 * projectName: MyJava   
 * fileName: MapTest.java   
 * packageName: com.anhen.mytest   
 * date: 2018��2��12������2:09:52   
 * copyright(c) 2017-2020 xxx��˾  
 */ 
package com.anhen.mytest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**     
 * @title: MapTest.java   
 * @package com.anhen.mytest   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018��2��12�� ����2:09:52   
 * @version: V1.0     
*/
public class MapTest {
	public static void main(String[] args){
		MyMapTest mt = new MyMapTest();
		mt.mapList();
	}
}

class MyMapTest{
	public void mapList(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("01", "value1");
		map.put("02", "value2");
		map.put("03", "value3");
		map.put("04", "value4");
		map.put("05", "value5");
		System.out.println("ͨ��Map.entrySetʹ��iterator����key��value:");
		for(String key: map.keySet()){
			System.out.println("������������"+"key="+key);
		}
		for(String value:map.keySet()){
			System.out.println("��������ֵ��"+"value="+value);
		}
		for(String maps:map.keySet()){
			System.out.println("ͬʱ������ֵ�ԣ�"+"key="+maps+";value="+map.get(maps));
		}
		//�ڶ���
	      System.out.println("ͨ��Map.entrySetʹ��iterator����key��value��");
	      Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
	      while (it.hasNext()) {
	       Map.Entry<String, String> entry = it.next();
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }
	      
	      //�����֣��Ƽ���������������ʱ
	      System.out.println("ͨ��Map.entrySet����key��value:");
	      for (Map.Entry<String, String> entry : map.entrySet()) {
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }
	    
	      //������
	      System.out.println("ͨ��Map.values()�������е�value�������ܱ���key:");
	      for (String v : map.values()) {
	       System.out.println("value= " + v);
	      }
	}
}