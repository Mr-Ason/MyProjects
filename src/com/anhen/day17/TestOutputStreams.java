package com.anhen.day17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*OutputStream д������
 * */
public class TestOutputStreams {

	public static void main(String[] args) {
		//����Fileʵ��
		File file = new File("D:\\outputStream.txt");
		try {
			file.createNewFile();
			System.out.println(file.getAbsolutePath());
			//д������
			String str = "д������ݣ�ADFfds��1234567890";
			byte[] bytes = str.getBytes();
			//ʵ����OutputStream
			OutputStream out = new FileOutputStream(file,true);//true  ׷������
			out.write(bytes);//д������
			out.close();//�ر������
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
