package com.anhen.day9;

public class Company {
	public static void main(String [] args){
		//����  ��н
		SalariedEmployee sm = new SalariedEmployee();
		sm.setName();
		sm.getBirthday(4);
		sm.getSalary(8500);
		sm.run();
		System.out.println("������"+sm.getName("С��")+"\t���գ�"+sm.getBirthday(4)+"\t���ʣ�"+sm.getSalary(8500));
	}

}
class Employee{//����
	//����
	public String name;
	public int birthday;
	public double sum;
	//�޲ι��췽��
	public Employee(){
		System.out.println("nihao!");
	}
	public  Employee(String name){//�в�
		this.name = name;
	}
	public Employee(String name,int birthday){
		 this.name = name;
		 this.birthday = birthday;
	}
	//set  get
	
	public void setName() {
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(String name) {
		return name;
	}
	public int getBirthday(int birthday) {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}	
	//����
	public double run(int birthday){
	   if(birthday==7){
		this.sum = sum+100;
	  }
	return sum;
	}
	public void show(){
		System.out.println(sum);
	}
}
//����
class SalesEmployee extends Employee{//���� ������Ա
	//����
	private double salemonth;
	private double royaltyrate;
	//�޲ι��췽��
	public SalesEmployee(){
		
	}
	public SalesEmployee(double salemonth){
		this.salemonth = salemonth;
	}
    public SalesEmployee(double salemonth,double royaltyrate){
		this.salemonth = salemonth;
		this.royaltyrate = royaltyrate;
	}
	//set get
	public double getSalemonth() {
		return salemonth;
	}
	public void setSalemonth(double salemonth) {
		this.salemonth = salemonth;
	}
	public double getRoyaltyrate() {
		return royaltyrate;
	}
	public void setRoyaltyrate(double royaltyrate) {
		this.royaltyrate = royaltyrate;
	}
    //����
	public double run(){
		super.sum = this.getSalemonth()*this.getRoyaltyrate();
		super.run(this.getBirthday( 4));
		return super.sum;
	}
	
	
}
class BasedPlusSalesEmployee extends SalesEmployee{
	//����   ��н
	private double basepay;
	//�޲�
	public BasedPlusSalesEmployee(){
		
	}
	//����
     public BasedPlusSalesEmployee(double basepay){
		this.basepay = basepay;
	}
     //set  get
     public void setBasepay(double basepay){
    	 this.basepay = basepay;
     }
     public double getBasepay(double basepay){
    	 return  this.basepay;
     }
}
class SalariedEmployee extends Employee{//���� ��н
	//����
	private double salary;
	public SalariedEmployee(){//�޲�
		this.salary=8500;
	}
	//set get
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(double salary){
		return this.salary;
	}
	//����
	public double run(){//���ڴ�ӡ��Ϣ
		super.sum = this.salary;
		super.run(this.getBirthday(4));
		return super.sum;
	}
	
	
}	
class HourlyEmployee extends Employee{//���� �� Сʱ��
	//����
	private String hrmoney;
	private double monthr;
	public String getHrmoney() {
		return hrmoney;
	}
	public void setHrmoney(String hrmoney) {
		this.hrmoney = hrmoney;
	}
	public double getMonthr() {
		return monthr;
	}
	public void setMonthr(double monthr) {
		this.monthr = monthr;
	}
	//public 
}		



















