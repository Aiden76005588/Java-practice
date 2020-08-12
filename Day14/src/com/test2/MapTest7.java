package com.test2;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
				
		int sum=0;
		for(int i= 1; i<=10;i++) {
			map.put(i+"", i);
			System.out.println(i);
		}
		Set<String> keys = map.keySet();		
		for(String key : keys) {
			sum+=map.get(key);			
		}
		System.out.println("========"+sum);
		
		
		
	}

}
