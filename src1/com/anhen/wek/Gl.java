package com.anhen.wek;

import java.sql.Date;
import java.util.ArrayList;

public class Gl {
	public static void main(String[] args){
		StaffManagement sf = new StaffManagement();
		Staff[] staffs =  sf.getStaffs();
		for(Staff staff: staffs){
			System.out.println(staff);
			
		}
	}

}
//员工管理类
class StaffManagement{
		//属性 集合
		private Staff[] staffs;
		  public StaffManagement(){
			//创建集合
			staffs  = new Staff[6];
			//添加元素
			staffs[0] = new Staff("1001", "小李","1993-4-05" , "34552@qq.com", "北京", 56.8);
			staffs[1] = new Staff("1002", "小王","1994-4-06" , "2442432@qq.com", "上海", 58.8);
			staffs[2] = new Staff("1003", "小刘","1993-5-03" , "44432@qq.com", "南京", 53.8);
			staffs[3] = new Staff("1004", "小张","1993-4-08" , "545522@qq.com", "北极", 55.8);
			staffs[4] = new Staff("1005", "小撸","1993-4-12" , "1432432@qq.com", "冰岛", 76.8);
			staffs[5] = new Staff("1006", "小杜","1993-4-14" , "742332@qq.com", "哪儿", 46.8);

			//邮箱
			@SuppressWarnings("unused")
			String email = "34552@qq.com";
			if(email.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$")){
			     System.out.print("");//正则表达式
			}else{
				System.out.println("正确邮编！");
			}
			//姓名
			@SuppressWarnings("unused")
			String name = "小李";
			if(name.matches("^[\\u4e00-\\u9fa5]+$")){
			     System.out.print("");//正则表达式
			}else{
				System.out.println("请输入汉字员工姓名！");
			}
			//id
			@SuppressWarnings("unused")
			String id = "1001";
			if(id.matches("^([+-]?)\\d*\\.?\\d+$")){
			     System.out.print("");//正则表达式
			}else{
				System.out.print("请输入员工ID为0到9的数子！");
			}
				
		  }
		  
		  
		public Staff[] getStaffs() {
			return staffs;
		}
		public void setStaffs(Staff[] staffs) {
			this.staffs = staffs;
		}
}
//员工类
class Staff{
	private static final Staff[] Staffs = null;
	//属性
	private String id;
	private String name;
	private String   birthday ;
	private String  email;
	private String  address;
	private double weight;
	
	//方法
	public Staff(){
		
	}
	
	public Staff[] getStaffs() {
		
		return Staffs;
	}

	public Staff(String id,String name,String birthday, String email, String address, double weight){
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.email = email;
		this.address = address;
		this.weight = weight;
	}
	@Override
	public String toString(){
		return "员工[编号:"+id+"\t姓名:"+name+"\t生日:"+birthday+"\t邮箱:"+email+"\t住址:"+address+"\t体重:"+weight+"]";
		
	}
	public String getId() {
		
		return id;
	}
	public void setId(String id) {
	
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}













