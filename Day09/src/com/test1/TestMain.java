package com.test1;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractClass x = new AbstractClass();
		
		ConcreteClass y = new ConcreteClass(100);
		System.out.println(y.getNum());
		y.a();
		int n=y.b();
		y.c(100);
		
		ConcreteClass2 y2 = new ConcreteClass2();
		System.out.println(y2.getNum());
		y2.a();
		int n2 = y2.b();
		y2.c(100);
		

	}

}
