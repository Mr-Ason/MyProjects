package com.anhen.day4;

public class Shi {
	public static void main(String[] args){
		test2();
	}
	//�žű�
		public static void test1(){
		  for(int i = 1;i<10;i++){
			  for(int j =1;j<=i;j++){
					int f =j*i;
					 System.out.print(j+"*"+i+"="+f+"\t");//"\t"  ����
				}
			  System.out.println("");  
		  }
		}
		//��30���ˣ����������ˡ�Ů�˺�С������һ�ҷ�����Է� ������500RMB��
		//ÿ�����˸���30RMB��ÿ��Ů�˸���20RMB��ÿ��С������10RMB�������ˡ�Ů�˺�С�����м��ˣ�
	public static void test2(){
		
		for(int x=1;x<=28;x++){
			for(int y= 1;y<=28;y++){
				for(int z =1;z<=28;z++){
					if((x+y+z==30)&&(30*x+20*y+10*z==500)){
						System.out.println(x+"������,\t"+y+"��Ů��,\t"+z+"��С��,\t");
					}
					
					
				}
			}
			
		}
		
	}
}
