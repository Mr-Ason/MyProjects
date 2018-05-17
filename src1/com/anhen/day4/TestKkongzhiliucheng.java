package com.anhen.day4;
/*控制流程语句
 *   break continue return
 *   1 、break可以终止switch 分支、循环结构
 *   2、continue 跳过当前循环，进入下一次循环
 *   3、return 结束方法，从而影响方法中的代码，结束循环 
 * 
 * 
 */
public class TestKkongzhiliucheng {
  public static void main(String[] args){
	  //100~999寻找水仙花数，找到一个结束
	   for(int i = 100;i<1000;i++){
		   int ge = i%10;
		   int shi = 1/10%10;
		   int bai = i/100;
		   
		   if(ge*ge*ge*+shi*shi*shi*+bai*bai*bai==i){
			   System.out.println("水仙花数： "+i);
			   break;
		   }
	   }
	   //1~1000的和，遇到能整除10的 忽略
	  /* int sum = 0;
	   for(int i=0;i<=1000;i++){
		   if(i%10==0){
			   System.out.println("跳过了！"+i);
			   continue;
		   }
		   sum+=i;//continue跳过这个语句的执行
	   }
	   System.out.println("he :"+sum);*/
  } 
}
