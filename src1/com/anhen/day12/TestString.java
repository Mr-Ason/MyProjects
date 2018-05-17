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
	public static void test4(){//字符串的常规使用
		//截取字符串
		String str = "sdfdsgfga ds f";
		System.out.println(str.length());
		String str2 = str.substring(4);//不包含起始位置
		System.out.println("截取后的新字符："+str2);
		System.out.println("原："+str);
		
		String str3=str.substring(4, 5);
		System.out.println("起始截取："+str3);
		
		//替换字符串
		String str4 = str.replace("a", "A");
		System.out.println("替换后的："+str4);
		String str5 = str.replaceAll("a", "A");
		System.out.println("全部替换后的："+str5);
		
		//正则表达式
		
		String str6 = str.replaceAll("[a-d]", "中");//a到d中的字母都替换
		System.out.println("abc".matches("[a-z]*"));//abc  是否在[a-z]范围内
		System.out.println(str6);
		//字符串分组
		String str7 = "1+2+3+4+5";
		String[] str8=str7.split("\\+");//   \\+  转码 +在最后面不算一个
		System.out.println(str8.length);
		for(String val: str8){
			System.out.println(val);
		}
		
	}
	public static void test3() throws UnsupportedEncodingException{//字符串加密解密
		String str = "中国";
		byte[] bytes = str.getBytes();//默认GBK
		@SuppressWarnings("unused")
		String gbkStr = new String(bytes,"GBK");
		//1.通过制定编码，获得字节数组
		byte[] utfbStr = str.getBytes("UTF-8");//加密
		byte[] gbkbStr = str.getBytes("GBK");//加密
		System.out.println(gbkbStr);
		System.out.println(utfbStr);
		
		//2、通过字节数组和制定编码转码成新数组
		String str2 = new String(utfbStr,"UTF-8");
		System.out.println(str2);
		//3.UTF的字符串 转换成GBK 的字符串 正常显示中午
		@SuppressWarnings("unused")
		String utfStr = new String(bytes,"UTF-8");
		
		//有时必须
		//String utfStr = new String(bytes,);
		
		
		
	}
	public static void test2(){//验证字符串只由数子构成  (运行时把主函数中throws 及后面的去掉)
		String str = "1234567890";
//		System.out.println("字符串长度："+str.length());
//		System.out.println(str.charAt(0));
		boolean yz = false;
		for(int i =0; i<str.length();i++){//public char charAt(int index)   返回指定索引处的 char 值。索引范围为从 0 到 length() - 1。序列的第一个 char 值位于索引 0 处，第二个位于索引 1 处，依此类推，这类似于数组索引。 
			System.out.print(str.charAt(i)+"\t");	//分别取出 str
			if(str.charAt(i)<'0'||str.charAt(i)>'9'){
				System.out.println("输入错误，第："+(i+1)+"位输入错！");
				
				yz = true;
				break;
			}
		}
		if(yz){
			System.out.println("没有通过验证！");
		}else{
			System.out.println("输入字符串正确！");
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
		//比较值
		System.out.println(str3.equals(str5));//ture
		
	}

}
