
public class ArrayTest03 {
	public static void main(String[] args) {
		int [][]num= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total =0;
		int h=0;
		
		
		for(int i =0; i<num.length; i++) {
			for(int j =0; j<num[i].length; j++) {
				h++;
				total += num[i][j];
				
			}			
					
	
		 }
		    System.out.println(total);
			System.out.println(total/count);
	
		}
		
		
	}




