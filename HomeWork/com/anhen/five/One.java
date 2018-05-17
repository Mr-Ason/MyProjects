package com.anhen.five;

public class One {
	public static void main(String[] args){
		Address address = new Address("中国","四川省","成都市","银沙正街",100200);
		//address.toString();
		address.showInfo();
		
		
	}

}
//Address 类
class Address{
	private String country;
	private String province;
	private String city;
	private String  street;
	private int email;
	
	public Address(){}//无参构造
	public Address(String country,String province,String city,String street,int email){//有参构造
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	
	public String toString(){
		return "国家:"+this.country+";省份:"+this.province+";城市:"+this.city+";街道:"+this.email;
		
	}
	public void showInfo(){
		System.out.println(this.toString());
	}
}
