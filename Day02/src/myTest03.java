
public class myTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int n2 = 20;
		//값 변경 코드 구현
		int n3 = n2;
		n2 = n;
		n = n3;		
		
		
		System.out.println("n값은 " + n);
		System.out.println("n2값은 " + n2);
		
	}

}
