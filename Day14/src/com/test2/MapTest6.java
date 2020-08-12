package com.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("홍길동",20,"서울"));
		list1.add(new Person("홍길동2",30,"서울2"));
		list1.add(new Person("홍길동3",40,"서울3"));
		
		ArrayList<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("이순신",20,"전라"));
		list2.add(new Person("이순신2",30,"전라2"));
		list2.add(new Person("이순신3",40,"전라3"));

		HashMap<String,ArrayList<Person>> map = 
				new HashMap<String, ArrayList<Person>>();		
		map.put("one", list1);
		map.put("two", list2);
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			ArrayList<Person> xxx = map.get(key);
			for(Person p :xxx) {
				System.out.println(p.getName()+"\t"+p.getAge());
			}
		}
	}

}
