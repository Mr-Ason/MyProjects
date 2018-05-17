package com.anhen.week;

import java.util.Scanner;

/*public class Gl {
	public static void main(String[] args) {
		//1、创建客户信息数组   id[]   birth[]  
			String[][] users = new String[][]{{},{},{},{}};
			Scanner sc = new Scanner(System.in);
			String action = "";//操作命令
//			System.out.println(users.length);//初始长度为0
		//登录操作  3次之内成功	
		//2、系统操作界面
			outer:while(true){
				systemIn();//系统菜单提示
			    action = sc.next();
			    switch(action){
			    case "1":
			    	System.out.println("显示所有客户信息！");
			    	showInfos(users);
			    	break;
			    case "2":
			    	System.out.println("添 加 客 户 信 息！");
			    	users = addUser(users);
			    	showInfos(users);
			    	break;
			    case "3":
//			    	System.out.println("修 改 客 户 信 息！");
//			    	index = findUser(users);
//			    	if(index ==-1){
//			    		System.out.println("没有找到用户！");
//			    	}else{
//			    		System.out.println("要修改姓名");
//			    		String usersName = sc.next();
//			    		users[index][1]= usersName;
			    	}
			    	break;
			    case "4":
			    	System.out.println("查 询 客 户 信 息！");
			    	int index = findUser(users);
			    	if(index == -1){
			    		System.out.println("没有找到用户！");
			    	}else{
			    		System.out.println("找到的用户：");
			    		for(String val : users[index] ){
			    			System.out.print(val+"\t");
			    		}
			    	}
			    	break;
			    case "5":
			    	System.out.println("删除客户信息！");
			    	String[][] array =new String[users.length-1][4];
			    	 index = findUser(users);
			    	for(int i =0;i<users.length;i++){
			    		for(int j =0;j<users[i].length;j++){
			    			
			    		}
			    	}
			    	break;
			    case "6":
			    	System.out.println("用户积分排行！");
			    	break;
			    case "999":
			    	System.out.println("退出系统！");
			    	sc.close();
			    	break outer;
			    default:
			    	System.out.println("输入操作有误，请重新输入");
			    }
			    //返回上一级  还是停留当前菜单
			}
		}
		public static int findUser(String[][] users){//查找用户信息
			Scanner sc = new Scanner(System.in);
			int index = -1;
			int lonums = -1;
			String serach = "";
			//查询条件  和  输入条件
			outer: while(true){
				System.out.println("请输入要查询的条件： 1、会员号  2、姓名 3、生日  4、积分 ");
				String action = sc.next();
				switch(action){
				case "1":
					System.out.println("请输入用户的会员号：");
					serach = sc.next();
					lonums = 0;
					break outer;
				case "2":	
					System.out.println("请输入用户的姓名：");
					serach = sc.next();
					lonums = 1;
					break outer;
				case "3":	
					System.out.println("请输入用户的生日：");
					serach = sc.next();
					lonums = 2;
					break outer;
				case "4":	
					System.out.println("请输入用户的积分：");
					serach = sc.next();
					lonums = 3;	
					break outer;
				default :
					System.out.println("请重新输入条件！");
				}
			}
			//匹配条件
			for(int i = 0;i<users.length;i++){
				for(int j=0;j<users[i].length;j++){
					if(serach.equals(users[i][lonums])){
						index = i;
					}
				}
			}
			
			return index;
		}
		public static String[][] addUser(String[][] users){//增加用户信息
			Scanner sc = new Scanner(System.in);
			System.out.println("users:"+users.length);//打印数组长度
			//新增用户信息
			String id = "";
			String name = "";
			String birth = "";
			String scores = "";
			while(true){
				System.out.println("请输入客户会员号：");
				id = sc.next();
				if(id.length()  < 4){
					System.out.println("会员号不合法，请重新输入！");
					continue;
				}
				System.out.println("请输入客户姓名：");
				name = sc.next();
				System.out.println("请输入客户生日：");
				birth = sc.next();
				System.out.println("请输入客户积分：");
				scores = sc.next();
				if(scores.length() > 0){
					break;
				}
			}
			
			//创建新数组
			String[][] newArray = new String[users.length+1][4];//接收新用户的信息
			//赋值
			for(int i = 0;i<users.length;i++){
				for(int j = 0; j<users[i].length;j++){
					newArray[i][j] = users[i][j];
				}
			}
			//新用户添加到数组中
			newArray[newArray.length - 1][0] = id;
			newArray[newArray.length - 1][1] = name;
			newArray[newArray.length - 1][2] = birth;
			newArray[newArray.length - 1][3] = scores;
			//数组赋值
			users = null;
			users = newArray;
			return users;
		}
		
		public static void showInfos(String[][] users){//显示查找时情况
			if(users.length <= 0){
				System.out.println("没有用户！");
			}else{
				System.out.println("\n显示所有客户信息：");
				for(String[] array : users){
					for(String val : array){
						System.out.print(val+"\t");
					}
				}
			}	
		}
		
		public  static void systemIn(){
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
	}
*/


