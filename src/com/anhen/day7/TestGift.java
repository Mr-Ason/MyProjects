package com.anhen.day7;
//引用值传递
public class TestGift {
	public static void main(String[] args){
		//实例化对象
		Gift gift= new Gift();
		//访问对象属性
		gift.name = "宝马";
		gift.prices = 9854;
		//调用方法
		gift.showInfos();
		
		//实例化对象
				Gift gift2 = new Gift();
				//访问对象属性
				gift2.name = "百合";
				gift2.prices = 985;
				//调用方法
				gift.showInfos();
				
				//值传递 值不会改变
				int nums = 10;
				gift.showNums(nums);//nums=100
				System.out.println(nums);//nums=10
				
				//引用值传递  对象 数组 对象的值可以发生改变
				int[] array = {1,2,3};
				gift.showNumsArray(array);//传递的地址空间 方法中的新指向代替了原来的指向1
				System.out.println(array[0]);
	}

}

class Gift{//一个文件里面只能有一个 public修饰
	public String name;//名称
	public double prices;//价格
	
	public void showInfos(){//介绍
		System.out.println("礼物的名称："+this.name+",礼物的价格:"+this.prices);
		
	}
	
	public void showNums(int nums){
		nums = 100;
		System.out.println("礼物的个数："+nums);
	}
	public void showNumsArray(int[] array){
		array[0] = 1000;//新指向值 代替了原来的1
		System.out.println(array[0]);
		array = null;//清空了方法中的array 不影响调用处
	}
}

