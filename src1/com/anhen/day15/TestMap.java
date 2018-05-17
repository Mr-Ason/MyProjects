package com.anhen.day15;

import java.awt.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
	private static Set valueList;
	public static void main(String [] args){
		//创建map集合
		HashMap map = new HashMap();
		//新增元素
		//键值对的存储方法，key-value  key 必须唯一，hashMap可以为null
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(3, "C");
		map.put(null, "D");
		//取值
		sop(map.get(2));//2 为key
		//判断主键是否存在
		if(map.containsKey(3)){
			sop("主键:3  ;已存在");
		}else{
			sop("主键:3  ;可以使用");
		}
		//删除
		sop("删除："+map.remove(6));//不存在  不报错  返回 null
		sop("删除："+map.remove(3));
		//大小
		sop("大小"+map.size());
		//遍历Map
		//方法一：获得key集合
		sop("方法一  获得不重合的元素");
		Set keyset = map.keySet();
		//迭代器
		sop("用迭代器取集合中不重合的");
		Iterator it= keyset.iterator();
		while(it.hasNext()){
			Object key = it.next();
			Object val = map.get(key);
			sop("key:"+key+"val:"+val);
		}
		//方法二：获得value集合   快速访问值
		sop("方法二");
		Collection valList = map.values();
		Iterator it2 = valList.iterator();
		while(it2.hasNext()){
			Object val = it2.next();
			sop("值："+val);
			
		}
		//方法三：获得key-value
		sop("方法三");
		Set entrySet = map.entrySet();
		Iterator it3 = entrySet.iterator();
		while(it3.hasNext()){
			Map.Entry entry =(Map.Entry) it3.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
			sop("key:"+key+"val:"+val);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

}
