package com.anhen.day17;
//创建文件 目录  并且获取路径 大小 时间
/*try{}eatch(Exception e){}  代码处理异常  没有try的话
 * 出现异常会导致程序奔溃
 * 
 */
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class TestFile {

	public static void main(String[] args) {
		//创建文件
		createFile();
		//创建目录
		createDirs();
		
		
	}
	public static void createDirs(){
		//创建File实例
		File file = new File("D:\\book\\mybook\\text\\book.txt");
		if(file.exists()){
			System.out.println("目录已存在！");
			//删除目录
			//files.delete();//只能删除一级目录
//		    File files = new File("D:\\book");
//		    files.delete();
			//System.out.println("删除成功！");
			deleteDirs("D:\\book");
		}else{
			System.out.println("目录不存在！");
			try {
				if(file.mkdirs()){//推荐  file.mkdir();只创建一级目录
				System.out.println("目录创建成功！");
				//查看目录信息
				showInfos(file);
			}else{
				System.out.println("目录创建失败！");
			}
		}catch(Exception e){
			System.out.println("创建失败！");
			e.printStackTrace();
		}
	}
		
}
	//递归方法
	public static void deleteDirs(String pathname){
		File file = new File(pathname);
		if(file.isFile()){//文件
			file.delete();  //删除文件
		}else{//目录
			File[] lists = file.listFiles();//获取子目录File
			if(lists != null){
				for(File files:lists){
					String path = files.getAbsolutePath();//获得子目录
					System.out.println(path);
					deleteDirs(path);//调用自身  删除自身
					
				}
			}
		file.delete();//删除自己
		
		}
//		File[] lists =file.listFiles();
//		for(int i = 0;i<lists.length ;i++){
//			System.out.println(lists[i]);
//		}	
	}
	
	public static void createFile(){// 创建问价夹 book 
		File file = new File("D:\\book.text");// 创在哪儿   叫什么名字
		if(file.exists()){
			System.out.println("文件已存在");
			if(file.delete()){
				System.out.println("删除成功！");
			}else{
				System.out.println("删除失败！");
			}
		}else{
			System.out.println("文件不存在");
			try {
				if(file.createNewFile()){
					System.out.println("文件创建成功！");
					//查看文件信息
					showInfos(file);
				}
			} catch (IOException e) {
				System.out.println("文件创建失败");
				e.printStackTrace();
			}
		}
	}
	public static void showInfos(File file){
		//获取 路径  修改时间 大小
		String path = file.getAbsolutePath();//路径
		long length = file.lastModified();
		Date date = new Date(length);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String time = sdf.format(date);//时间对象格式化成字符串
		System.out.println("路径:"+path);
		System.out.println("大小;"+file.length());
		
		System.out.println("最后修改时间："+time);
		
		
		
	}

}
