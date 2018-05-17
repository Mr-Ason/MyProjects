package com.anhen.day15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// 创建HashMap的实例
		HashMap map = new HashMap();
		//新增元素
		/*通过键值对的存储方式：key-value
		 * key必须唯一，hashmap必须唯一
		 * */
		map.put(1, "A");
		map.put(2, "B");
		map.put(2, "C");//key相同 相当于替换
		map.put(null, "D");
		//取值
		System.out.println(map.get(2));
		//判断主键是否存在
		if(map.containsKey(3)){
			System.out.println("主键3 已经存在");
		}else{
			System.out.println("主键3可以使用");
		}
		//删除元素
		System.out.println("删除了值："+map.remove(6));//主键 6不存在
		//大小
		System.out.println("map大小："+map.size());
		//遍历map
		//方式一：获得key集合
		Set keySet = map.keySet();
		//迭代器
		Iterator it = keySet.iterator();
		while(it.hasNext()){
			Object key = it.next();
			Object val = map.get(key);
			System.out.println("key:"+key+",value:"+val);
		}
		//方式二：获得value集合
		Collection valueList = map.values();
		Iterator it2 = valueList.iterator();
		while(it2.hasNext()){
			Object value = it2.next();//将下一个元素转换为对象
			System.out.println("值："+value);
		}
		//方式三：获得 key  value 集合
		Set enter = map.entrySet();
		Iterator it3 = enter.iterator();
		while(it3.hasNext()){
			Map.Entry entry = (Map.Entry) it3.next();
			Object val = entry.getValue();
			Object key = entry.getKey();
			System.out.println("键："+key+",值："+val);
			//System.out.println(it3.next());自动匹配键值
		}

	}

}
