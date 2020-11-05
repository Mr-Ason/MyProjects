package com.anhen.five;

import java.util.Observable;
import java.util.Observer;
//�^����ģʽ
public class Seven {
	public static void main(String[] args){
		House house = null;
		house = new House(1000000);
		double h1 = house.getPrice();
		HousObservs hs1 = new HousObservs("С��");
		HousObservs hs2 = new HousObservs("С��");
		HousObservs hs3 = new HousObservs("С�w");
		HousObservs hs4 = new HousObservs("С�X");
		//�����^����
		house.addObserver(hs1);
		house.addObserver(hs2);
		house.addObserver(hs3);
		house.addObserver(hs4);
		System.out.println(house);
		
		house.setPrice(2000000);
		double h2 = house.getPrice();
		System.out.println("���r�ϝq��:"+(h2-h1));
		System.out.println(house);
	}

}

//���x���^����
class House extends Observable{
	private double price;
	public House(double price){
		this.price = price;
	}
	
	public void  setPrice(double price){
		super.setChanged();//�O��׃���c
		super.notifyObservers(price);//֪ͨ�����^���߃r��׃��
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	//�،�toString
	public String toString(){
		return "��ǰ���Ӄr��飺"+this.price;
	}
}

//���x�^����
class HousObservs implements Observer{
	private String name;
	public HousObservs(String name){
		this.name = name;
	}

	//��һ��������ʾ���^���ߌ������ڶ���������ʾ׃�Ӆ���
	@Override
	public void update(Observable observable, Object object) {
		// TODO Auto-generated method stub
		if(object instanceof Double){
			System.out.println(this.name+"�^�쵽�ăr���:"+object);
		}
		
	}
	
}