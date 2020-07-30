
public class Array_multi {
	public static void main(String[] args) {
		//2차원배열
		//2.비정방향(모든행의 열크기 동일)
		
		int[][]num= new int [2][]; //2행
		
		num[0] = new int[3];
		num[1] = new int[2];
		
		//초기화
		num[0][0] =10;
		num[0][1] =20;
		num[0][2] =30;
		num[1][0] =40;
		num[1][1] =50;
		
		for(int i =0; i <num.length; i++) {
			 for(int j = 0; j < num[i].length; j++) {
				 System.out.println("num["+i+"]["+j+"] ="+num[i][j]);
			 }
		 }
		
		for( int[]is:num) {
			for(int x :is) {
				System.out.println(x);
				
			}
		}
	}

}
