package workshop_total;

import java.util.Scanner;

public class workshop2_11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수 구하기");
		System.out.print("정수값 :");
		int a = scan.nextInt();
		int count = 0;
		while(a < 0) {
			System.out.println("양의 정수값을 입력해주세요");
		    System.out.print("정수값 :");
			a = scan.nextInt();
		}
		while(a>0) {
			a = a/10;
			count++;
		}
		System.out.println("그 수는 "+count+"자리 입니다");

	}

}
