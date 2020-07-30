
public class ArrayTest {
	public void printArr(int[] recive) {// ()안에 받을 인자 타입, 변수
		System.out.println("printArr====호출");
		for (int i = 0; i < recive.length; i++) {
			System.out.println(">>" + recive[i]);
		}
	}

	public void printForEach(int[] recive_2) {
		for(int x : recive_2) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		// 1. 배열 선언
		// 데이터타입[] 변수명;
		System.out.println("main 수행============");
		ArrayTest test = new ArrayTest();
		int[] num;
		// 2.배열 생성
		// 변수명=new 데이터타입[크기];
		num = new int[3];
		// 3.배열 초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;

		int[] num_1;
		// 2.배열 생성
		// 변수명=new 데이터타입[크기];
		num_1 = new int[3];
		// 3.배열 초기화
		num_1[0] = 10;
		num_1[1] = 20;
		num_1[2] = 30;
		test.printArr(num); // 함수 호출 및 값 전달
		test.printArr(num_1);// 함수 호출 및 값 전달
		System.out.println("main 수행============");

		test.printForEach(num_1);
	}

}
