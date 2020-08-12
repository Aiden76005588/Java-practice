package com.test2;

import java.util.Properties;

public class MapTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.setProperty("one", "홍길동");
		prop.setProperty("two", "홍길동2");
		prop.setProperty("three", "홍길동3");

		String one = prop.getProperty("one");
		System.out.println(one);
		System.out.println(prop.getProperty("two"));
	}

}
