package com.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Person> map = new HashMap<>();
		map.put("one", new Person("홍길동",20,"서울"));
		map.put("two", new Person("이순신",30,"전라"));
		map.put("three", new Person("유관순",40,"서울"));
		
		System.out.println(map.get("one").getName());
		Person one = map.get("one");
		System.out.println(one.getName());
		
		Set<String> keys = map.keySet();
		for(String key : keys) {			
			System.out.println(key+"="+map.get(key).getName());
		}
		
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key=ite.next();
			Person p =map.get(key);
			System.out.println(key+"\t"+p.getName());
		}
		
		HashMap<String,Person> map2 = new HashMap<>();
		map2.put("one", new Person("ddm",22,"asda"));
		map2.put("two", new Person("ajsdk",123,"asid"));
		map2.put("three", new Person("asbd",123123,"skdjf"));
		
		
	}

}
