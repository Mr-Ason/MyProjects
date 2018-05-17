package com.anhen.week;
/*package com.anhen.week;

import java.util.Scanner;

public class Fuxi {
	public static void main(String[] args){
		//1、创建客户信息数组   id[]  birth[]
		String[][] users = new String[][]{{"21","李四","9/2","100"},{"22","李无","9/3","200"}};
		//System.out.println(users.length);//初始长度为0
		Scanner sc = new Scanner(System.in);
		String action = "";//操作指令
		int index =-1;//匹配下标
		//登录操作 3次之内成功
		//2、系统操作界面
      while(true){
    	  systemIn();//系统提示
			action = sc.next();
			
			outer:switch(action){
			case "1":
				System.out.println("显 示 所 有 客 户 信 息!");
				showInfos(users);
				break;
			case "2":
				System.out.println("显 示 所 有 客 户 信 息!");
				users=addUser(users);
				
				break;
			case "3":
				System.out.println("修 改 客 户 信 息");
				index = findUser(users);
				if(findUser(users) ==-1){//判断是否存在
					 System.out.println("没有找到用户！");
				 }else{
					 //修改信息
					 System.out.println("请输入姓名：");
					 String usersName = sc.next();
					 users[index][1] = usersName;
					 System.out.println("请输入生日：");
					 String usersbrith = sc.next();
					 users[index][1] = usersName;
					 System.out.println("请输入积分：");
					 String usersscores = sc.next();
					 users[index][1] = usersName;
				 }
				break;
			case "4":
				System.out.println("查 询 客 户 信 息");
				 index=findUser(users);
				 if(index ==-1){
					 System.out.println("没有找到用户！");
				 }else{
					 System.out.println("找到的用户");
					 for(String val: users[index]){
						 System.out.println(val+"\t");
					 }
				 }
				 System.out.println("index："+index);
				break;
			case "5":
				System.out.println("删除客户信息");
				 index=findUser(users);
				 if(index ==-1){
					 System.out.println("没有找到用户！");
				 }else{
					 //删除用户
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
					 System.out.println("操作成功！");
					 }
				break;
			case "6":
				System.out.println("用户积分排行");
				index=bubbleSort(users);
				break;
			case "0":
				System.out.println("退出系统");
				break outer;
				default:
					System.out.println("输入有误 请重新输入！");
			}
			//返回上一级还是停留当前
      }
	}
	public static String[][] bubbleSort (String[][] users){  //？？？
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
		System.out.println("\n打印所有客服信息：");
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
		// 查询条件和输入条件
		outer:while(true){
		System.out.println("请输入要查询的条件：");
		String action = sc.next();
		switch(action){
		case "1":
			System.out.println("请输入用户的会员号： ");
			serach = sc.next();
			lonums = 0;
			break outer;
		case "2":
			System.out.println("请输入用户的姓名： ");
			serach = sc.next();
			lonums = 1;
			break outer;
		case "3":
			System.out.println("请输入用户的生日： ");
			serach = sc.next();
			lonums = 2;
			break outer;
		case "4":
			System.out.println("请输入用户的积分： ");
			serach = sc.next();
			lonums = 3;
			break outer;
			default:
				System.out.println(" 请重新输入！");		
		}	
	}
		//匹配条件
		for(int i= 0;i<users.length;i++){
			for(int j = 0;j<users[i].length;j++){
				if(serach.equals(users[i][lonums])){
					index = i;
				}
			  }
			}
		return index;
 }
	public static String[][] addUser(String[][] users){//定义添加类
		Scanner sc = new Scanner(System.in);
		//新增用户信息
		String id = "";
		String name = "";
		String birth = "";
		String scores = "";
		while(true){
			System.out.println("请输入会员号：");
			id = sc.next();
			if(id.length()<2){
				System.out.println("输入不合法");
				continue;
			}
			System.out.println("请输入姓名：");
			name = sc.next();
			System.out.println("请输入生日：");
			birth = sc.next();
			System.out.println("请输入积分：");
			scores = sc.next();
			if(scores.length()>0){
				break;
			}
		}
		//新数组  
		String[][] newArray = new String[users.length+1][4];
		//赋值
		for(int i= 0;i<users.length;i++){
			for(int j = 0;j<users[i].length;j++){
				newArray[i][j] = users[i][j];
			}
		}
		//新用户添加到数组中
		newArray[newArray.length-1][0] = id;
		newArray[newArray.length-1][1] = name;
		newArray[newArray.length-1][2] = birth;
		newArray[newArray.length-1][3] = scores;
		//数组赋值
		users = null;
		users = newArray;
		
		return users;
	}
  	public static void systemIn(){
		System.out.println("*****************************\n*             客户信息管理系统                   *\n*****************************");
		System.out.println("1. 显 示 所 有 客 户 信 息");
		System.out.println("2. 添 加 客 户 信 息");
		System.out.println("3. 修 改 客 户 信 息");
		System.out.println("4. 查 询 客 户 信 息");
		System.out.println("5.删除客户信息");
		System.out.println("6.用户积分排行");
		System.out.println("0退出系统");
		System.out.println("*****************************");
	}
}*/