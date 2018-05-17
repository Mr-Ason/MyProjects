package com.anhen.day17;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class TextFile {
	public static void main(String[] args){
		//创建文件
		createFile();
	}


//创建文件
	public static void  createFile(){
			File file = new File("D:\\string.txt");//创文件
			//判断文件是否存在
			if(file.exists()){
				System.out.println("文件已经存在！");
				if(file.delete()){
					System.out.println("文件已删除！");
				}else{
					System.out.println("文件删除失败！");
				}
				
			}else{
				System.out.println("文件可以被创建！");
				try{
					if((file.createNewFile())){
					System.out.println("文件创建成功！");
					//获取文件信息
					show(file);
					}
				}
			catch(IOException e){
				System.out.println("文件创建失败！");
				e.printStackTrace();
			}		
		}
  }
	public static void show(File file){
		String path = file.getAbsolutePath();//获取路径
		long length = file.lastModified();//调用最近一次修改的
		Date date = new Date(length);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss E");
		String time = sdf.format(date);//化时间格式为字符型
		System.out.println("路径:"+path);
		System.out.println("大小:"+file.length());
		System.out.println("时间:"+time);
		
		
	}
}