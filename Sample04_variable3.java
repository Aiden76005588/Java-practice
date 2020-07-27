
public class Sample04_variable3 {
	public static void main(String[] args) {
		char c = 'A';
 		char c2 = '홍';
 		char c3 = '\uD64D';
 		System.out.println(c+""+c2+""+c3);
 		System.out.println("aaa\tbbb");
 		System.out.println("aaa\nbbb");
 		System.out.println("aaa\'bbb");
 		System.out.println("aaa\"bbb");
 		System.out.println("aaa\\bbb");
 		
 		short s = 10;
 		short s2 = 20;
// 		short s3 = s +s2;
 		int s3 = s+s2;
 		System.out.println(s3);
 		
 		int n = 10;
 		short n2 = (short)n;
 		System.out.println(n2);
 		
 		short x =10;
 		short x2 =20;
 		short x3 = (short) (x + x2);
 		System.out.println(x3);
 		
// 		short x4 =(short) x + x2;
 		
 		byte b =10;
 		short b2 =b;
 		int b3 =b2;
 		long b4 = b3;
 		float b5 = b4;
 		double b6 = b5;
 		
// 		//2. char --> int
// 		char n = 'A';
// 		int n2 = n+1;
// 		System.out.println(n2);
// 			
 				
 		
 		String k = "10";
 		System.out.println(k+20);
 		int k2 = Integer.parseInt(k);//문자 정수 int전환 **중요**
 		System.out.println(k2+20);
 		
 		System.out.println(String.valueOf(10)+10);
 		
 		int p = 100;
 		double p2 =3.14;
 		double p3=p+p2;
 		System.out.println(p3);
 		
 		
	}

}
