import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수를 입력하세요");
		String num_1 =scan.next();
		System.out.println("2.정수를 입력하세요");
//		String num_2 =scan.next();
		int intnum1= scan.nextInt();
		int intnum2= scan.nextInt();		
//		int intnum2= Integer.parseInt(num_2);
		int result = (int) (intnum1 > intnum2 ? intnum1 : intnum2 );		
		System.out.println("정수"+intnum1+"\t"+intnum2+"\t"+result);
		scan.close();
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("1.정수를 입력하세요");
//		String num_1 =scan.next();
//		System.out.println("2.정수를 입력하세요");
////		String num_2 =scan.next();
//		int intnum1= scan.nextInt();
//		int intnum2= scan.nextInt();		
////		int intnum2= Integer.parseInt(num_2);				
//		System.out.println("정수"+intnum1+"\t"+intnum2+"\t"+(intnum1 == ));
//		scan.close();


	}

}
