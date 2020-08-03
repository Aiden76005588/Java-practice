package com.cat;

public class Cat {
	
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	String gender;
	
	public Cat() {//default 생성자 소스-슈퍼클래스
		super();
		// TODO Auto-generated constructor stub
	}

}
