package com.anhen.day15;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashTable {

	public static void main(String[] args) {
		//获得Hashtable 对象
		Hashtable table = new Hashtable();
		//添加元素
//		table.put(null, "A");//空指针
//		table.put(1, null);//空指针
//		Hashtable table2;
//		table2.size();
		table.put(1, "AAA");
		table.put(2, "BBB");
		table.put(3, "CCC");
		table.put(1, "DDD");//替换
		//大小
		sop("table大小："+table.size());
		//遍历  三种方式
//		Set keySet = table.keySet();
		Collection values = table.entrySet();
//		Set entrySet = table.entrySet();
		
		Iterator it = values.iterator(); 
		while(it.hasNext()){
			//sop(it.next());
			Map.Entry entry = (Map.Entry)it.next();
			sop(entry.getKey()+"="+entry.getValue());
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
