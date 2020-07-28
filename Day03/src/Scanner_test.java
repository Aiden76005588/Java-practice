import java.util.Scanner;

public class Scanner_test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.이름을 입력하세요");
		String num_1 =scan.next();
		System.out.println("2.나이를 입력하세요");
//		String num_2 =scan.next();
		int intnum1= Integer.parseInt(num_1);
		int intnum2= scan.nextInt();
		
//		int intnum2= Integer.parseInt(num_2);
		int result = intnum1+intnum2;
		
		System.out.println(intnum1+"\t"+intnum2+"\t"+result);
		scan.close();
	}

}
