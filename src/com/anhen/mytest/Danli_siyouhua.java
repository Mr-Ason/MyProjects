package com.anhen.mytest;
//˽�л����췽��
//�������ģʽ�����۳����������У�����Զֻ��һ��ʵ��������
public class Danli_siyouhua {

	public static void main(String[] args) {
		Singletion sl = Singletion.getSingletion();
		Singletion sl1 = Singletion.getSingletion();
		sl.Info();
		sl1.Info();

	}
}

//���췽��˽�л�
class Singletion{
	//���е����Ա����װ
	private static Singletion st = new Singletion();//���췽���ѷ�װ����粻��ʵ������ֻ�����ڲ�ʵ����
	private Singletion(){//��װ���췽��������޷�����
		
	}
	
	//����ʵ���������Ա���װ,����ͨ��������ã�����Ҫһ����̬����ȥ��ȡ
	public static Singletion getSingletion(){//Singletion �൱���������� �磺String
		return st;
	}
	
	public void  Info(){
		System.out.println("Hell word!!");
	}
}
