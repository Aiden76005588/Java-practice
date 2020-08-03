package workshop_total;

public class PrintArr {
	private double avg;
	int sum;
	int length;
	public int print(int[] arr) {		
		for( int i =0; i<arr.length; i++) {
			sum+= arr[i];
			}
		length =arr.length;
		return sum;
	}
	
	public double getAvg() {
		return sum/length;
	}	
	
}



