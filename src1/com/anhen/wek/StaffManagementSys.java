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
		//���л�
		sm.TestObjectOutputStream(path);
		//�����л�
		sm.TestObjectOutputStream(path);
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Ա�������");
		//Staffs sf = new Staffs();
	    List<Staffs> sf = new ArrayList<Staffs>();
		//sf.show();
		
		
		ArrayList  al=new ArrayList();
		al.add(sm.add("1001", "С��", "1993-10-23", "23454@qq.com", "�Ķ�", "50.6"));
		al.add(sm.add("1002", "С��", "1992-04-07", "sfgs23@qq.com", "����", "67.3"));
		System.out.println("����  :  1.���Ա��  2.ɾ��Ա�� 3.�޸�Ա�� 4.����Ա��");
	    //����������
	    al.sort(new Birthday());
	    
		Iterator it = al.iterator();
		   while(it.hasNext()){
			   System.out.println(it.next());//��ʾ����
		   }
		int x = sc.nextInt();
		
	    switch(x){
	    case 1:
	    	System.out.println("���Ա����");
	    	System.out.println("������id");
	    	String id = sc.next();
	    	if(id.matches("^([+-]?)\\d*\\.?\\d+$")){
	    		System.out.println("");
	    	}else{
	    		System.out.println("�����ʱ��ʽ����ȷ�����������룡");
	    	}
	    	System.out. println("����������");
	    	String name = sc.next();
	    	if(name.matches("^[\u4e00-\u9fa5]+$")){
	    		System.out.println("");
	    	}else{
	    		System.out.println("��������������");
	    		return ;
	    	}
	    	
	        System.out.println("���������գ�");
	        String birthday = sc.next();
	        if(birthday.matches("^\\d{4}(\\-|\\/|\\.)\\d{1,2}\\1\\d{1,2}$")){
	        	System.out.println("");
	        }else{
	        	System.out.println("��������ȷ�����ڸ�ʽ��");
	        }
	        System.out.println("���������䣺");
	        String email = sc.next();
	        if(email.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$")){
	        	System.out.println("");
	        }else{
	        	System.out.println("��������ȷ���ʱ��ʽ��");
	        }
	        System.out.println("������סַ��");
	        String address = sc.next();
	        System.out.println("���������أ�");
	        String weight = sc.next();
	      al.add(sm.add(id, name, birthday, email, address, weight));
	      Staffs staffs= new Staffs(id, name, birthday, email, address, weight);
	   Iterator it1 = al.iterator();
	   while(it1.hasNext()){
		   System.out.println(it1.next());
	   }
	    break;
	    case 2:
	    System.out.println("ɾ��Ա����Ϣ��");
	    System.out.println("5.ȷ��  6.ȡ��");
	       if(x==5){
	    	   ((Iterator<String>) sm).remove();
	       }else if(x==6){
	    	   return;
	       }
	    break;
	    case 3:
	    	System.out.println("�޸�Ա����");
	    	System.out.println("��������Ҫ�޸����id:");
	    	String id1 =sc.next();
	    	System.out.println("��������Ҫ�޸������һ��:");
	    	String str =sc.next();
	    	System.out.println("���������޸ĺ������:");
	    	String str2 =sc.next();
	        sm.set(al, id1, str, str2);
	    	break;
	    case 4:
	    	System.out.println("����Ա����");
	    	System.out.println("������Ա����ţ�");
	    	al.get(sc.nextInt());
	    	break;
	    default:
	    	
	    	System.out.println("���벻��ȷ��");
	    }

	}
	private static void TestObjectOutputStream(String path) {
		// TODO Auto-generated method stub
		
	}
}

//���ձȽ���
class Birthday implements Comparator<Staffs>{

		@Override
		public int compare(Staffs o1, Staffs o2) {
			// TODO Auto-generated method stub
			return o1.getBirthday().compareTo(o2.getBirthday());
	}
}
//Ա��������
class StaffManagements{
	//private static final ObjectOutputStream Staffs = null;
	//��������
	ArrayList al ;
	public void add(){
		al= new ArrayList();
	}
	public Staffs add(String id,String name,String birthday,String email,String address,String weight){
		Staffs s = new Staffs(id,name,birthday,email,address,weight);
		return s;
	}
	//�����л�
	public static void TestObjectInputStream(String path) throws ClassNotFoundException{
		
		try (//1.�ֽ���
			InputStream input = new FileInputStream(path);
			//2.���������л���
			ObjectInputStream ois = new ObjectInputStream(input);){
			//3.�����л� List<Staffs>
			List<Staffs> staffs = (ArrayList<Staffs>)ois.readObject();
			for(Staffs staffs1:staffs){
				System.out.println(staffs1);
			}
			System.out.println("�����л��ɹ���");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//���л�
	public static void TestObjectOutputStream(String path){
		
		try {
			//1.�ֽ���
			OutputStream out = new FileOutputStream(path,true);
			//2.�������л�
			ObjectOutputStream oos = new ObjectOutputStream(out);
			//3.�������л� ���л� Staffs
			List<Staffs> staffs = new ArrayList<Staffs>();
			staffs.add(new Staffs("1001", "С��", "1993-10-23", "23454@qq.com", "�Ķ�", "50.6"));
			staffs.add(new Staffs("1002", "С��", "1992-04-07", "sfgs23@qq.com", "����", "67.3"));
			oos.writeObject(staffs);
			System.out.println("���л��ɹ���");
			//4.�ر���
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
		System.out.println("��������Ҫ���ĵ����ԣ�");
		for(int y=0;y<al.size();y++){
			if(al.get(y).getId().equals(id)){
				switch(x){
				case "1":
					al.get(y).setId(strxiugai);//�޸�id
					break;
				case "2":
					al.get(y).setName(strxiugai);//�޸�����
					break;
				case "3":
					al.get(y).setBirthday(strxiugai);//�޸�����
					break;
				case "4":
					al.get(y).setEmail(strxiugai);//�޸ĵ���
					break;
				case "5":
					al.get(y).setAddress(strxiugai);//�޸�סַ
					break;
				case "6":
					al.get(y).setWeight(strxiugai);//�޸�����
					break;
				}
			}
		}
	}
}



//Ա����
class Staffs implements Serializable{
	//����
	private String   id;
	private String   name;
	private String   birthday ;
	private String   email;
	private String   address;
	private String   weight;
	
	//����
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
		return "��ţ�"+this.id+"\t������"+this.name+"\t���գ�"+this.birthday+"\t���䣺"+this.email+"\tסַ��"+this.address+"\t���أ�"+this.weight;
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
		System.out.println("��ʽ��"+"Ա��[���:"+id+"\t����:"+name+"\t����:"+birthday+"\t����:"+email+"\tסַ:"+address+"\t����:"+weight+"]");
	}
	
}



