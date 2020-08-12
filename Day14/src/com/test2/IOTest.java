package com.test2;

import java.io.IOException;
import java.io.InputStream;

public class IOTest {
	//한 글자가 아니라 바이트 단위로 읽어올때 사용. 
	public static void main(String[] args) {
		
		System.out.println("데이터 입력:");
		InputStream is = System.in;
		try {
			//필터사용 byte->char로 변경
			byte[] b = new byte[5];
			int n = is.read(b);
			for(byte c : b) {
				System.out.println((char) c);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
