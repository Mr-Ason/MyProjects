package com.anhen.day6;

public class TestGift {
	public static void main(String[] args){
		//ʵ������
		Gifts gift = new Gifts();
		//��������
		gift.name = "baoma";
		gift.prices = 999.01;
		//���÷���
		gift.showIfos();
		Gifts gift2 = new Gifts();
		gift2.name = "bb";
		gift2.prices=99;
		gift2.showIfos();
		//ֵ���� ֵ����ı�
		int nums = 10;
		gift2.showNums(nums);
		//����ֵ���� �������� �����ֵ���Է����ı�
		int[] array = {1,2,3};
		gift2.showNumsArray(array);
	}

}

class Gifts  {
	//����
	public String name;//����
	public double prices;//�۸�
	
	public void showIfos(){
		System.out.println("��������"+this.name+"jiage:"+prices);
	}
	public void showNums(int nums){//���ݺ���
		System.out.println("���������"+nums);
	}
	public void showNumsArray(int array[]){
		 array[0] =55;
		 System.out.println(array[0]);
			array = null;
	}
}

