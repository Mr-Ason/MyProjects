package com.anhen.day4;
/*�����������
 *   break continue return
 *   1 ��break������ֹswitch ��֧��ѭ���ṹ
 *   2��continue ������ǰѭ����������һ��ѭ��
 *   3��return �����������Ӷ�Ӱ�췽���еĴ��룬����ѭ�� 
 * 
 * 
 */
public class TestKkongzhiliucheng {
  public static void main(String[] args){
	  //100~999Ѱ��ˮ�ɻ������ҵ�һ������
	   for(int i = 100;i<1000;i++){
		   int ge = i%10;
		   int shi = 1/10%10;
		   int bai = i/100;
		   
		   if(ge*ge*ge*+shi*shi*shi*+bai*bai*bai==i){
			   System.out.println("ˮ�ɻ����� "+i);
			   break;
		   }
	   }
	   //1~1000�ĺͣ�����������10�� ����
	  /* int sum = 0;
	   for(int i=0;i<=1000;i++){
		   if(i%10==0){
			   System.out.println("�����ˣ�"+i);
			   continue;
		   }
		   sum+=i;//continue�����������ִ��
	   }
	   System.out.println("he :"+sum);*/
  } 
}
