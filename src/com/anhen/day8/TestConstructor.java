//package com.anhen.day8;
////���췽��
///*1�����췽�������ã��Գ�Ա���Գ�ʼ������ֵ��
// * 2�����췽�����﷨��
// * 	    ���η�  ��������{ 
// * 		 ���
// * }
// * 3��ע�����
// *       1��������û�ж����κι��췽��ʱ�����������Զ����Զ���ȫһ���޲ι��췽�������г�Ա���Զ���ֵΪĬ��ֵ
// *       2����������д������һ�����췽�������������������Զ���ȫһ�����췽�������û�н��г�Ա���Եĸ�ֵ�������������Զ���ȫ������ΪĬ��ֵ��
// *       3��һ�����п����ж�����췽�������췽���˴˵���ͨ��this()��this()��������ͨ�����е��ã������ڹ��췽���еĵ�һ��ʹ��
// *            ���췽�����  new �ؼ��֣�ʵ�������󣻲���ͨ��������ķ�ʽ����
// *            
// *  4�����أ�ͬһ��������������ͬ���������б�ͬ
// *  	1������ �� ������ �Ͳ����б�Ӱ�죬�����η�������ֵ�б�û�й�ϵ
// *      2�������б�ͬ���������������� �Ͳ����ĸ��� �� �������͵�˳�� 
// * */
//public class TestConstructor {
//
//	public static void main(String[] args) {
//		//1������Ĭ�ϵĹ��췽��
//		Admin admin = new Admin("100");
//		System.out.println(admin.id);
//		System.out.println(admin.pwd);
//		//2�����췽���Գ�Ա������ʼ�� Ĭ��ֵ
//		//String pwd = null;//��������
//		//System.out.println(pwd);
//		//3�����ι��췽��
//		Admin admin1 = new Admin("1111","1222");
//		System.out.println(admin1.id);
//		System.out.println(admin.pwd);
//		
//		//4������������   ���η���Ӱ������ 
//		admin1.show();
//		admin1.show("����������");
//		admin1.show(25);
//
//	}
//	
//}
//class Admin{
//	//��Ա����
//	public String id;
//	public String pwd="123";
//	
//	//���췽��
//	public Admin(){
//		
//		System.out.println("�вε����޲ι���");
//	}
//	public Admin(String id){
//		this();//�����޲ι��췽��
//		//this();����ͬʱ��������
//		this.id = id;
//	}
//	public  Admin(String id ,String pwd){
//		this(id);//���õڶ������췽��
//		this.pwd = pwd;
//	}
//	public void test(){
//	System.out.println("��������ͨ�����е��ù��췽��");
//   }
//	
//	//��ͨ����������
//	public void show(){
//		System.out.println("���ִ�ӡ");
//	}
//	
//	public void show(String str){
//		System.out.println(str);
//	}
//	public void show(int num){
//		System.out.println(num);
//	}
////   public int show(int num){//����������
////		return num;
////	}
//}
//
