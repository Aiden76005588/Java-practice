import java.util.Scanner;

public class workshop02_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.숫자를 입력하세요");
		int i =scan.nextInt();		
	
		
		for(int  i1= 1; i1<=100; i1++) {
			if(i1%5 ==0) {
				int sum = i;
				if(i1!=i1) System.out.print("+");
				System.out.print(i1);
			}			
		}		
		System.out.println("=" + i);
		scan.close();

	}

}
