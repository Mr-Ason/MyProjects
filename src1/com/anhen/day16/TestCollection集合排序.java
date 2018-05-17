package com.anhen.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*第一种排列
 *    Collection.sort(List<T>);
 *    T实现Comparable接口的方法 ComparaTo
 * 第二种实现排序
 *  class 类名 implements Comparator<? super T> {
 *     public int compate(T t1, T t2){
 *        return 1;
 *     }
 *  }  
 * 调用比较器：
 * Collections.sort(List<T>,类名)；
 * 第三种实现排序  匿名内部类
 * Collections.sort(List<>)
 */

public class TestCollection集合排序 {
	@SuppressWarnings("unchecked")
	public static <Students> void main(String []args) throws ParseException{
		//创建学生集合
		List<Student> students = new ArrayList<Student>();
		//List<Student> students = new ArrayList<Student>();
		//获得生日
	    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
	    Date date1 = sdf.parse("1992-03-04");
	    Date date2 = sdf.parse("1996-04-07");
	    Date date3 = sdf.parse("1994-05-24");
	    //创建学生象
	    Student stu1 = new Student("张三",22,1001,date1);
	    Student stu2 = new Student("张四",21,1002,date2);
	    Student stu3 = new Student("张五",24,1003,date3);
	    Student stu4 = new Student("张六",25,1004,sdf.parse("1993-03-12"));
	    //放入学生对象
	    students.add(stu1);
	    students.add(stu2);
	    students.add(stu3);
	    students.add(stu4);
	    //遍历
	    System.out.println("位排序前的信息：");
	    for(int i = 0;i<students.size();i++){
	    	System.out.println(students.get(i));
	    }
	    System.out.println("~~~~~~~~~~~~~~~");
	    //排序 
	    
	    //Collections.sort((List<Student>)students);
	    IdComparator idComparator = new IdComparator();
	    Collections.sort(students,idComparator);
	    
	    //生日比较
	    Collections.sort(students, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getBirth().compareTo(o2.getBirth())>=0){
					return 1;
				}
				return -1;
			}
	    	
	    });
	    System.out.println("排序之后的信息：");
	    for(int i = 0;i<students.size();i++){
	    	System.out.println(students.get(i));
	    } 
	    StudentList<Student> list = new StudentList<Student>();
	    StudentList<sStudent> slist = new StudentList<sStudent>();
	    
	    
	    
	}
}
//类实现Comparator 接口
//年龄比较器
class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge() - o2.getAge()>=0){
			return 1;
		}else{
		return -1;//换位置
		}
	}	
}
//学号比较器
class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getId()-o2.getId()>=0){
			return -1;
		}
		return 1;
	}
	
}
//类实现接口
class Student implements Comparable<Student>{
	protected boolean getBirth;
	private String name;
	private int age;
	private int id;
	private Date birth;
	private String time;
	
	public Student(String name,int age , int id,Date birth){
		super();
		this.name = name;
		this.age = age ;
		this.id = id ;
		this.birth = birth;
	}
	//重写toString
	
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String time = sdf.format(this.birth);
		return"姓名："+this.name+"\t年龄："+this.age+"\t学号："+this.id+"\t生日："+time;
	}
	//实现比较接口的方法
	@Override
	public int compareTo(Student o) {
		//this.compareTo(o);
//		//倒序 返回-1
//		if(this.id>o.id){
//			return -1;
//		}
		//return o.id-this.id;//降序排列
		return this.age-o.age;//升序排列
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}	
class sStudent extends Student{

	public sStudent(String name, int age, int id, Date birth) {
		super(name, age, id, birth);
		
	}
	
}
class StudentList<T extends Student>{
	private T val;
}
























