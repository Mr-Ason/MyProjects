package com.anhen.day3;
/*switch f��֧���ʺ��ڷ�֧�϶�����
 * �﷨��
 *       switch(���ʽ){
 *           case ƥ��ֵ:
 *                         �����
 *                         break;//��ֹswitch
 *            case ƥ��ֵ:
 *                         �����
 *                         break;//��ֹswitch
 *                         .
 *                         .
 *                         .
 *           default��
 *                     ����飺����ƥ��ʱ��              
 *       
 *       ע�����
 *       1��ֻ������break�Ż���ֹswitch;
 *       2�����ʽ���������ͣ� byte  short int char String��1.7֮��֧�֣�
 *       3����ƥ��ֵ�ͱ��ʽ��ֵ����һ��
 *       }
 */
public class Text2Switch {
	public static void main(String[] args){
		char degreen = 'A';//�ı�ֵ�õ���Ӧ��
		switch(degreen){
		case 'A':
			   System.out.println("�ȼ�ΪA");
			   break;
	//		   System.out.println("�ȼ�ΪA");//��Ч����
		case 'B':
			   System.out.println("�ȼ�ΪB");
			   break;
		case 'C':
			   System.out.println("�ȼ�ΪC");
			   break;
		case 'D':
			   System.out.println("�ȼ�ΪD");
			   break;
		case 'E':
		case 'F':
		       System.out.println("������");//E��Fͨ�� ������
		default:
			System.out.println("û���ҵ���Ӧ�ȼ�");
		}
		
		
	}

}
