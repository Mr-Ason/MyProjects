package com.anhen.five;

public class Three {
	public static void main(String[] args){
		FontNumber number= new FontNumber();
		number.unmber();
		number.number();
   }

}

class FontNumber{
	String str= "want you to kown one thing";
		char c[] = str.toCharArray();
		int x =0;
		int y =0;
		public void unmber(){
			for(int i = 0;i<c.length;i++){
				if(c[i]=='n'){
					x++;
				}
			}
			System.out.println("出现n的次数:"+x);
		}
		public void number(){
			for(int a = 0;a<c.length;a++){
				if(c[a]=='o'){
						y++;
				}
			}
			System.out.println("o出现的次数:"+y);
		}
}