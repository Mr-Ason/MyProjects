package com.ljd.java001;

public class Java000 {
	public static void main(String[] args) {
		new Java000().test();
	}
	public void test(){
	System.out.println(super.getClass().getSuperclass().getName());
	}
}


class VarTest{
	public static int staticVar = 0;
	public int instanceVar = 0;
	public VarTest ()
	{
	staticVar++;
	instanceVar++;
	System.out.println("staticeVar= "+staticVar+", "+"instanceVar="+instanceVar);
	
	}
}

class SyThread implements Runnable {
	private int ticket = 5;

	public void run() {
		for (int i = 0; i <= 100; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (this) {
				
				if (ticket > 0) {
					
					System.out.println(Thread.currentThread().getName() + "ÂôÆ±£ºticket= " + ticket--);
				}
			}

		}
	}
}
