
public class StringTest {

	public static void main(String[] args) {
		// 1.new사용
		String s= new String("hello");
		String s2 = new String("hello");
		System.out.println(s==s2);
		boolean result =s.equals(s2);//내용비교
		System.out.println(result);
		
		
		//2.
		String n =  "hello";
		String n2 = "hello";
		System.out.println(n==n2);
		System.out.println(n.equals(n2));

	}

}
