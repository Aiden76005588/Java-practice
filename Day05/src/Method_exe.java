
public class Method_exe {
	public void sum(int num1, int num2) {
		System.out.println("sum()호출========");
		int result = num1 + num2;
		System.out.println(result);
	}

//	public void sub(int num1, int num2) {
//		System.out.println("sub()호출=========");
//		int result = num1 - num2;
//		System.out.println(result + "\nsub()결과===========");
//	}
//
//	public void mux(String num1, int num2) {
//		System.out.println("mux()호출");
//		int result = Integer.parseInt(num1) * num2;
//		System.out.println(result + "\nmux()결과");
//	}
//
//	public void div(int num1, int num2) {
//		System.out.println("div호출");
//		int result = num2 / num1;
//		System.out.println(result + "\ndiv결과");
//	}
//
//	public void printArr(String[] arr) {
//		System.out.println("printArr호출");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//
//	public void printArr(String[][] arr) {
//		System.out.println("pppt호출");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++)
//				System.out.println(arr[i][j]);
//		}
//	}

	public static void main(String[] args) {
		System.out.println("main시작=============");
		int a = 10;
		int b = 20;
		Method_exe test = new Method_exe();
		test.sum(a, b);// 호출
//		System.out.println(result);
//		test.sub(a, b);
//		test.mux("10", b);
//		test.div(a, b);
//
//		String[] name = { "홍길동", "유관순" };
//		test.printArr(name);
//
//		String[][] name2 = { { "홍길동", "유관순" }, { "이순신" } };
//		test.printArr(name2);

		System.out.println("main종료=============");

	}

}
