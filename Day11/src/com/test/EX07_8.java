package com.test;

import java.util.Arrays;
import java.util.Comparator;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " " + age;
	}
}

class PersonComp implements Comparator<Person> {

	public int compare(Person o1, Person o2) {
//		int result =1;
//		if( o1.age >= o2.age) result = -1;//내림차순 
//		return result;

		int result = -1;
		if (o1.age >= o2.age)
			result = 1;// 오름차순
		return result;
	}
}

public class EX07_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("홍길동", 20);
		Person p2 = new Person("이순신", 44);
		Person p3 = new Person("유관순", 18);
		Person p4 = new Person("강감찬", 66);
		Person[] ps = { p, p2, p3, p4 };
		// age로 정렬
		Arrays.sort(ps, new PersonComp());
		for (Person person : ps) {
			System.out.println(person);
		}
		
	}

}
