package com.anhen.day3;
/*ѭ���ṹ������ִ��ѭ�������Ļ���
 *     while  do������while   for
 *     1��while���������ʽ��{
 *            ѭ������
 *     }
 *     2��do��������while
 *      do{
 *          ѭ����
 *          �������
 *      }while()
 * while �� do...while ������
 *     do������while ����ִ��һ��ѭ������
 *     while���������������ʽ��ִ��ѭ�������
 */
public class Textxunhuan {
	
	public static void main(String[] args){
		test4();
	}
	//3������ݳ���˵�����н��
	public static void test5(){
	int i =1,j =10; 
	do {
	   i = i + 1;
	   j = j - 1;
	   if (i < j) {
	   break;  //��ʾ����break�������ֹѭ��
	   }
	   } while (i <5); 
	   System.out.println("i = " +i+ "and j = "+j); 
	}
	//1������һ������int a = 32932792;��ѱ���a��������ĵĴ�д����
	public static void test4(){
		int a = 1234567890;
		//��ȡ����λ������
		//ת��
		int num = 0;
		String str="";
		while(a>0){
			num = a%10;//û��ȡ���һλ
			a /= 10;
			System.out.println(num);
			String strNum ="";
			switch(num){
			case 0:
				strNum = "��";
				break;
			case 1:
				strNum = "һ";
				break;
			case 2:
				strNum = "��";
				break;
			case 3:
				strNum = "��";
				break;
			case 4:
				strNum = "��";
				break;
			case 5:
				strNum = "��";
				break;
			case 6:
				strNum = "��";
				break;
			case 7:
				strNum = "��";
				break;
				
			case 8:
				strNum = "��";
				break;
			case 9:
				strNum = "��";
				break;
			}
			str = strNum + str;
		}
		System.out.println(str);
	}
	//1~1000����֮��
    public static void test3(){
    	int i = 1;
    	int sum = 0;
    	do {
    		if(i%2!=0){
    			sum +=i;
    		}
    		i++;
    	}while(i<1001);
    		System.out.println("����֮�� :"+sum);
    		
    }
	//1~1000ż��֮��
	public static void test2(){
		int i = 1;
		int sum = 0;
		while(i<=1000){
			if(i%2==0){
				sum += i;
			}
			i++;
		}
		System.out.println("ż��֮�� ��"+sum);
	}
    public static void test1(){
    	//1~1000�ĺ�
    	int i = 1;//��ʼֵ
    	int sum=0;
    	while(i<1001){
    		sum += i;//���
    		i++;//����
    	}
    	System.out.println("��Ϊ"+sum);
    }
}
