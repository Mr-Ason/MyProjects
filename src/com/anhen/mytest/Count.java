package com.anhen.mytest;

public class Count {
	public static void main(String[] args){
		Num num = new Num();
		num.num();
		num.outO();
	}

}
class Num{
	String sr = "want you to know one thing";
	char c[]=sr.toCharArray();
	int count = 0;
	int counto = 0;
	public void num(){
		for(int b = 0;b<c.length;b++){
		if(c[b]=='n'){
			count++;
			//System.out.println(count);打印出现的次数 1~4
	    }
	 }
	System.out.println("出现n的次数为:"+count);//打印总共出现的次数
	}
	
	public void outO(){
		for(int a=0;a<c.length;a++){
			if(c[a]=='o'){
				counto++;
			}
		}
		System.out.println("出现o的次数为:"+counto);
	}
	
		
}
