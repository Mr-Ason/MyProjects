package com.anhen.day15;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashTable {

	public static void main(String[] args) {
		//���Hashtable ����
		Hashtable table = new Hashtable();
		//���Ԫ��
//		table.put(null, "A");//��ָ��
//		table.put(1, null);//��ָ��
//		Hashtable table2;
//		table2.size();
		table.put(1, "AAA");
		table.put(2, "BBB");
		table.put(3, "CCC");
		table.put(1, "DDD");//�滻
		//��С
		sop("table��С��"+table.size());
		//����  ���ַ�ʽ
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
