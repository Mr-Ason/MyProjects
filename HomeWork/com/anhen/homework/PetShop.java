package com.anhen.homework;

public class PetShop {
	private Pet[] pets;  //保存多个属性
	private int foot;     //存储的位置
	
	public PetShop(int len){  //构造方法开辟宠物数组的大小
		if(len>0){
			this.pets = new Pet[len];  //为对象数组开辟空间
		}else{
			this.pets = new Pet[1];  //至少开辟一个空间
		}
	}
	public boolean add(Pet pet){    //增加宠物
		if(this.foot<this.pets.length){ //判断宠物商店里的宠物是否已满
			this.pets[this.foot] = pet;  //增加宠物
			this.foot++;     //修改保存位置
			return true;    //增加成功
		}else{
			return false;   //增加失败
		}
	}
	public Pet[] search(String keyWord){  //关键字查找
		Pet p[] = null; //此为查找之后的结果  大小不是固定的
		int count  = 0; //记录多少个宠物符合条件
		//确认开辟的空间大小 看有多少个宠物符合查询条件
		for(int i = 0 ; i<pets.length;i++){
			if(this.pets[i] !=null){
				if(this.pets[i].getName().indexOf(keyWord)!=-1|| this.pets[i].getColor().indexOf(keyWord)!=-1){
					count++;  //统计符合条件的个数
				}
			}
		}
		p = new Pet[count];
		int f = 0; //设置增加的标志
		for(int i = 0; i<this.pets.length;i++){
			if(this.pets[i]!=null){
				if(this.pets[i].getName().indexOf(keyWord)!=-1|| this.pets[i].getColor().indexOf(keyWord)!=-1){
					p[f] = this.pets[i];//将符合查询条件的宠物信息保存
					f++;
				}
			}
		}
		return p;
		
	}

}
