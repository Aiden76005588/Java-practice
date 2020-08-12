package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Test","IOTest5.java");
		Scanner scan = null;
		try {
			scan= new Scanner(f);
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(scan!=null)scan.close();
		}
	}

}
