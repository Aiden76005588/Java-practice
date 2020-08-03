package com.test;
class Counter{
	static int count;
	int num;
	public Counter() {
		count++;
		num=count;
	}
	public int getNum() {return num;}
}

public class Ex05_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("객체생성 횟수 : " + Counter.count);
		Counter c = new Counter();
		System.out.println("객체생성 횟수 : " + c.getNum());
		Counter c2 = new Counter();
		System.out.println("객체생성 횟수 : " + c2.getNum());
		System.out.println("객체생성 횟수 : " + Counter.count);
		

	}

}
