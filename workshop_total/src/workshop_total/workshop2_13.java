package workshop_total;

import java.util.Scanner;

public class workshop2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 2자리의 정수를 입력하세요.");
		System.out.print("입력 :");
		int a = scan.nextInt();
		int c = 0;
 		while(a<9 || a>99) {
 			System.out.print("입력 :");
			a = scan.nextInt();
		}		
		System.out.println("입력값은 :"+a);
		
	}

}
