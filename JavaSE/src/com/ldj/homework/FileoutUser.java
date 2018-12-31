package com.ldj.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileoutUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path target = Paths.get("D:/test.txt");
		try {
			if(!Files.exists(target)) {
				Files.createFile(target);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//三位数的水仙花数
		String content = "";
		for(int i = 1;i < 10;i++) {
			for(int j = 0; j < 10;j++) {
				for(int k = 0; k < 10;k++) {
					if(i * i * i + j * j * j + k * k * k == 100 * i + j * 10 + k) {
						content += (100 * i + j * 10 + k) + " ";
					}
				}
			}
		}
		System.out.println(content);
		PrintWriter out = null;
		try {
			out = new PrintWriter(target.toFile(),"UTF-8");
			out.print(content + "\r\n");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Failed!");
		}finally {
			out.close();
		}
		
	}
	public static boolean OldWay( File file, String content) throws IOException {
		boolean pan = false;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			 byte[] contentInBytes = content.getBytes();
			 fos.write(contentInBytes);
			 fos.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			fos.close();
		}
		return pan;
	}
}

