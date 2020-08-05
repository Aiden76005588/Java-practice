
public class Sample02_VARIABLE5_1 {
	public static void main(String[] args) {
		//자바는 블럭 scope (자바스크립트는 함수 scope)
		int test = 10;
		{//A블럭
			int num =10;
			
			System.out.println(num);
		}//A블럭
		//System.out.println(num); //블럭밖에서 인식불가
		{//B블럭
			int num=20;
			System.out.println(num);
			System.out.println(test);
		}//B블럭
	}//Main 블럭

}//클래스 블럭
