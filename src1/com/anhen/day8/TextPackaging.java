package com.anhen.day8;
/*��ķ�װ��
 *    ����Ȩ�����η���
 *       public        ��ǰ��   ��ǰ��   ����   ������
 *       protected    ��ǰ��   ��ǰ��  ����
 *       default       ��ǰ��   ��ǰ��   
 *       private       ��ǰ��   
 */
public class TextPackaging {
	
	public static void main(String[] args){
		//����Text1
		Text text = new Text();
		text.setAge(13);
		
	}
}
class Text{
	//����
	public String name;
	private int  age;
	private char  sex;
	
	//����
	public void setAge(int age){
		if(age<0||age>110){
		    System.out.println("����������������ȷ���䣡");
			return;
		}else{
			this.age=age;
		  }
	}
	
		
	}



