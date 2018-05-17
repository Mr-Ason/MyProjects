package com.anhen.day12;

import java.util.Date;
import java.text.SimpleDateFormat;


public class TextZ1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Students students = Student.getStudents("Student");
		students.show();
	}
	
	public static void text1(){
		/*获取当前时间
		 * 1.按照如下格式显示当前时间：
		  2016年01月01日 12:00:01 星期五

		 */
		    SimpleDateFormat df = new SimpleDateFormat("yyyy年-MM月-dd日 HH:mm:ss E");
			System.out.println(df.format(new Date()));
	}
   public static void text2(){
	   //2.使用正则表达式(String类）完成邮箱、身份证号、手机号验证
	    //手机
	   String str = "15198089943";
	   System.out.println(str.length());//打印str 的长度
	   System.out.println(str.matches("[0-9]*"));//str中的数 是否都在  0~9中
	   //身份证验证
	   String str2 = "533528199312151918";
	   System.out.println(str2.length());
	   System.out.println(str2.matches("[0-9]*"));
	   //邮箱
	   String str3 = "895sdf8856904@qq.com";
	   System.out.println(str3.length());
	   System.out.println(str3.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$"));
   }
   public static void text3(){
	   //3.理解String类与StringBuffer类的区别？(demo)
	   String str = "TEXT";
	   StringBuffer stb = new StringBuffer(10);
	   stb.append("dsfg");
	   
	   

   }
   
   public static void text4(){
	   /*4.掌握装箱和拆箱的用法，并测试性能与不使用装箱和拆箱性能比较。
		      实现思路：声明一个包含300000个元素的数组；通过装箱、拆箱存取查
		      看所使用时间。不使用装箱和拆箱查年所使用时间。 
	    */
	   //不适用装箱 拆箱
	   int[] number = new int[300000];
	   long start = System.currentTimeMillis();//开始到结束所用时间
	   System.out.println(start);
	   for(int i = 0;i<number.length;i++){
		   number[i] = i;
		   i = number[i];
	   }
	   long end = System.currentTimeMillis();
	   System.out.println("不适用装箱的时间："+(end-start));
	   //使用装箱
	   Integer[] number2 = new Integer[300000];
	  start = System.currentTimeMillis();
	  for (int i = 0;i<number2.length;i++){
		  number2[i] = i;
		  i = number[i];
	  }
	   end = System.currentTimeMillis();
	   System.out.println("使用封装的时间："+(end-start));
	   
   }
}





/*5.编写一个学员实体类：包含姓名、年龄属性及显示学员信息的方法；
通过反射技术实现显示学员类的详细信息。
*/
//子类
class Text{
	public Text(){
		
	}
	public static Students getText(String string) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Students students = null;
		//反射
		//通过类名获得class对象
		Class clazz = Class.forName("com.anhen.day12"+string);
		//生产新实例
		students = (Students)  clazz.newInstance();
		return students;	
	}	
}
//子类
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
		//System.out.println("姓名："+getName()+"年龄："+getAge()+"性别："+getSex());
	}
	
	
	
}
//父类
abstract class Students{
    //属性
    protected static String name;
    protected static String age;
    protected static String sex;
    
    
    //构造方法
    public Students(){
    	System.out.println("学生信息！");
    	
    }
     public abstract void show();
    public Students(String name,String age,String sex){
    	this.name = name;
    	this.age = age;
    	this.sex = sex;
    }
   //set get方法
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





