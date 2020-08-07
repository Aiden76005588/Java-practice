package com.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");		
		int num = scan.nextInt();		
		int result =num/100*100 ;
		System.out.println(result);
	}

}
