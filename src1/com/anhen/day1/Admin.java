//package com.anhen.day1;
//
//import java.util.*;
//
////import 员工管理系统.Employee;
//
///**
// *  员工管理类（属性：员工集合  方法：添加员工、删除员工、修改员工、查询员工、排序功能
//    <可以按出生日期、体重排序>）*
//   	要求：
//	a.出生日期格式必须为yyyy-MM-dd形式 如：1988-08-08
//	b.邮箱必须合法
//	c.姓名必须合法，不能为一些不合理的姓名：如（数字、特殊字符）
//	d.显示员工信息时，要根据出生日期显示出员工年龄
// */
//public class Admin {
//	
//	 Employee e;
//	// TreeSet s = new TreeSet(new 排序器());
//		
//	//添加员工
//	public Employee run(String id,String name,String date,String email,String add,String heavy){
//		e=new Employee(heavy, heavy, heavy, heavy, heavy, heavy);
//		e.setId(id);
//		e.setName(name);
//		e.setDate(date);
//		e.setEmail(email);
//		e.setAdd(add);
//		e.setHeavy(heavy);
//		return e;
//	}
//	
//	//删除员工
//
//	
//	//修改员工
//
//	
//	//查找员工
//	
//	//排序功能
//	
//	//重写toString 方法
//    public String toString(){
//		return e.getId()+" "+e.getName()+" "+e.getDate()+" "+e.getEmail()+" "+e.getAdd()+" "+e.getHeavy()+" ";
//		}
//}
