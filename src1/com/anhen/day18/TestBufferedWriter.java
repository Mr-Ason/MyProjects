package com.anhen.day18;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//�ַ������� Ч�ʸ�
public class TestBufferedWriter {
	public static void main(String[] args){
		try{
			//1.�ֽ���
			OutputStream out = new FileOutputStream("D:\\4.txt",true);
		//2.�ַ���
			OutputStreamWriter outWriter = new OutputStreamWriter(out);
		//3.������
			BufferedWriter buffWriter = new BufferedWriter(outWriter);
		//4.д������
			String str = "�������ݣ�\r\n�㲻������Ҫ";
			buffWriter.write(str);
			buffWriter.newLine();
			buffWriter.write(str);
			System.out.print("д��ɹ���");
		//5.�ر�
			buffWriter.close();
		    outWriter.close();
		    out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
