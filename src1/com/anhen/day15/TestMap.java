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
		//����map����
		HashMap map = new HashMap();
		//����Ԫ��
		//��ֵ�ԵĴ洢������key-value  key ����Ψһ��hashMap����Ϊnull
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(3, "C");
		map.put(null, "D");
		//ȡֵ
		sop(map.get(2));//2 Ϊkey
		//�ж������Ƿ����
		if(map.containsKey(3)){
			sop("����:3  ;�Ѵ���");
		}else{
			sop("����:3  ;����ʹ��");
		}
		//ɾ��
		sop("ɾ����"+map.remove(6));//������  ������  ���� null
		sop("ɾ����"+map.remove(3));
		//��С
		sop("��С"+map.size());
		//����Map
		//����һ�����key����
		sop("����һ  ��ò��غϵ�Ԫ��");
		Set keyset = map.keySet();
		//������
		sop("�õ�����ȡ�����в��غϵ�");
		Iterator it= keyset.iterator();
		while(it.hasNext()){
			Object key = it.next();
			Object val = map.get(key);
			sop("key:"+key+"val:"+val);
		}
		//�����������value����   ���ٷ���ֵ
		sop("������");
		Collection valList = map.values();
		Iterator it2 = valList.iterator();
		while(it2.hasNext()){
			Object val = it2.next();
			sop("ֵ��"+val);
			
		}
		//�����������key-value
		sop("������");
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
