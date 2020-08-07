package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss(a)");
		String date = sdf.format(new Date());
		System.out.println(date);		

	}

}
