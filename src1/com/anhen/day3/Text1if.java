package com.anhen.day3;
/*��֧�ṹ��ͨ�������жϣ�ѡ��ִ�л�·���Ľṹ��
 * if  switch
 *  1�� if �﷨
 *      if���������ʽ��{
 *             ����飺//ֻ���������ʽ���Ϊtrueʱ��ִ�д����
 *      
 *      }
 *      if....else�﷨��
 *          if���������ʽ��{
 *             ����飺//ֻ���������ʽ���Ϊtrueʱ��ִ�д����
 *      }else{
 *          ����飺//ֻ���������ʽΪfalseʱִ��
 *      
 *      }
 *      if ...else if 
 *      if���������ʽ��{
 *             ����飺//ֻ���������ʽ���Ϊtrueʱ��ִ�д����
 *      }else   if(�������ʽ){   
 *          ����飺ǰ����ʽΪfalseʱ�����ҵ�ǰ�������ʽΪtrue����ִ��
 *      
 *      }
 *      
 *      
 */
public class Text1if {
	public static void main(String[] args){
		System.out.println("�����²�����");
		boolean bl = false;
		int num = 100 ;
		if(bl){
		   System.out.println("������!");
		   if(num >= 100){
			   System.out.println("num>100");
		   }
		}else{
			 System.out.println("û������!");
		}
		if(num>100){
			System.out.println("num����10");		
			}else if(num>20){
				System.out.println("num����20");
			}else if(num>20){
				System.out.println("num����30");
			}else if(num>20){
				System.out.println("numС��10");
			}
		/*ѧ���ȼ��ж�  0~100�ķ���
		 *                90~100  A
		 *                60~90    B
		 *                0~60     C 
		 */
	}
	
  
}
