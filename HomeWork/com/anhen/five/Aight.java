package com.anhen.five;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Aight {
	public static void main(String[] args){
		Timer t = new Timer();
		MyTast myTask = new MyTast();
		t.schedule(myTask, 5000, 2000);
		
		
 	}

}

//建立TimerTasK的子类
class MyTast extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前系统时间:"+sdf.format(new Date()));
	}

	@Override
	public boolean cancel() {
		// TODO Auto-generated method stub
		
		return super.cancel();
	}
	
}