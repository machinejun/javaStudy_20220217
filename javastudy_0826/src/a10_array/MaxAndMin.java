package a10_array;

public class MaxAndMin {

	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		int[] numbers = {10, 30, 2, 5, 8, 21, 16, 14};
		
		max = numbers[0] ;
		min = numbers[0] ;
		
		for(int i = 0; i < numbers.length; i++) {
			if( i == 0) {
				max = numbers[i];
				min = numbers[i];
				continue;
			}
			
			if( max < numbers[i]) {
				max = numbers[i];
			}
			
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최솟값: " + min);
	}

}
