package com.anhen.day7;
//����ֵ����
public class TestGift {
	public static void main(String[] args){
		//ʵ��������
		Gift gift= new Gift();
		//���ʶ�������
		gift.name = "����";
		gift.prices = 9854;
		//���÷���
		gift.showInfos();
		
		//ʵ��������
				Gift gift2 = new Gift();
				//���ʶ�������
				gift2.name = "�ٺ�";
				gift2.prices = 985;
				//���÷���
				gift.showInfos();
				
				//ֵ���� ֵ����ı�
				int nums = 10;
				gift.showNums(nums);//nums=100
				System.out.println(nums);//nums=10
				
				//����ֵ����  ���� ���� �����ֵ���Է����ı�
				int[] array = {1,2,3};
				gift.showNumsArray(array);//���ݵĵ�ַ�ռ� �����е���ָ�������ԭ����ָ��1
				System.out.println(array[0]);
	}

}

class Gift{//һ���ļ�����ֻ����һ�� public����
	public String name;//����
	public double prices;//�۸�
	
	public void showInfos(){//����
		System.out.println("��������ƣ�"+this.name+",����ļ۸�:"+this.prices);
		
	}
	
	public void showNums(int nums){
		nums = 100;
		System.out.println("����ĸ�����"+nums);
	}
	public void showNumsArray(int[] array){
		array[0] = 1000;//��ָ��ֵ ������ԭ����1
		System.out.println(array[0]);
		array = null;//����˷����е�array ��Ӱ����ô�
	}
}

