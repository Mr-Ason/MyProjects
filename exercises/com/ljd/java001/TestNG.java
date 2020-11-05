package com.ljd.java001;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@Test
	public void testCase1(){
		System.out.println("��������1��ִ�У�");
	}
	
	@Test
	public void testCase2(){
		System.out.println("��������2��ִ�У�");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("��ÿ�����Է�����ʼ����ǰִ�У�");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("��ÿ�����Է������н�����ִ�У�");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("��ÿ��������ĵ�һ�����Է�����ʼ����ǰִ�У�");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("��ǰ����������һ�����Է����������к�ִ�У�");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("�ڲ������е�Test��ʼ����ǰִ�У�");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("�ڲ������е�Test���н�����ִ�У�");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("�ڵ�ǰ���Լ���Suite�е����в��Գ���ʼ֮ǰִ�У�");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("�ڵ�ǰ���Լ���Suite�е����в��Գ������н�����ִ�У�");
	}
	

}
