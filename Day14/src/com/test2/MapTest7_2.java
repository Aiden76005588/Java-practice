package com.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Person> map = new HashMap<>();//<key,value>
		//key=index=목차, value=페이지 
		map.put("one", new Person("홍길동",20,"서울"));
		map.put("two", new Person("이순신",30,"전라"));
		map.put("three", new Person("유관순",40,"서울"));
		
		HashMap<String,Person> map2 = new HashMap<>();
		map2.put("one", new Person("홍길동2",200,"서울2"));
		map2.put("two", new Person("이순신2",300,"전라2"));
		map2.put("three", new Person("유관순2",400,"서울2"));		
		
		ArrayList<HashMap<String,Person>> list =//map,map2 모두 가짐. 
				new ArrayList<HashMap<String,Person>>();
		
		list.add(map);//list에 map 정보를 주입.
		list.add(map2);//list에 map2 정보를 주입
		
		for(HashMap<String, Person> m : list ) {
			//list에서 m을 꺼낸다.타입은 HashMap<String, Person>
			Set<String> keys = map.keySet();//map을 key타입으로 전환?
			for(String key : keys) {//keys들에서 key를 꺼낸다.
				Person p = map.get(key);
				System.out.println(p.getName());
			}
		}
		
		for(HashMap <String,Person> m : list) {
			Set<String> keys = map.keySet();
			for(String key : keys) {
				Person p = map.get(key);
				System.out.println(p.getAge());
			}
		}
		 

	}

}
