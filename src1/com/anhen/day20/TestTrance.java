package com.anhen.day20;

public class TestTrance {
	public static void main(String[] args) {
		//获得DBUtile
		DBUtils dbu = new DBUtils();
		//李四转钱给张三
		int money = 100;
		//李四减钱
		String sql = "UPDATE account SET balance=balance-? WHERE NAME = '李四';";
	}

}
