package com.test;

public class EX05 {
	public EX05() {System.out.println("생성자 호출");}
	public EX05(String a) {System.out.println("(String a) 생성자 호출");
		}
	public EX05(int a ) {System.out.println("(int a)생성자 호출");}
	public void sum() {System.out.println("()호출");}
	public void sum(int a) {System.out.println("(int a)함수 호출");}
	public void sum(String a) {System.out.println("(String a)함수호출");}
	public void sum(int a, String b) {}
	public void sum(String a, int b) {}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EX05 test = new EX05();
		EX05 test1 = new EX05("홍길동");
		
		test.sum("홍길동");
		test.sum(100);

	}

}
