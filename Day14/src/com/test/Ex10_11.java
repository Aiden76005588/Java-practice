package com.test;

import java.util.HashMap;

public class Ex10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("age", "20");
		map.put("address", "서울");
		map.put("email", null);
		
		System.out.println("이름은 : "+map.get("name"));
		System.out.println("나이는 : "+map.get("age"));
		System.out.println("주소는 : "+map.get("address"));
		System.out.println("email은 : "+map.get("email"));
		
		System.out.println("데이터 크기(길이)?"+map.size());
		System.out.println("데이터가 비어있냐?"+map.isEmpty());
		System.out.println("age키가 있냐?"+map.size());
		System.out.println("홍길동 값이있냐?"+map.containsKey("age"));
		System.out.println("age키에 해당하는 데이터 삭제"+map.containsValue("홍길동"));

	}

}
