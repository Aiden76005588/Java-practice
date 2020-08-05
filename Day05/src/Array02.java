
public class Array02 {

	public static void main(String[] args) {
		//2차원 배열
		//1. 정방향(모든행의 열크기 동일)
		
		//가. 배열 선언
		
		 int[][]num;
		 
		 //나. 배열생성
		 
		 num =new int[2][3]; //2행 3열
		 
		 num[0][0] =10;
		 num[0][1] =20;
		 num[0][2] =30;
		 num[1][0] =40;
		 num[1][1] =50;
		 num[1][2] =60;
		 
//		 System.out.println(num[0][0]);
//		 System.out.println(num[1][0]);
//		 System.out.println(num[0][2]);
		 
		 for(int i =0; i <num.length; i++) {
			 for(int j = 0; j < num[i].length; j++) {
				 System.out.println(num[i][j]);
			 }
		 }
		 
//		 for(int[] i:num) {
//			 for(int j:i) {
//				 System.out.println(j);
//			 }
//		 }
	}

}
