package workshop_total;

import java.util.Scanner;

public class workshop2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수값 자릿수 구하기");
		System.out.print("정수값 : ");
		int a= scan.nextInt();
		int c= 0;
		while(a<0) {
			System.out.println("양의 정수값을 입력해주세요.");
			System.out.print("정수값 :");
			a = scan.nextInt();
			
		}
		while(a > 0) {	
			a = a/10;
			c++;						
		}
		System.out.println("그 수는"+c+"자리입니다.");
		
	}

}
