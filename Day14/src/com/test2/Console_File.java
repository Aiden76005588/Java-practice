package com.test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Console_File {
	public static void main(String[] args) {
		System.out.println("데이터 입력하세요");
		
		BufferedReader buffer =null;
		PrintWriter out=null;
		
		try {
			File f = new File("C:\\Test","output.txt");
			buffer = new BufferedReader(new InputStreamReader(System.in));//콘솔에서 데이터 in
			FileWriter writer = new FileWriter(f,true);
			out = new PrintWriter(writer);
			out.println(buffer.readLine());
			String data = buffer.readLine();		

		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
