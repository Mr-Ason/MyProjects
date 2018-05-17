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
//Ա��������
class StaffManagement{
		//���� ����
		private Staff[] staffs;
		  public StaffManagement(){
			//��������
			staffs  = new Staff[6];
			//���Ԫ��
			staffs[0] = new Staff("1001", "С��","1993-4-05" , "34552@qq.com", "����", 56.8);
			staffs[1] = new Staff("1002", "С��","1994-4-06" , "2442432@qq.com", "�Ϻ�", 58.8);
			staffs[2] = new Staff("1003", "С��","1993-5-03" , "44432@qq.com", "�Ͼ�", 53.8);
			staffs[3] = new Staff("1004", "С��","1993-4-08" , "545522@qq.com", "����", 55.8);
			staffs[4] = new Staff("1005", "Сߣ","1993-4-12" , "1432432@qq.com", "����", 76.8);
			staffs[5] = new Staff("1006", "С��","1993-4-14" , "742332@qq.com", "�Ķ�", 46.8);

			//����
			@SuppressWarnings("unused")
			String email = "34552@qq.com";
			if(email.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$")){
			     System.out.print("");//������ʽ
			}else{
				System.out.println("��ȷ�ʱ࣡");
			}
			//����
			@SuppressWarnings("unused")
			String name = "С��";
			if(name.matches("^[\\u4e00-\\u9fa5]+$")){
			     System.out.print("");//������ʽ
			}else{
				System.out.println("�����뺺��Ա��������");
			}
			//id
			@SuppressWarnings("unused")
			String id = "1001";
			if(id.matches("^([+-]?)\\d*\\.?\\d+$")){
			     System.out.print("");//������ʽ
			}else{
				System.out.print("������Ա��IDΪ0��9�����ӣ�");
			}
				
		  }
		  
		  
		public Staff[] getStaffs() {
			return staffs;
		}
		public void setStaffs(Staff[] staffs) {
			this.staffs = staffs;
		}
}
//Ա����
class Staff{
	private static final Staff[] Staffs = null;
	//����
	private String id;
	private String name;
	private String   birthday ;
	private String  email;
	private String  address;
	private double weight;
	
	//����
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
		return "Ա��[���:"+id+"\t����:"+name+"\t����:"+birthday+"\t����:"+email+"\tסַ:"+address+"\t����:"+weight+"]";
		
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













