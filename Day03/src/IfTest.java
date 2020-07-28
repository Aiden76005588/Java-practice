import java.util.Scanner;

public class IfTest {
	public static void main(String[] agrs) {
//		
//		
//		//1. 단일 if문
//		System.out.println("문장1");
//		int num=0;
//		if(3<13) {
//			num=10;
//			System.out.println("문장2");
//			System.out.println("문장2-1");
//		}
//		System.out.println(num);
//		System.out.println("문장3");
		
		//2. if~else문
//		System.out.println("문장1");
//		int num1=0;
//		if(3==3) {
//			num1=3;
//			System.out.println("참");
//			System.out.println("참2");
//			System.out.println(num1);
//		} else {
//			System.out.println("거짓");
//			System.out.println("거짓2");
//		}
//		System.out.println(num1);
//		System.out.println("문장3");
		
//		int i =6;
//		String result =(i % 2==1) ? "홀수" : "짝수";
//		if(i % 2==1) {
//			System.out.println(result);
//		} else {
//			System.out.println(result);
//		}
//		int i = 2;
//		String result =(i % 2==1) ? "홀수" : "짝수";
//		System.out.println(result);
		
//		int score = 88;
//		char grade = 0;
//		
//		if(score>=90) {
//			grade= 'A';
//		}else if (score >= 80) {
//			grade = 'B';
//		}else if( score >= 70) {
//			grade = 'C';
//		}
//		System.out.println(grade);
		
		System.out.println("점수 입력");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();		
		char grade;		
		if(score>=90) {
			grade= 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if( score >= 70) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		scan.close();
		System.out.println("학점은"+grade);
	}

}
