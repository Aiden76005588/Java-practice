package com.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest2 {
	// 한 글자가 아니라 바이트 단위로 읽어올때 사용.
	public static void main(String[] args) {
		// 표준입력==>키보드로 입력 한글 입력가능(btye=>char로변화)InputStreamReader사용
		// read()함수 사용

		System.out.println("데이터 입력:");
		InputStream is = System.in;
		InputStreamReader reader = null;
		try {
			// 필터사용 byte->char로 변경
			reader = new InputStreamReader(is);
			int n = reader.read();

			System.out.println((char) n);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
