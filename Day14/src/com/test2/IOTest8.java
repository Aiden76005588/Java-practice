package com.test2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOTest8 {
	public static void main(String[] args) {
		File f =new File("C:\\Test\\xyz.txt");
		PrintWriter out =null;
		try {
			FileWriter writer =new FileWriter(f,true);//true 기존파일에 내용이 있다면 그 다음에 붙여써라.
			out=new PrintWriter(writer);
			out.print("happy");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
	}

}
