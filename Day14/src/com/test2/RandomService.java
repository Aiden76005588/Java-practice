package com.test2;

import java.util.ArrayList;

public class RandomService {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();

	public void random() {
		for (int i = 0; i < 10; i++) {
			int j = (int) (Math.random() * 10);
			int k = (int) (Math.random() * 10);
			list1.add(j);
			list2.add(k);
		}
	}
	public void printArrayList() {
		
	}

}
