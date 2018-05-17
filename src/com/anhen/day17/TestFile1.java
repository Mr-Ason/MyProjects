package com.anhen.day17;
/*File:操作文件和目录
 * */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile1 {

	public static void main(String[] args) {
		// 创建一个文件
		//createFile();
		creatDirs();

	}
	
	//创建目录
	public static void creatDirs(){
		//创建File实例
		File file = new File("D:\\File\\files\\test");
		if(file.exists()){
			System.out.println("文件夹已存在！");
			//删除目录
			//file.delete();//只删除一级目录
			deleteDirs("D:\\File");
			//System.out.println("删除成功！");
		}else{
			System.out.println("目录不存在！");
			if(file.mkdirs()){//创建目录 可创建上一级目录
				System.out.println("目录创建成功！");
				//调用showInfos
				showInfos(file);
			}else{
				System.out.println("目录创建失败！");
			}
		}
	}
	//递归方法
	public static void deleteDirs(String pathname){
		File file = new File(pathname);
		if(file.isFile()){//如果是文件 直接删除
			file.delete();
		}else{//目录
			File[] lists = file.listFiles();//获取子目录
			if(lists!=null){
				for(File files:lists){//File files:lists 表示lists 都属于File
					String path = files.getAbsolutePath();
					System.out.println(path);
					deleteDirs(path);//调用自身
				}
			}
			file.delete();//删除父目录
		}
		
		
	}
/*	public static void createFile(){
		//路径可以写存在的也可以写存在的
		File file = new File("D:\\file.txt");
		if(file.exists()){
			System.out.println("文件已存在！");
			if(file.delete()){
				System.out.println("删除成功！");
			}else{
				System.out.println("删除失败！");
			}
		}else{
			System.out.println("文件不存在！");
			try {
				if(file.createNewFile()){
					System.out.println("文件创建成功！");
					//调用showInfos
					showInfos(file);
				}
				
			} catch (IOException e) {
				System.out.println("文件创建失败！");
				e.printStackTrace();
			}
		}
	}*/
	public static void showInfos(File file){
		//获取路径 修改时间 文件大小
		String path = file.getAbsolutePath();
		long length = file.lastModified();
		Date date = new Date(length);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String time = sdf.format(date);//时间对象格式化成字符串
		System.out.println(path);
		System.out.println(file.length());
		System.out.println("最后修改时间："+time);
	}

}
