package com.anhen.day2;
/*�������ͣ��޶��������Դ�ŵ�ֵ��ֵ���������͡���Χ
 * �������͵ķ��ࣺ1�������������� 2��Ӧ����������
 *  1.�����������ͣ�����  ������  ������ �ַ���
 *    ��1�����Σ�����������������1�ֽ� = 8λ�������ƣ�
 *              byte     1�ֽ�
 *              short    2�ֽ�
 *              int (Ĭ������)       4�ֽ�
 *              long     8�ֽ�
 *    ��2�������ͣ�С����������������
 *               float     4 �ֽ�     ������
 *               double  8 �ֽ�     ˫����(Ĭ�ϵ�)
 *    ��3�������ͣ��߼�ֵ  ֻ�� true �� false  
 *    ��4���ַ��ͣ�����ַ������Դ�����Ļ������ַ�         
 *               char   2�ֽ�    0--6��
 *      byte short int(char) long float double
 *      ����Сת�� Ĭ��ת�� û�о��ȶ�ʧ
 *      ���ȴ�תС ��Ҫǿ��ת�� �о��ȶ�ʧ
 *  
 *  
 */
public class sjlx {
	
	//�������α�������
	byte mybyte = -128;
	short myshort = 32767;
	int myint = 200000;
	long mylong=20000000000l;
	
	
	//���帡����
	float myFloat = 222222.333343F;
	double myDouble = 222222342.324343243;
	
	
	//�����߼���
	boolean myBoolean = true;
	
	//�����ַ���
	public static void main(String[] args){
	char myChar ='A';
	myChar = 64;//���Ϊ@ 65���ΪA
	System.out.println(myChar);
	
	//�������͵�ת��
	int x=100;
	x= 200;
	x=300;
	
	//short=y;
	//y=100
	//y=2 00;
	//y=300;
	short y =(short)x;
	System.out.println(y);
	
	
	
	//Сת�� Ĭ��ת��
	byte oByte = 100;
	int oInt = oByte; 
	long oLong = oInt;
	System.out.println(oLong);
	
	//��תС ǿ��ת�� ���ȶ�ʧ
	oLong = 1000000000L;
	oInt  = (int)oLong;
	System.out.println(oInt);
	
	
	}
}
