package com.anhen.day12;

import java.io.UnsupportedEncodingException;

public class TestString {
	public  static void main(String[] args) {
		try {
			test3();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test4(){//�ַ����ĳ���ʹ��
		//��ȡ�ַ���
		String str = "sdfdsgfga ds f";
		System.out.println(str.length());
		String str2 = str.substring(4);//��������ʼλ��
		System.out.println("��ȡ������ַ���"+str2);
		System.out.println("ԭ��"+str);
		
		String str3=str.substring(4, 5);
		System.out.println("��ʼ��ȡ��"+str3);
		
		//�滻�ַ���
		String str4 = str.replace("a", "A");
		System.out.println("�滻��ģ�"+str4);
		String str5 = str.replaceAll("a", "A");
		System.out.println("ȫ���滻��ģ�"+str5);
		
		//������ʽ
		
		String str6 = str.replaceAll("[a-d]", "��");//a��d�е���ĸ���滻
		System.out.println("abc".matches("[a-z]*"));//abc  �Ƿ���[a-z]��Χ��
		System.out.println(str6);
		//�ַ�������
		String str7 = "1+2+3+4+5";
		String[] str8=str7.split("\\+");//   \\+  ת�� +������治��һ��
		System.out.println(str8.length);
		for(String val: str8){
			System.out.println(val);
		}
		
	}
	public static void test3() throws UnsupportedEncodingException{//�ַ������ܽ���
		String str = "�й�";
		byte[] bytes = str.getBytes();//Ĭ��GBK
		@SuppressWarnings("unused")
		String gbkStr = new String(bytes,"GBK");
		//1.ͨ���ƶ����룬����ֽ�����
		byte[] utfbStr = str.getBytes("UTF-8");//����
		byte[] gbkbStr = str.getBytes("GBK");//����
		System.out.println(gbkbStr);
		System.out.println(utfbStr);
		
		//2��ͨ���ֽ�������ƶ�����ת���������
		String str2 = new String(utfbStr,"UTF-8");
		System.out.println(str2);
		//3.UTF���ַ��� ת����GBK ���ַ��� ������ʾ����
		@SuppressWarnings("unused")
		String utfStr = new String(bytes,"UTF-8");
		
		//��ʱ����
		//String utfStr = new String(bytes,);
		
		
		
	}
	public static void test2(){//��֤�ַ���ֻ�����ӹ���  (����ʱ����������throws �������ȥ��)
		String str = "1234567890";
//		System.out.println("�ַ������ȣ�"+str.length());
//		System.out.println(str.charAt(0));
		boolean yz = false;
		for(int i =0; i<str.length();i++){//public char charAt(int index)   ����ָ���������� char ֵ��������ΧΪ�� 0 �� length() - 1�����еĵ�һ�� char ֵλ������ 0 �����ڶ���λ������ 1 �����������ƣ������������������� 
			System.out.print(str.charAt(i)+"\t");	//�ֱ�ȡ�� str
			if(str.charAt(i)<'0'||str.charAt(i)>'9'){
				System.out.println("������󣬵ڣ�"+(i+1)+"λ�����");
				
				yz = true;
				break;
			}
		}
		if(yz){
			System.out.println("û��ͨ����֤��");
		}else{
			System.out.println("�����ַ�����ȷ��");
		}
	}
	public static void test1(){
		String str = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		String str4 = new  String("Hello");
		
		String he = "he";
		String str5 = he+"llo";
		String str6 = "He"+"llo";
		System.out.println(str=str2);//ture
		System.out.println(str3= str4);//false
		System.out.println(str==str3);//false
		System.out.println(str==str5);//false
		System.out.println(str3==str5);//false
		System.out.println(str==str6);//ture
		//�Ƚ�ֵ
		System.out.println(str3.equals(str5));//ture
		
	}

}
