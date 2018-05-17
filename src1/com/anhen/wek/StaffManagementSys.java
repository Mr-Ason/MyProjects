package com.anhen.wek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StaffManagementSys {
	
	public static <BirthdayCollection, BirthdayComparator> void main(String []args){
		StaffManagements sm = new StaffManagements();
		String path = "D:\\6.txt";
		//序列化
		sm.TestObjectOutputStream(path);
		//反序列化
		sm.TestObjectOutputStream(path);
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("员工管理表");
		//Staffs sf = new Staffs();
	    List<Staffs> sf = new ArrayList<Staffs>();
		//sf.show();
		
		
		ArrayList  al=new ArrayList();
		al.add(sm.add("1001", "小王", "1993-10-23", "23454@qq.com", "哪儿", "50.6"));
		al.add(sm.add("1002", "小柳", "1992-04-07", "sfgs23@qq.com", "表里", "67.3"));
		System.out.println("按键  :  1.添加员工  2.删除员工 3.修改员工 4.查找员工");
	    //按生日排序
	    al.sort(new Birthday());
	    
		Iterator it = al.iterator();
		   while(it.hasNext()){
			   System.out.println(it.next());//显示集合
		   }
		int x = sc.nextInt();
		
	    switch(x){
	    case 1:
	    	System.out.println("添加员工：");
	    	System.out.println("请输入id");
	    	String id = sc.next();
	    	if(id.matches("^([+-]?)\\d*\\.?\\d+$")){
	    		System.out.println("");
	    	}else{
	    		System.out.println("输入邮编格式不正确！请重新输入！");
	    	}
	    	System.out. println("请输入姓名");
	    	String name = sc.next();
	    	if(name.matches("^[\u4e00-\u9fa5]+$")){
	    		System.out.println("");
	    	}else{
	    		System.out.println("请输入中文名！");
	    		return ;
	    	}
	    	
	        System.out.println("请输入生日：");
	        String birthday = sc.next();
	        if(birthday.matches("^\\d{4}(\\-|\\/|\\.)\\d{1,2}\\1\\d{1,2}$")){
	        	System.out.println("");
	        }else{
	        	System.out.println("请输入正确的日期格式！");
	        }
	        System.out.println("请输入邮箱：");
	        String email = sc.next();
	        if(email.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$")){
	        	System.out.println("");
	        }else{
	        	System.out.println("请输入正确的邮编格式！");
	        }
	        System.out.println("请输入住址：");
	        String address = sc.next();
	        System.out.println("请输入体重：");
	        String weight = sc.next();
	      al.add(sm.add(id, name, birthday, email, address, weight));
	      Staffs staffs= new Staffs(id, name, birthday, email, address, weight);
	   Iterator it1 = al.iterator();
	   while(it1.hasNext()){
		   System.out.println(it1.next());
	   }
	    break;
	    case 2:
	    System.out.println("删除员工信息：");
	    System.out.println("5.确定  6.取消");
	       if(x==5){
	    	   ((Iterator<String>) sm).remove();
	       }else if(x==6){
	    	   return;
	       }
	    break;
	    case 3:
	    	System.out.println("修改员工：");
	    	System.out.println("请输入你要修改项的id:");
	    	String id1 =sc.next();
	    	System.out.println("请输入你要修改项的哪一项:");
	    	String str =sc.next();
	    	System.out.println("请输入你修改后的内容:");
	    	String str2 =sc.next();
	        sm.set(al, id1, str, str2);
	    	break;
	    case 4:
	    	System.out.println("查找员工：");
	    	System.out.println("请输入员工编号：");
	    	al.get(sc.nextInt());
	    	break;
	    default:
	    	
	    	System.out.println("输入不正确！");
	    }

	}
	private static void TestObjectOutputStream(String path) {
		// TODO Auto-generated method stub
		
	}
}

//生日比较器
class Birthday implements Comparator<Staffs>{

		@Override
		public int compare(Staffs o1, Staffs o2) {
			// TODO Auto-generated method stub
			return o1.getBirthday().compareTo(o2.getBirthday());
	}
}
//员工管理类
class StaffManagements{
	//private static final ObjectOutputStream Staffs = null;
	//创建集合
	ArrayList al ;
	public void add(){
		al= new ArrayList();
	}
	public Staffs add(String id,String name,String birthday,String email,String address,String weight){
		Staffs s = new Staffs(id,name,birthday,email,address,weight);
		return s;
	}
	//反序列化
	public static void TestObjectInputStream(String path) throws ClassNotFoundException{
		
		try (//1.字节流
			InputStream input = new FileInputStream(path);
			//2.反对象序列化流
			ObjectInputStream ois = new ObjectInputStream(input);){
			//3.反序列化 List<Staffs>
			List<Staffs> staffs = (ArrayList<Staffs>)ois.readObject();
			for(Staffs staffs1:staffs){
				System.out.println(staffs1);
			}
			System.out.println("反序列化成功！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//序列化
	public static void TestObjectOutputStream(String path){
		
		try {
			//1.字节流
			OutputStream out = new FileOutputStream(path,true);
			//2.对象序列化
			ObjectOutputStream oos = new ObjectOutputStream(out);
			//3.对象序列化 序列化 Staffs
			List<Staffs> staffs = new ArrayList<Staffs>();
			staffs.add(new Staffs("1001", "小王", "1993-10-23", "23454@qq.com", "哪儿", "50.6"));
			staffs.add(new Staffs("1002", "小柳", "1992-04-07", "sfgs23@qq.com", "表里", "67.3"));
			oos.writeObject(staffs);
			System.out.println("序列化成功！");
			//4.关闭流
			oos.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	void set(ArrayList<Staffs> al,String id,String x,String strxiugai){
		System.out.println("请输入你要更改的属性：");
		for(int y=0;y<al.size();y++){
			if(al.get(y).getId().equals(id)){
				switch(x){
				case "1":
					al.get(y).setId(strxiugai);//修改id
					break;
				case "2":
					al.get(y).setName(strxiugai);//修改姓名
					break;
				case "3":
					al.get(y).setBirthday(strxiugai);//修改生日
					break;
				case "4":
					al.get(y).setEmail(strxiugai);//修改电邮
					break;
				case "5":
					al.get(y).setAddress(strxiugai);//修改住址
					break;
				case "6":
					al.get(y).setWeight(strxiugai);//修改体重
					break;
				}
			}
		}
	}
}



//员工类
class Staffs implements Serializable{
	//属性
	private String   id;
	private String   name;
	private String   birthday ;
	private String   email;
	private String   address;
	private String   weight;
	
	//方法
	public Staffs(){
		
		
	}

	public Staffs(String id,String name,String birthday,String email,String address,String weight){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.email = email;
		this.address = address;
		this.weight = weight;
	}
	public String toString(){
		return "编号："+this.id+"\t姓名："+this.name+"\t生日："+this.birthday+"\t邮箱："+this.email+"\t住址："+this.address+"\t体重："+this.weight;
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
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	void show(){
		System.out.println("格式："+"员工[编号:"+id+"\t姓名:"+name+"\t生日:"+birthday+"\t邮箱:"+email+"\t住址:"+address+"\t体重:"+weight+"]");
	}
	
}



