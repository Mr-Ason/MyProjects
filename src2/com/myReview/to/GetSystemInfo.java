/**   
 * projectName: MyJava   
 * fileName: GetSystemInfo.java   
 * packageName: com.myReview.to   
 * date: 2018年8月8日上午11:07:32   
 * copyright(c) 2017-2020 xxx公司  
 */ 
package com.myReview.to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**     
 * @title: GetSystemInfo.java   
 * @package com.myReview.to   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018年8月8日 上午11:07:32   
 * @version: V1.0     
*/
public class GetSystemInfo {
	public static void main(String[] args) throws IOException{
		GetSystemInfo.getMACAddress();
	}
	//获取本机ip地址
	public static void getIpAddress() throws UnknownHostException{
		InetAddress ipAddress  = InetAddress.getLocalHost();
		System.out.println(ipAddress);
		InetAddress loopbackAddress  = InetAddress.getLoopbackAddress();
		System.out.println(loopbackAddress);
	}
	//获取网卡地址
	public static void getMACAddress() throws IOException{
		String address = "";
		String os = System.getProperty("os.name");
		String osUser = System.getProperty("user.name");
		if(os!=null && os.startsWith("Windows")){
			String command = "cmd.exe /c ipconfig / all";
			Process p = Runtime.getRuntime().exec(command);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			String line;
			while((line = br.readLine())!=null){
				 if (line.indexOf("Physical Address") > 0) {  
					  
                     int index = line.indexOf(":");  

                     index += 2;  

                     address = line.substring(index);  

                     break;  
			}
		}
			br.close();
			System.out.println( address.trim());
		}
		System.out.println(address);
	}
}
