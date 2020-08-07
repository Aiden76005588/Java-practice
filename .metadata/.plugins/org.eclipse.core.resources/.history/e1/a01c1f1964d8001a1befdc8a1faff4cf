import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		// "aa/bb/cc" ==> / 구분자로 값을 반환
		String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz";
		
		StringTokenizer st = new StringTokenizer(data, "/ ,");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		//1. String의 split()
		String [] d = data.split("/");
		for (String s : d) {
			System.out.println(s);
		}
		

	}

}
