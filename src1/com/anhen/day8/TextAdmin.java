package com.anhen.day8;

public class TextAdmin {
	public static void main(String[] args){
		//����TextAdmin
		//��ӡ�޲ι��췽��
		Admin admin = new Admin();
		//��ӡ���ι��췽��
		Admin admin1 = new Admin("�Ŵ���","123456");	
		Admin admin2 = new Admin("С����","183445");
		Admin admin3 = new Admin("��˼˼","343456");
		Admin admin4 = new Admin("�Ŷ���","563456");
		Admin admin5 = new Admin("����:"+"������","\t����:"+"773456");
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
			System.out.println("����:"+ren.getName("")+"\t����:"+ren.getPwd(""));
			//Admin.show();// show �� get  ��ȡ
		}
   }

}
class Admin{
	//����
	private String name;//private(˽�е�)  �� set ���� get ��ȡ
	private String pwd ;
	
	//����
	public Admin(){//�޲ι��췽��   �вε����޲�
	//	System.out.println("�޲ι������ã���");
	}
	public Admin(String name){//�вι��췽��
		this();
		this.name=name;
		}
	public Admin(String name,String pwd){
		this(name);
		this.pwd = pwd;
	}
	//set get ����
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
//		System.out.println("����:"+admin.getName()+"\t����:"+getPwd(""));
//	}
}

	



















