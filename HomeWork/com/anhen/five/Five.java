package com.anhen.five;

import java.util.Arrays;

public class Five {
	public static void main(String[] args) {
		Students stu[] = {new Students("ˆÈı",22,86.1f),
				new Students("ÍõÁÕ",25,99.5f),
				new Students("Miss Li",23,99.5f)};
		Arrays.sort(stu);
		for(int i = 0;i<stu.length;i++){
			System.out.println(stu[i]);
		}
	}

}

class Students implements Comparable<Students>{
	private String name;
	private int age;
	private float score;
	
	public Students(String name,int age,float score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String toString(){
		return name+ "\t" +age+"\t"+score;
	}

	@Override
	public int compareTo(Students stu) {
		// TODO Auto-generated method stub
		if(this.score>stu.score){
			return -1;
		}else if(this.score<stu.score){
			return 1;
		}else{
			if(this.age>stu.age){
				return 1;
			}else if(this.age<stu.age){
				return -1;
			}else{
				return 0;
			}
		}
	}
	
}