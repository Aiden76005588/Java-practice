package com.test1;

public abstract class AbstractClass {
	private int num;

	public abstract void a();//블록이 없는 추상메소드 선언

	public abstract int b();//블록이 없는춘상메소드 선언

	public abstract void c(int x);//블록이 없는 추상메소드 선언
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	



}
