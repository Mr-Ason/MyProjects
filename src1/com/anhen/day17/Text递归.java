package com.anhen.day17;

public class Text�ݹ� {
	public static void main(String [] args){
//		int num = xunHuan.num(10);
//		//System.out.println(num);
//	System.out.println(multiply(10));
//		int x = TestDescription.testDescription(4);
//		System.out.println("�Შ�������У�"+x);
		int  y  = TestDescription.optimizeFibonacci(3, 5, 8);
		System.out.println("����λ����"+y);
	//	System.out.println(TestDescription.testDescription(10));
		//System.out.println(Text�ݹ�.num(6));
		
	}
	
	//�׳ˣ� n������0�� n!=n*(n-1)!  ==>�ݹ鷽��
	static int multiply(int n){
		if(n==1||n==0){
			return n;
		}else{
			//n* �е�n����һ�εĽ��
		return n*multiply(n-1);
		}
	}	
	
	/**
	 * F(0)=1��F(1)=1, F(n)=F(n-1)+F(n-2)��n>=2��n��N*��
	 * x(n)Ϊ쳲��������еĵڼ�λ
	 */
	static int  num(int x){
		if(x==0||x==1){
			return x;
		}
		System.out.println("��"+x+"��");
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

//�Შ��������
class TestDescription{
	public static int testDescription(int n){
			if(n== 1 || n==2){
				return n;
			}
		return testDescription(n-1)+testDescription(n-2);
	}
	/** ʱ�临�Ӷȣ�O(n)
	    * 
	    * @author rico       
	    * @param first ���еĵ�һ��
	    * @param second ���еĵڶ���
	    * @param n Ŀ����
	    * @return     
	    */
	   public static int optimizeFibonacci(int first, int second, int n) {
	       if (n > 0) {
	           if(n == 1){    // �ݹ���ֹ����
	               return first;       // ���龰
	           }else if(n == 2){            // �ݹ���ֹ����
	               return second;      // ���龰
	           }else if (n == 3) {         // �ݹ���ֹ����
	               return first + second;      // ���龰
	           }
	           System.out.println("��"+n+"�Σ�"+optimizeFibonacci(second, first + second, n - 1));
	           return optimizeFibonacci(second, first + second, n - 1);  // ��ͬ�ظ��߼�����С�����ģ
	       }
	       return -1;
	   }
}


