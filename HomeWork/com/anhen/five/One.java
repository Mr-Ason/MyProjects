package com.anhen.five;

public class One {
	public static void main(String[] args){
		Address address = new Address("�й�","�Ĵ�ʡ","�ɶ���","��ɳ����",100200);
		//address.toString();
		address.showInfo();
		
		
	}

}
//Address ��
class Address{
	private String country;
	private String province;
	private String city;
	private String  street;
	private int email;
	
	public Address(){}//�޲ι���
	public Address(String country,String province,String city,String street,int email){//�вι���
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
		return "����:"+this.country+";ʡ��:"+this.province+";����:"+this.city+";�ֵ�:"+this.email;
		
	}
	public void showInfo(){
		System.out.println(this.toString());
	}
}
