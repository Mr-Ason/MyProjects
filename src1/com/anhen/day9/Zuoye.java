package com.anhen.day9;

import java.util.Scanner;

public class Zuoye {
	public static void main(String[] args){
		//界面
		System.out.println("-------------------欢迎进入游戏世界-------------------\n\n\n");
		System.out.println("                        ************\n                        ** 猜拳,开始  **\n                        ************\n\n\n");
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
		System.out.println("请选择角色：（1：刘备  2：孙权  3：曹操）\n\n\n");
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		@SuppressWarnings("unused")
		String user = sc.next();
		System.out.println("请选择人物：\n");
		@SuppressWarnings("unused")
		int ren = sc.nextInt();
		
		//实例化游戏类
		@SuppressWarnings("unused")
		Game g = new Game();
		
		//实例化用户类
		Users users = new Users();
	    users.Select();
	    users.cq();
		users.getUsers();
		users.getBox();
		users.getIntegral();
		users.show();
		//实例化计算机
		Meshusers cr = new Meshusers();
		cr.getUsers();
		cr.getBox();
		cr.getIntegral();
		cr.show();
	}
}

//创建用户类  
class Users{
	
	//属性
	Scanner sc = new Scanner(System.in);
	private String users1;//用户
	//String users = sc.next();
	private int integral;//积分
	private String box;//出拳
	
	//方法
	public Users(){//无参构造
		this.users1 = "小李";
		this.integral = 0;
		this.box = "";
	}
	//带参构造
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
			System.out.println("您选择：刘备！");
			break;
		case 2:
			System.out.println("您选择：孙权！");
			break;
		case 3:
			System.out.println("您选择：曹操！");
			break;
		default:	
			System.out.println("请选择人物！");
		}
	}
	public int  cq(){	
		int j;
		j = sc.nextInt();
		switch(j){
		
		case 1:
			System.out.println("拳头");
			break;
		case 2:
			System.out.println("石头");
			break;
		case 3:
			System.out.println("布");
			break;
			default:
				System.out.println("请输入正确数字！");
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
		System.out.println("用户名："+users1+"\t积分："+integral+"\t出拳："+box+"\n");
	}
   
	
}
//创建计算机类 网络
class Meshusers{
	private String users1;//电脑名
	private int integral;//积分
	private String box;//出拳
	
	//方法
	public Meshusers(){//无参构造
		this.users1 = "小欧";
		this.integral = 0;
		this.box = "";
	}
	//带参构造
	public String Users(String users, String box, int integral){
		this.users1 = users;
		this.box = box;
		this.integral = integral;
		return(users);	
	}
	public int  CQ(){
		int y = (int)(Math.random()*3);//随机数
		switch(y){
		case 1:
			System.out.println("电脑：拳头");
			break;
		case 2:
			System.out.println("电脑：剪刀");
			break;
		case 3:
			System.out.println("电脑：布");
			break;
			default:
				System.out.println("错误！");
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
		System.out.println("用户名："+users1+"\t积分："+integral+"\t出拳："+box);
	}
}
	//创建游戏类	
class Game{
	//属性  甲 乙
	public String first;//甲方玩家
	public String seconf;//乙方玩家
	public int  boxes;//对站次数
	private Users cr;
	//无参构造 初始化值
	public Game(){
		this.first = "甲方玩家";
		this.seconf = "乙方玩家";
		this.boxes = 0;
	Users u = new Users();
	int a = u.cq();
	Meshusers m = new Meshusers();
	int b = m.CQ();
		if(a==b){
			System.out.println("平手");
		}else if(a<b){
			if((a==1&&b==2)||(a==2&&b==3)){
				System.out.println("恭喜！你获胜！");
				 System.out.println("你的积分："+u.getIntegral()+1);
			}
		}else{
			System.out.println("笨笨！下次继续努力！");
			System.out.println("电脑积分："+cr.getIntegral()+1);
		}
	}
 }	








