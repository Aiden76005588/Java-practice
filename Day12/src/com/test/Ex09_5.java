package com.test;

public class Ex09_5 {
//	public static void a() throws ArithmeticException {
//		b();
//	}
//
//	public static void b() throws ArithmeticException {
//		int num = 3 / 0;
//	}
//
//	public static void main(String[] args) {
//		System.out.println("프로그래 시작");
//		try {
//			a();
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("프로그램 정상 종료");
//	}
	public static void a()  {
		b();
	}

	public static void b()  {

		int num = 10;
		if (num == 10) {
			try{
				throw new Exception ("sssss");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("프로그래 시작");
		a();//a() 호출
		System.out.println("프로그램 정상 종료");
	}
}
