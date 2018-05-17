package com.anhen.day6;

public class TestGift {
	public static void main(String[] args){
		//实例对象
		Gifts gift = new Gifts();
		//访问属性
		gift.name = "baoma";
		gift.prices = 999.01;
		//调用方法
		gift.showIfos();
		Gifts gift2 = new Gifts();
		gift2.name = "bb";
		gift2.prices=99;
		gift2.showIfos();
		//值传递 值不会改变
		int nums = 10;
		gift2.showNums(nums);
		//引用值传递 对象数组 对象的值可以发生改变
		int[] array = {1,2,3};
		gift2.showNumsArray(array);
	}

}

class Gifts  {
	//属性
	public String name;//名称
	public double prices;//价格
	
	public void showIfos(){
		System.out.println("礼物名："+this.name+"jiage:"+prices);
	}
	public void showNums(int nums){//传递函数
		System.out.println("礼物个数："+nums);
	}
	public void showNumsArray(int array[]){
		 array[0] =55;
		 System.out.println(array[0]);
			array = null;
	}
}

