package com.anhen.mytest;

public class Test {
	
	private static final boolean ture = false;

	public static void main(String[] args) {
		String name = "adbsde";
		System.out.println("��ʼ�ַ�����");
	    int b = name.indexOf("s");
		System.out.println("�ҵ�ָ�����ݵ�λ�ã�"+name.indexOf("s"));
		String num = null;
		if(b>0){
			//num=name.substring(b);//ɾ��bǰ�������
			num=name.replace("s", "");//ɾ���ַ������ݵ�ָ������
		}
		System.out.println(num);
	}
}
