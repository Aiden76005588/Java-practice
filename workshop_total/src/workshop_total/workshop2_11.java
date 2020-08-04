package workshop_total;

import java.util.Scanner;

public class workshop2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.print("a의 값 :");
		int a = scan.nextInt();
		System.out.print("b의 값 :");
		int b = scan.nextInt();
				
		while(a > b) {
			System.out.println("a보다 큰 값을 입력하세요");
			System.out.print("b의 값 :");
			b =scan.nextInt();
			
		}
		System.out.println("b-a는"+(b-a)+"입니다");
		
	}

}
