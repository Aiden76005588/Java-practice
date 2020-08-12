package com.test;

import java.util.Iterator;

public class Ex10_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key=ite.next();
			System.out.println(key+"\t"+map.get(key));
		}
		
	

	}

}
