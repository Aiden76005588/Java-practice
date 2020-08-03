package workshop_total;

public class ArrayTest01 {
int[] arr = {10,20,30,40,50};//멤버변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest01 arrTest= new ArrayTest01();//멤버사용을 위해 객체생성
		int [] arr = arrTest.arr;//객체의 배열을 저장
		int sum = 0;
//		
//		for(int i = 0; i<arr.length; i++) {
//			sum += arr[i];			
//		}
//		System.out.println("합계"+sum);
//		System.out.println("평균"+sum/arr.length);	
		PrintArr test = new PrintArr();
		sum = test.print(arr);//함수 호출, 합계산 변환
		System.out.println("sum=" + sum);
		System.out.println("avg=" + sum/arr.length );
		
		
	}
}
