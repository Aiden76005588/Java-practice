package com.test;

public class Outer2 {
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	public void info() {
		int size =100;
		class Inner{
			int d = 40;
			//static int e = 50; //static 변수 사용 불가
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(size);
			}
			Inner inner = new Inner();
			inner.print();
			
		}//end inner
	}//end info

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer = new Outer2();
		outer.info();

	}

}
