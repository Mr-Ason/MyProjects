package com.anhen.day9;

public class Company {
	public static void main(String [] args){
		//子类  月薪
		SalariedEmployee sm = new SalariedEmployee();
		sm.setName();
		sm.getBirthday(4);
		sm.getSalary(8500);
		sm.run();
		System.out.println("姓名："+sm.getName("小李")+"\t生日："+sm.getBirthday(4)+"\t工资："+sm.getSalary(8500));
	}

}
class Employee{//父类
	//属性
	public String name;
	public int birthday;
	public double sum;
	//无参构造方法
	public Employee(){
		System.out.println("nihao!");
	}
	public  Employee(String name){//有参
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
	//方法
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
//子类
class SalesEmployee extends Employee{//子类 销售人员
	//属性
	private double salemonth;
	private double royaltyrate;
	//无参构造方法
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
    //方法
	public double run(){
		super.sum = this.getSalemonth()*this.getRoyaltyrate();
		super.run(this.getBirthday( 4));
		return super.sum;
	}
	
	
}
class BasedPlusSalesEmployee extends SalesEmployee{
	//属性   月薪
	private double basepay;
	//无参
	public BasedPlusSalesEmployee(){
		
	}
	//带参
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
class SalariedEmployee extends Employee{//子类 月薪
	//属性
	private double salary;
	public SalariedEmployee(){//无参
		this.salary=8500;
	}
	//set get
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(double salary){
		return this.salary;
	}
	//方法
	public double run(){//用于打印信息
		super.sum = this.salary;
		super.run(this.getBirthday(4));
		return super.sum;
	}
	
	
}	
class HourlyEmployee extends Employee{//孙子 类 小时工
	//属性
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



















