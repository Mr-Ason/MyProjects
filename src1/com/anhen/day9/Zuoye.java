package com.anhen.day9;

import java.util.Scanner;

public class Zuoye {
	public static void main(String[] args){
		//����
		System.out.println("-------------------��ӭ������Ϸ����-------------------\n\n\n");
		System.out.println("                        ************\n                        ** ��ȭ,��ʼ  **\n                        ************\n\n\n");
		System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
		System.out.println("��ѡ���ɫ����1������  2����Ȩ  3���ܲ٣�\n\n\n");
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		@SuppressWarnings("unused")
		String user = sc.next();
		System.out.println("��ѡ�����\n");
		@SuppressWarnings("unused")
		int ren = sc.nextInt();
		
		//ʵ������Ϸ��
		@SuppressWarnings("unused")
		Game g = new Game();
		
		//ʵ�����û���
		Users users = new Users();
	    users.Select();
	    users.cq();
		users.getUsers();
		users.getBox();
		users.getIntegral();
		users.show();
		//ʵ���������
		Meshusers cr = new Meshusers();
		cr.getUsers();
		cr.getBox();
		cr.getIntegral();
		cr.show();
	}
}

//�����û���  
class Users{
	
	//����
	Scanner sc = new Scanner(System.in);
	private String users1;//�û�
	//String users = sc.next();
	private int integral;//����
	private String box;//��ȭ
	
	//����
	public Users(){//�޲ι���
		this.users1 = "С��";
		this.integral = 0;
		this.box = "";
	}
	//���ι���
	public Users(String users, String box, int integral){
		this.users1 = users;
		this.box = box;
		this.integral = integral;
	}		
	public void  Select(){	
        int i ;
		i = sc.nextInt();
		switch(i){
		case 1:
			System.out.println("��ѡ��������");
			break;
		case 2:
			System.out.println("��ѡ����Ȩ��");
			break;
		case 3:
			System.out.println("��ѡ�񣺲ܲ٣�");
			break;
		default:	
			System.out.println("��ѡ�����");
		}
	}
	public int  cq(){	
		int j;
		j = sc.nextInt();
		switch(j){
		
		case 1:
			System.out.println("ȭͷ");
			break;
		case 2:
			System.out.println("ʯͷ");
			break;
		case 3:
			System.out.println("��");
			break;
			default:
				System.out.println("��������ȷ���֣�");
		}
		return j;
	}

	
	public String getUsers() {
		return users1;
	}
	public void setUsers(String users) {
		this.users1 = users;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public String getBox() {
		return box;
	}
	public void setBox(String box) {
		this.box = box;
	}
	public void show(){
		System.out.println("�û�����"+users1+"\t���֣�"+integral+"\t��ȭ��"+box+"\n");
	}
   
	
}
//����������� ����
class Meshusers{
	private String users1;//������
	private int integral;//����
	private String box;//��ȭ
	
	//����
	public Meshusers(){//�޲ι���
		this.users1 = "Сŷ";
		this.integral = 0;
		this.box = "";
	}
	//���ι���
	public String Users(String users, String box, int integral){
		this.users1 = users;
		this.box = box;
		this.integral = integral;
		return(users);	
	}
	public int  CQ(){
		int y = (int)(Math.random()*3);//�����
		switch(y){
		case 1:
			System.out.println("���ԣ�ȭͷ");
			break;
		case 2:
			System.out.println("���ԣ�����");
			break;
		case 3:
			System.out.println("���ԣ���");
			break;
			default:
				System.out.println("����");
		} 
		return y;
	}
	public String getUsers() {
		return users1;
	}
	public void setUsers(String users) {
		this.users1 = users;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public String getBox() {
		return box;
	}
	public void setBox(String box) {
		this.box = box;
	}
	public void show(){
		System.out.println("�û�����"+users1+"\t���֣�"+integral+"\t��ȭ��"+box);
	}
}
	//������Ϸ��	
class Game{
	//����  �� ��
	public String first;//�׷����
	public String seconf;//�ҷ����
	public int  boxes;//��վ����
	private Users cr;
	//�޲ι��� ��ʼ��ֵ
	public Game(){
		this.first = "�׷����";
		this.seconf = "�ҷ����";
		this.boxes = 0;
	Users u = new Users();
	int a = u.cq();
	Meshusers m = new Meshusers();
	int b = m.CQ();
		if(a==b){
			System.out.println("ƽ��");
		}else if(a<b){
			if((a==1&&b==2)||(a==2&&b==3)){
				System.out.println("��ϲ�����ʤ��");
				 System.out.println("��Ļ��֣�"+u.getIntegral()+1);
			}
		}else{
			System.out.println("�������´μ���Ŭ����");
			System.out.println("���Ի��֣�"+cr.getIntegral()+1);
		}
	}
 }	








