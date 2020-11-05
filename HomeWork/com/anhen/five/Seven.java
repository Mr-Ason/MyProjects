package com.anhen.five;

import java.util.Observable;
import java.util.Observer;
//觀察者模式
public class Seven {
	public static void main(String[] args){
		House house = null;
		house = new House(1000000);
		double h1 = house.getPrice();
		HousObservs hs1 = new HousObservs("小李");
		HousObservs hs2 = new HousObservs("小劉");
		HousObservs hs3 = new HousObservs("小趙");
		HousObservs hs4 = new HousObservs("小錢");
		//加入觀察者
		house.addObserver(hs1);
		house.addObserver(hs2);
		house.addObserver(hs3);
		house.addObserver(hs4);
		System.out.println(house);
		
		house.setPrice(2000000);
		double h2 = house.getPrice();
		System.out.println("房價上漲了:"+(h2-h1));
		System.out.println(house);
	}

}

//定義可觀察事務
class House extends Observable{
	private double price;
	public House(double price){
		this.price = price;
	}
	
	public void  setPrice(double price){
		super.setChanged();//設置變化點
		super.notifyObservers(price);//通知所有觀察者價格變動
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	//重寫toString
	public String toString(){
		return "當前房子價格為："+this.price;
	}
}

//定義觀察者
class HousObservs implements Observer{
	private String name;
	public HousObservs(String name){
		this.name = name;
	}

	//第一個參數表示被觀察者實例，第二個參數表示變動參數
	@Override
	public void update(Observable observable, Object object) {
		// TODO Auto-generated method stub
		if(object instanceof Double){
			System.out.println(this.name+"觀察到的價格為:"+object);
		}
		
	}
	
}