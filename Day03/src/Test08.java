import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수를 입력하세요");
		String name =scan.next();
		int k2 = Integer.parseInt(name);
		System.out.println("2.정수 입력하세요");
		String age =scan.next();		
		int k = Integer.parseInt(age);		
		System.out.println("정수"+name+"과 "+"정수 "+age+" 의 합계 :"+(k+k2));		
		scan.close();

	}

}
