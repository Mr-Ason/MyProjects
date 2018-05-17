package com.anhen.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*��һ������
 *    Collection.sort(List<T>);
 *    Tʵ��Comparable�ӿڵķ��� ComparaTo
 * �ڶ���ʵ������
 *  class ���� implements Comparator<? super T> {
 *     public int compate(T t1, T t2){
 *        return 1;
 *     }
 *  }  
 * ���ñȽ�����
 * Collections.sort(List<T>,����)��
 * ������ʵ������  �����ڲ���
 * Collections.sort(List<>)
 */

public class TestCollection�������� {
	@SuppressWarnings("unchecked")
	public static <Students> void main(String []args) throws ParseException{
		//����ѧ������
		List<Student> students = new ArrayList<Student>();
		//List<Student> students = new ArrayList<Student>();
		//�������
	    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
	    Date date1 = sdf.parse("1992-03-04");
	    Date date2 = sdf.parse("1996-04-07");
	    Date date3 = sdf.parse("1994-05-24");
	    //����ѧ����
	    Student stu1 = new Student("����",22,1001,date1);
	    Student stu2 = new Student("����",21,1002,date2);
	    Student stu3 = new Student("����",24,1003,date3);
	    Student stu4 = new Student("����",25,1004,sdf.parse("1993-03-12"));
	    //����ѧ������
	    students.add(stu1);
	    students.add(stu2);
	    students.add(stu3);
	    students.add(stu4);
	    //����
	    System.out.println("λ����ǰ����Ϣ��");
	    for(int i = 0;i<students.size();i++){
	    	System.out.println(students.get(i));
	    }
	    System.out.println("~~~~~~~~~~~~~~~");
	    //���� 
	    
	    //Collections.sort((List<Student>)students);
	    IdComparator idComparator = new IdComparator();
	    Collections.sort(students,idComparator);
	    
	    //���ձȽ�
	    Collections.sort(students, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getBirth().compareTo(o2.getBirth())>=0){
					return 1;
				}
				return -1;
			}
	    	
	    });
	    System.out.println("����֮�����Ϣ��");
	    for(int i = 0;i<students.size();i++){
	    	System.out.println(students.get(i));
	    } 
	    StudentList<Student> list = new StudentList<Student>();
	    StudentList<sStudent> slist = new StudentList<sStudent>();
	    
	    
	    
	}
}
//��ʵ��Comparator �ӿ�
//����Ƚ���
class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge() - o2.getAge()>=0){
			return 1;
		}else{
		return -1;//��λ��
		}
	}	
}
//ѧ�űȽ���
class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getId()-o2.getId()>=0){
			return -1;
		}
		return 1;
	}
	
}
//��ʵ�ֽӿ�
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
	//��дtoString
	
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String time = sdf.format(this.birth);
		return"������"+this.name+"\t���䣺"+this.age+"\tѧ�ţ�"+this.id+"\t���գ�"+time;
	}
	//ʵ�ֱȽϽӿڵķ���
	@Override
	public int compareTo(Student o) {
		//this.compareTo(o);
//		//���� ����-1
//		if(this.id>o.id){
//			return -1;
//		}
		//return o.id-this.id;//��������
		return this.age-o.age;//��������
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
























