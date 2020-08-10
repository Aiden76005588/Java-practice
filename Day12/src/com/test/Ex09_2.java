package com.test;

public class Ex09_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		String name = null;
		try {
					
			System.out.println("문자열의 길이:" + name.length());
						
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e2) {
			System.out.println(e2.getMessage());
		} catch (Exception e3) {
			System.out.println("모든 예외처리 가능");
		}
		System.out.println("프로그램 정상 종료");
		
		try {
			System.out.println("프로그램 시작");
			int num = 3 / 0;
			System.out.println(num);
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e2) {
			System.out.println(e2.getMessage());
		} catch (Exception e3) {
			System.out.println("모든 예외처리 가능");
		}
		System.out.println("프로그램 정상 종료");
		
		try {
			System.out.println(name.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
