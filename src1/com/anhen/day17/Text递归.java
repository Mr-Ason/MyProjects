package com.anhen.day17;

public class Text递归 {
	public static void main(String [] args){
//		int num = xunHuan.num(10);
//		//System.out.println(num);
//	System.out.println(multiply(10));
//		int x = TestDescription.testDescription(4);
//		System.out.println("裴波那契数列："+x);
		int  y  = TestDescription.optimizeFibonacci(3, 5, 8);
		System.out.println("给三位数："+y);
	//	System.out.println(TestDescription.testDescription(10));
		//System.out.println(Text递归.num(6));
		
	}
	
	//阶乘： n不等于0， n!=n*(n-1)!  ==>递归方法
	static int multiply(int n){
		if(n==1||n==0){
			return n;
		}else{
			//n* 中的n是上一次的结果
		return n*multiply(n-1);
		}
	}	
	
	/**
	 * F(0)=1，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
	 * x(n)为斐波那契数列的第几位
	 */
	static int  num(int x){
		if(x==0||x==1){
			return x;
		}
		System.out.println("第"+x+"项");
		return num(x-1)+num(x-2);
	}
}

class xunHuan{
	//n!=(n-1)*(n-2)*(n-3).....1
	public static  int  num(int n){
		int result = n;
		while(n>1){
			n--;
			result = result*n;
			System.out.println(result);
		}
		return result;
	}
}

//裴波那契数列
class TestDescription{
	public static int testDescription(int n){
			if(n== 1 || n==2){
				return n;
			}
		return testDescription(n-1)+testDescription(n-2);
	}
	/** 时间复杂度：O(n)
	    * 
	    * @author rico       
	    * @param first 数列的第一项
	    * @param second 数列的第二项
	    * @param n 目标项
	    * @return     
	    */
	   public static int optimizeFibonacci(int first, int second, int n) {
	       if (n > 0) {
	           if(n == 1){    // 递归终止条件
	               return first;       // 简单情景
	           }else if(n == 2){            // 递归终止条件
	               return second;      // 简单情景
	           }else if (n == 3) {         // 递归终止条件
	               return first + second;      // 简单情景
	           }
	           System.out.println("第"+n+"次："+optimizeFibonacci(second, first + second, n - 1));
	           return optimizeFibonacci(second, first + second, n - 1);  // 相同重复逻辑，缩小问题规模
	       }
	       return -1;
	   }
}


