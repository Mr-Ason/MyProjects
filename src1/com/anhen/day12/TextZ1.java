package com.anhen.day12;

import java.util.Date;
import java.text.SimpleDateFormat;


public class TextZ1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Students students = Student.getStudents("Student");
		students.show();
	}
	
	public static void text1(){
		/*��ȡ��ǰʱ��
		 * 1.�������¸�ʽ��ʾ��ǰʱ�䣺
		  2016��01��01�� 12:00:01 ������

		 */
		    SimpleDateFormat df = new SimpleDateFormat("yyyy��-MM��-dd�� HH:mm:ss E");
			System.out.println(df.format(new Date()));
	}
   public static void text2(){
	   //2.ʹ��������ʽ(String�ࣩ������䡢���֤�š��ֻ�����֤
	    //�ֻ�
	   String str = "15198089943";
	   System.out.println(str.length());//��ӡstr �ĳ���
	   System.out.println(str.matches("[0-9]*"));//str�е��� �Ƿ���  0~9��
	   //���֤��֤
	   String str2 = "533528199312151918";
	   System.out.println(str2.length());
	   System.out.println(str2.matches("[0-9]*"));
	   //����
	   String str3 = "895sdf8856904@qq.com";
	   System.out.println(str3.length());
	   System.out.println(str3.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$"));
   }
   public static void text3(){
	   //3.���String����StringBuffer�������(demo)
	   String str = "TEXT";
	   StringBuffer stb = new StringBuffer(10);
	   stb.append("dsfg");
	   
	   

   }
   
   public static void text4(){
	   /*4.����װ��Ͳ�����÷��������������벻ʹ��װ��Ͳ������ܱȽϡ�
		      ʵ��˼·������һ������300000��Ԫ�ص����飻ͨ��װ�䡢�����ȡ��
		      ����ʹ��ʱ�䡣��ʹ��װ��Ͳ��������ʹ��ʱ�䡣 
	    */
	   //������װ�� ����
	   int[] number = new int[300000];
	   long start = System.currentTimeMillis();//��ʼ����������ʱ��
	   System.out.println(start);
	   for(int i = 0;i<number.length;i++){
		   number[i] = i;
		   i = number[i];
	   }
	   long end = System.currentTimeMillis();
	   System.out.println("������װ���ʱ�䣺"+(end-start));
	   //ʹ��װ��
	   Integer[] number2 = new Integer[300000];
	  start = System.currentTimeMillis();
	  for (int i = 0;i<number2.length;i++){
		  number2[i] = i;
		  i = number[i];
	  }
	   end = System.currentTimeMillis();
	   System.out.println("ʹ�÷�װ��ʱ�䣺"+(end-start));
	   
   }
}





/*5.��дһ��ѧԱʵ���ࣺ�����������������Լ���ʾѧԱ��Ϣ�ķ�����
ͨ�����似��ʵ����ʾѧԱ�����ϸ��Ϣ��
*/
//����
class Text{
	public Text(){
		
	}
	public static Students getText(String string) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Students students = null;
		//����
		//ͨ���������class����
		Class clazz = Class.forName("com.anhen.day12"+string);
		//������ʵ��
		students = (Students)  clazz.newInstance();
		return students;	
	}	
}
//����
class Student extends Students{
	public Student(){
		
	}
	
	public static Students getStudents(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student(String stirng){
		super(name, age, sex);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		//System.out.println("������"+getName()+"���䣺"+getAge()+"�Ա�"+getSex());
	}
	
	
	
}
//����
abstract class Students{
    //����
    protected static String name;
    protected static String age;
    protected static String sex;
    
    
    //���췽��
    public Students(){
    	System.out.println("ѧ����Ϣ��");
    	
    }
     public abstract void show();
    public Students(String name,String age,String sex){
    	this.name = name;
    	this.age = age;
    	this.sex = sex;
    }
   //set get����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String  age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
   
}





