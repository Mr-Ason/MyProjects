package com.anhen.week;
/*package com.anhen.week;

import java.util.Scanner;

public class Fuxi {
	public static void main(String[] args){
		//1�������ͻ���Ϣ����   id[]  birth[]
		String[][] users = new String[][]{{"21","����","9/2","100"},{"22","����","9/3","200"}};
		//System.out.println(users.length);//��ʼ����Ϊ0
		Scanner sc = new Scanner(System.in);
		String action = "";//����ָ��
		int index =-1;//ƥ���±�
		//��¼���� 3��֮�ڳɹ�
		//2��ϵͳ��������
      while(true){
    	  systemIn();//ϵͳ��ʾ
			action = sc.next();
			
			outer:switch(action){
			case "1":
				System.out.println("�� ʾ �� �� �� �� �� Ϣ!");
				showInfos(users);
				break;
			case "2":
				System.out.println("�� ʾ �� �� �� �� �� Ϣ!");
				users=addUser(users);
				
				break;
			case "3":
				System.out.println("�� �� �� �� �� Ϣ");
				index = findUser(users);
				if(findUser(users) ==-1){//�ж��Ƿ����
					 System.out.println("û���ҵ��û���");
				 }else{
					 //�޸���Ϣ
					 System.out.println("������������");
					 String usersName = sc.next();
					 users[index][1] = usersName;
					 System.out.println("���������գ�");
					 String usersbrith = sc.next();
					 users[index][1] = usersName;
					 System.out.println("��������֣�");
					 String usersscores = sc.next();
					 users[index][1] = usersName;
				 }
				break;
			case "4":
				System.out.println("�� ѯ �� �� �� Ϣ");
				 index=findUser(users);
				 if(index ==-1){
					 System.out.println("û���ҵ��û���");
				 }else{
					 System.out.println("�ҵ����û�");
					 for(String val: users[index]){
						 System.out.println(val+"\t");
					 }
				 }
				 System.out.println("index��"+index);
				break;
			case "5":
				System.out.println("ɾ���ͻ���Ϣ");
				 index=findUser(users);
				 if(index ==-1){
					 System.out.println("û���ҵ��û���");
				 }else{
					 //ɾ���û�
					 String[][] newArray = new String[users.length-1][4];
					 for(int i = 0;i< newArray.length;i++){
						 for(int j=0;j<newArray[i].length;j++){
							 if(i<index){
								 newArray[i][j]=users[i][j];
							 }else{
								 newArray[i][j]=users[i+1][j];
							 }
						 }
					 }
					 
					 users =null;
					 users = newArray;
					 System.out.println("�����ɹ���");
					 }
				break;
			case "6":
				System.out.println("�û���������");
				index=bubbleSort(users);
				break;
			case "0":
				System.out.println("�˳�ϵͳ");
				break outer;
				default:
					System.out.println("�������� ���������룡");
			}
			//������һ������ͣ����ǰ
      }
	}
	public static String[][] bubbleSort (String[][] users){  //������
		    int temp=0;  
		    for(int id=0;id<users.length;id++){   
		       for(int j=id+1;j<id.length(users [][]);id++){  
			       if(users[][]>users[][id.j]){  
			           temp=users[i];  
			           users[][i]=users[][j];    
			           users[][j]=temp;  
			       }   
		       }  
		    }   
		    for(int i=0;i<users.length;i++)  
		       System.out.println(users[][i]);    
		    return users;
		}   
	public static void showInfos(String[][] users){
		System.out.println("\n��ӡ���пͷ���Ϣ��");
		for(String[] array:users){
			for(String val:array){
				System.out.print(val+"\t");
			}
			System.out.println("");
		}
	}
	public static int findUser(String[][] users){
		Scanner sc = new Scanner(System.in);
		int index = -1;
		int lonums=-1;
		String serach = "";
		// ��ѯ��������������
		outer:while(true){
		System.out.println("������Ҫ��ѯ��������");
		String action = sc.next();
		switch(action){
		case "1":
			System.out.println("�������û��Ļ�Ա�ţ� ");
			serach = sc.next();
			lonums = 0;
			break outer;
		case "2":
			System.out.println("�������û��������� ");
			serach = sc.next();
			lonums = 1;
			break outer;
		case "3":
			System.out.println("�������û������գ� ");
			serach = sc.next();
			lonums = 2;
			break outer;
		case "4":
			System.out.println("�������û��Ļ��֣� ");
			serach = sc.next();
			lonums = 3;
			break outer;
			default:
				System.out.println(" ���������룡");		
		}	
	}
		//ƥ������
		for(int i= 0;i<users.length;i++){
			for(int j = 0;j<users[i].length;j++){
				if(serach.equals(users[i][lonums])){
					index = i;
				}
			  }
			}
		return index;
 }
	public static String[][] addUser(String[][] users){//���������
		Scanner sc = new Scanner(System.in);
		//�����û���Ϣ
		String id = "";
		String name = "";
		String birth = "";
		String scores = "";
		while(true){
			System.out.println("�������Ա�ţ�");
			id = sc.next();
			if(id.length()<2){
				System.out.println("���벻�Ϸ�");
				continue;
			}
			System.out.println("������������");
			name = sc.next();
			System.out.println("���������գ�");
			birth = sc.next();
			System.out.println("��������֣�");
			scores = sc.next();
			if(scores.length()>0){
				break;
			}
		}
		//������  
		String[][] newArray = new String[users.length+1][4];
		//��ֵ
		for(int i= 0;i<users.length;i++){
			for(int j = 0;j<users[i].length;j++){
				newArray[i][j] = users[i][j];
			}
		}
		//���û���ӵ�������
		newArray[newArray.length-1][0] = id;
		newArray[newArray.length-1][1] = name;
		newArray[newArray.length-1][2] = birth;
		newArray[newArray.length-1][3] = scores;
		//���鸳ֵ
		users = null;
		users = newArray;
		
		return users;
	}
  	public static void systemIn(){
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
}*/