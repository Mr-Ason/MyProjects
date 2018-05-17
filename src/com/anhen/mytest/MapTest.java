/**   
 * projectName: MyJava   
 * fileName: MapTest.java   
 * packageName: com.anhen.mytest   
 * date: 2018年2月12日下午2:09:52   
 * copyright(c) 2017-2020 xxx公司  
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
 * @date: 2018年2月12日 下午2:09:52   
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
		System.out.println("通过Map.entrySet使用iterator遍历key和value:");
		for(String key: map.keySet()){
			System.out.println("单独遍历键："+"key="+key);
		}
		for(String value:map.keySet()){
			System.out.println("单独遍历值："+"value="+value);
		}
		for(String maps:map.keySet()){
			System.out.println("同时遍历键值对："+"key="+maps+";value="+map.get(maps));
		}
		//第二种
	      System.out.println("通过Map.entrySet使用iterator遍历key和value：");
	      Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
	      while (it.hasNext()) {
	       Map.Entry<String, String> entry = it.next();
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }
	      
	      //第三种：推荐，尤其是容量大时
	      System.out.println("通过Map.entrySet遍历key和value:");
	      for (Map.Entry<String, String> entry : map.entrySet()) {
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }
	    
	      //第四种
	      System.out.println("通过Map.values()遍历所有的value，但不能遍历key:");
	      for (String v : map.values()) {
	       System.out.println("value= " + v);
	      }
	}
}