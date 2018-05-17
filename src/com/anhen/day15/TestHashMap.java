package com.anhen.day15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// ����HashMap��ʵ��
		HashMap map = new HashMap();
		//����Ԫ��
		/*ͨ����ֵ�ԵĴ洢��ʽ��key-value
		 * key����Ψһ��hashmap����Ψһ
		 * */
		map.put(1, "A");
		map.put(2, "B");
		map.put(2, "C");//key��ͬ �൱���滻
		map.put(null, "D");
		//ȡֵ
		System.out.println(map.get(2));
		//�ж������Ƿ����
		if(map.containsKey(3)){
			System.out.println("����3 �Ѿ�����");
		}else{
			System.out.println("����3����ʹ��");
		}
		//ɾ��Ԫ��
		System.out.println("ɾ����ֵ��"+map.remove(6));//���� 6������
		//��С
		System.out.println("map��С��"+map.size());
		//����map
		//��ʽһ�����key����
		Set keySet = map.keySet();
		//������
		Iterator it = keySet.iterator();
		while(it.hasNext()){
			Object key = it.next();
			Object val = map.get(key);
			System.out.println("key:"+key+",value:"+val);
		}
		//��ʽ�������value����
		Collection valueList = map.values();
		Iterator it2 = valueList.iterator();
		while(it2.hasNext()){
			Object value = it2.next();//����һ��Ԫ��ת��Ϊ����
			System.out.println("ֵ��"+value);
		}
		//��ʽ������� key  value ����
		Set enter = map.entrySet();
		Iterator it3 = enter.iterator();
		while(it3.hasNext()){
			Map.Entry entry = (Map.Entry) it3.next();
			Object val = entry.getValue();
			Object key = entry.getKey();
			System.out.println("����"+key+",ֵ��"+val);
			//System.out.println(it3.next());�Զ�ƥ���ֵ
		}

	}

}
