package com.ljd.io;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;


public class FileToDB {
	
	static File selectFile = null;
	static PreparedStatement ps = null;
	static String contextPath;
	
	public static void main(String[] args) throws SQLException, IOException {
		//FileToDB.selectPathInsertIntoDB();
		FileToDB.readPathFromDB();
	}

	public static void selectPathInsertIntoDB() throws SQLException {
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		int returnValue = jfc.showSaveDialog(null);
		if(returnValue == JFileChooser.APPROVE_OPTION) {
			selectFile = jfc.getSelectedFile();
			System.out.println(selectFile.getAbsolutePath());
		}
		String path = selectFile.getAbsolutePath();
		System.out.println(path);
		
		String insertSql = "insert into path(path) value(?)";
		ps = ConDB.conDB().prepareStatement(insertSql);
		ps.setString(1, path);
		ps.executeUpdate();
		System.out.println("文件路径成功插入数据库！");
	}
	
	public static void readPathFromDB() throws SQLException, IOException {
		String selectSql = "select path from path where id = ?";
		ps = ConDB.conDB().prepareStatement(selectSql);
		ps.setInt(1, 1);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			contextPath = rs.getString("path");
			System.out.println(contextPath);
		}
		/*
		 * File f = new File(contextPath); FileInputStream fi = new FileInputStream(f);
		 * BufferedReader br = new BufferedReader(new InputStreamReader(fi, "UTF-8")) ;
		 * String line = br.readLine(); while(line != null) { System.out.println(line);
		 * }
		 */
		rs.close();
		ConDB.conDB().close();
				
	}
	
	
	
}
