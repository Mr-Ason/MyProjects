package com.anhen.day4;

public class Shi {
	public static void main(String[] args){
		test2();
	}
	//九九表
		public static void test1(){
		  for(int i = 1;i<10;i++){
			  for(int j =1;j<=i;j++){
					int f =j*i;
					 System.out.print(j+"*"+i+"="+f+"\t");//"\t"  换行
				}
			  System.out.println("");  
		  }
		}
		//有30个人，其中有男人、女人和小孩，在一家饭馆里吃饭 共花了500RMB，
		//每个男人各花30RMB，每个女人各花20RMB，每个小孩各花10RMB，问男人、女人和小孩各有几人？
	public static void test2(){
		
		for(int x=1;x<=28;x++){
			for(int y= 1;y<=28;y++){
				for(int z =1;z<=28;z++){
					if((x+y+z==30)&&(30*x+20*y+10*z==500)){
						System.out.println(x+"个男人,\t"+y+"个女人,\t"+z+"个小孩,\t");
					}
					
					
				}
			}
			
		}
		
	}
}
