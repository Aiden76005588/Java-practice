package com.test;

public class Ex09_4 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			int num =3 /1;
			System.out.println("결과값 : " + num);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("반드시 수행되는 문장");
		}
		System.out.println("프로그램 정상 종료");
//		System.out.println("프로그램 시작");
//		try {
//			int num = 10/0;
//			System.out.println("결과값 : " + num);
//		} finally {
//			System.out.println("반드시 수행되는 문장");
//		}
//		System.out.println("프로그램 정상 종료");
	}

}
