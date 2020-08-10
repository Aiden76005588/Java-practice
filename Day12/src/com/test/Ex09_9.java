package com.test;

class ByZeroException extends Exception {
	public ByZeroException(String mesg) {
		super(mesg);
	}
}

public class Ex09_9 {
	public static void divide() throws ByZeroException {
		try {
			int num = 3 / 0;

		} catch (ArithmeticException e) {
			throw new ByZeroException("0으로 나누어 예외 발생");
		}
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			divide();
			
		}catch (ByZeroException e) {
			System.out.println("예외발생: " + e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}
}
