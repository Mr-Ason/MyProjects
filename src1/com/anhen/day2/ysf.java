package com.anhen.day2;
/*�����
 * ͨ����������Ĳ����ĸ������֣�
 *       һԪ�����  ��Ԫ�����  ��Ԫ�����
 * ���ݹ��ܻ���
 *   1�����������      
 *        +  -
 *        ++     ++num(����ǰ��1)  num++(�����+1)
 *         ����     ����num               num����                        
 *        + - * / % 
 *   2����ϵ��������Ƚ�����ֵ�Ĵ�С��ϵ ���� ������
 *      >  >=  <  <=   ==   ��=
 *        
 *    3���߼������  �� &&  ||
 *        �� �߼�ȡ��
 *        && ȫ��Ϊ��  һ��Ϊ��
 *        ||  ȫ��Ϊ��    
 *    4��λ���� 
 *       ~ ȡ��  0��1  1��0
 *       &  ȫ1 Ϊ1 �����Բ����߼����㣬û�ж�·����
 *       |  ȫ 0 Ϊ 0  �����Բ����߼����㣬û�ж�·����
 *       ^  ���
 *       <<    ����
 *       >>    ����
 *       
 *       5����ֵ����
 *          
 */
public class ysf {
	public static void main(String[] args){
		//1\���� �Լ�
		int num = 10;
		++num;  
		System.out.println(++num);
		num=10;
		System.out.println(num++);
		//�������� + - * / %
		int num2 = 100;
		double num3 = 200;
		System.out.println(num2 + num3);//�򾫶ȴ��Ĭ��ת��
		System.out.println(num2/3);//ֱ��ȥ��С��
		//ȡ��
		System.out.println(num2 % 3);//ȡ��Ϊ1
		
		
		//3����ϵ�����
		System.out.println(num2>num3);
		System.out.println(num2==num3);//�жϵ�ַ
		
		String str3 ="�ַ���2";
		String str4 ="�ַ���2";
		System.out.println(str3==str4);//ָ��ͬһ��ַ����һ�� �ַ���2��
		
		
		//4���߼������
		System.out.println(!(num2>num3));//ȡ��
		System.out.println(true&&false);
		boolean bl = (num2>num3)&&(num2++==100);//��·����
		
		System.out.println(num2);
		
		boolean bl2 = (num2>num3)||(num2++==100);//��·��
		System.out.println(num2);
		
		//5��λ����
		bl = (100==100)&(num2>num3)&(num2++==100);
		
		
		//��ֵ����
		num2 =100;
		num2 +=10;//num2=num2+10
		
		num2 /=5;//num2=
		
		
	}
}
