package com.anhen.week;

import java.util.Scanner;

/*public class Gl {
	public static void main(String[] args) {
		//1�������ͻ���Ϣ����   id[]   birth[]  
			String[][] users = new String[][]{{},{},{},{}};
			Scanner sc = new Scanner(System.in);
			String action = "";//��������
//			System.out.println(users.length);//��ʼ����Ϊ0
		//��¼����  3��֮�ڳɹ�	
		//2��ϵͳ��������
			outer:while(true){
				systemIn();//ϵͳ�˵���ʾ
			    action = sc.next();
			    switch(action){
			    case "1":
			    	System.out.println("��ʾ���пͻ���Ϣ��");
			    	showInfos(users);
			    	break;
			    case "2":
			    	System.out.println("�� �� �� �� �� Ϣ��");
			    	users = addUser(users);
			    	showInfos(users);
			    	break;
			    case "3":
//			    	System.out.println("�� �� �� �� �� Ϣ��");
//			    	index = findUser(users);
//			    	if(index ==-1){
//			    		System.out.println("û���ҵ��û���");
//			    	}else{
//			    		System.out.println("Ҫ�޸�����");
//			    		String usersName = sc.next();
//			    		users[index][1]= usersName;
			    	}
			    	break;
			    case "4":
			    	System.out.println("�� ѯ �� �� �� Ϣ��");
			    	int index = findUser(users);
			    	if(index == -1){
			    		System.out.println("û���ҵ��û���");
			    	}else{
			    		System.out.println("�ҵ����û���");
			    		for(String val : users[index] ){
			    			System.out.print(val+"\t");
			    		}
			    	}
			    	break;
			    case "5":
			    	System.out.println("ɾ���ͻ���Ϣ��");
			    	String[][] array =new String[users.length-1][4];
			    	 index = findUser(users);
			    	for(int i =0;i<users.length;i++){
			    		for(int j =0;j<users[i].length;j++){
			    			
			    		}
			    	}
			    	break;
			    case "6":
			    	System.out.println("�û��������У�");
			    	break;
			    case "999":
			    	System.out.println("�˳�ϵͳ��");
			    	sc.close();
			    	break outer;
			    default:
			    	System.out.println("���������������������");
			    }
			    //������һ��  ����ͣ����ǰ�˵�
			}
		}
		public static int findUser(String[][] users){//�����û���Ϣ
			Scanner sc = new Scanner(System.in);
			int index = -1;
			int lonums = -1;
			String serach = "";
			//��ѯ����  ��  ��������
			outer: while(true){
				System.out.println("������Ҫ��ѯ�������� 1����Ա��  2������ 3������  4������ ");
				String action = sc.next();
				switch(action){
				case "1":
					System.out.println("�������û��Ļ�Ա�ţ�");
					serach = sc.next();
					lonums = 0;
					break outer;
				case "2":	
					System.out.println("�������û���������");
					serach = sc.next();
					lonums = 1;
					break outer;
				case "3":	
					System.out.println("�������û������գ�");
					serach = sc.next();
					lonums = 2;
					break outer;
				case "4":	
					System.out.println("�������û��Ļ��֣�");
					serach = sc.next();
					lonums = 3;	
					break outer;
				default :
					System.out.println("����������������");
				}
			}
			//ƥ������
			for(int i = 0;i<users.length;i++){
				for(int j=0;j<users[i].length;j++){
					if(serach.equals(users[i][lonums])){
						index = i;
					}
				}
			}
			
			return index;
		}
		public static String[][] addUser(String[][] users){//�����û���Ϣ
			Scanner sc = new Scanner(System.in);
			System.out.println("users:"+users.length);//��ӡ���鳤��
			//�����û���Ϣ
			String id = "";
			String name = "";
			String birth = "";
			String scores = "";
			while(true){
				System.out.println("������ͻ���Ա�ţ�");
				id = sc.next();
				if(id.length()  < 4){
					System.out.println("��Ա�Ų��Ϸ������������룡");
					continue;
				}
				System.out.println("������ͻ�������");
				name = sc.next();
				System.out.println("������ͻ����գ�");
				birth = sc.next();
				System.out.println("������ͻ����֣�");
				scores = sc.next();
				if(scores.length() > 0){
					break;
				}
			}
			
			//����������
			String[][] newArray = new String[users.length+1][4];//�������û�����Ϣ
			//��ֵ
			for(int i = 0;i<users.length;i++){
				for(int j = 0; j<users[i].length;j++){
					newArray[i][j] = users[i][j];
				}
			}
			//���û���ӵ�������
			newArray[newArray.length - 1][0] = id;
			newArray[newArray.length - 1][1] = name;
			newArray[newArray.length - 1][2] = birth;
			newArray[newArray.length - 1][3] = scores;
			//���鸳ֵ
			users = null;
			users = newArray;
			return users;
		}
		
		public static void showInfos(String[][] users){//��ʾ����ʱ���
			if(users.length <= 0){
				System.out.println("û���û���");
			}else{
				System.out.println("\n��ʾ���пͻ���Ϣ��");
				for(String[] array : users){
					for(String val : array){
						System.out.print(val+"\t");
					}
				}
			}	
		}
		
		public  static void systemIn(){
			System.out.println("*****************************\n*             �ͻ���Ϣ����ϵͳ                   *\n*****************************");
			System.out.println("1. �� ʾ �� �� �� �� �� Ϣ");
			System.out.println("2. �� �� �� �� �� Ϣ");
			System.out.println("3. �� �� �� �� �� Ϣ");
			System.out.println("4. �� ѯ �� �� �� Ϣ");
			System.out.println("5.ɾ���ͻ���Ϣ");
			System.out.println("6.�û���������");
			System.out.println("0�˳�ϵͳ");
			System.out.println("*****************************");
		}
	}
*/


