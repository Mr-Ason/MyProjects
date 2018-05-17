package com.anhen.mytest;

public class CC{
	 public static int counter(String s,char c){
	  int count=0;
	  for(int i=0;i<s.length();i++){
	   if(s.charAt(i)==c){
	    count++;
	   }
	  }
	  return count;
	 }
 public static void main(String args[]){
  System.out.println(new CC().counter("LOVELOVEYOU",'O'));
 }
}