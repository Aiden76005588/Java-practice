
public class break01 {
	public static void main(String[] args) {
		int n =1;
		while(n <= 10) {
			System.out.println(n + " Hello World");
			n++;
			if( n== 8 ) break;
		}
		System.out.println(" n값이 8이며 while문 빠져나옴 ");
	}

}
