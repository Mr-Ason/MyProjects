package com.anhen.day8;

public class TextAdmin {
	public static void main(String[] args){
		//访问TextAdmin
		//打印无参构造方法
		Admin admin = new Admin();
		//打印带参构造方法
		Admin admin1 = new Admin("张大炮","123456");	
		Admin admin2 = new Admin("小黄人","183445");
		Admin admin3 = new Admin("李思思","343456");
		Admin admin4 = new Admin("张二泡","563456");
		Admin admin5 = new Admin("姓名:"+"张三炮","\t密码:"+"773456");
		Admin admin6 = new Admin("sdf","123");
//		System.out.print(admin1.getName(""));
//		System.out.println(admin1.getPwd(""));
//		System.out.print(admin2.getName(""));
//		System.out.println(admin2.getPwd(""));
//		System.out.print(admin3.getName(""));
//		System.out.println(admin3.getPwd(""));
//		System.out.print(admin4.getName(""));
//		System.out.println(admin4.getPwd(""));
//		System.out.print(admin5.getName(""));
//		System.out.println(admin5.getPwd(""));
		Admin[] array = new Admin[]{admin1,admin2,admin3,admin4,admin5,admin6};
		for(Admin ren:array){
			System.out.println("姓名:"+ren.getName("")+"\t密码:"+ren.getPwd(""));
			//Admin.show();// show 用 get  提取
		}
   }

}
class Admin{
	//属性
	private String name;//private(私有的)  用 set 储存 get 获取
	private String pwd ;
	
	//方法
	public Admin(){//无参构造方法   有参调用无参
	//	System.out.println("无参构造有用！！");
	}
	public Admin(String name){//有参构造方法
		this();
		this.name=name;
		}
	public Admin(String name,String pwd){
		this(name);
		this.pwd = pwd;
	}
	//set get 方法
	public void setName(String name){
		this.name= name;
	}
	public String getName(String name){
		return this.name ;
	}
	public void setPwd(String pwd){
		this.pwd= pwd;
	}
	public String getPwd(String pwd){
		return this.pwd ;
	}
//   public void show(String name,String pwd){
//		System.out.println("姓名:"+admin.getName()+"\t密码:"+getPwd(""));
//	}
}

	



















