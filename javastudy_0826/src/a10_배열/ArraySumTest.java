package a10_배열;

public class ArraySumTest {

	public static void main(String[] args) {
		/*
		 *  numbers 정수 배열 1001 개의 공간 생성
		 *  1 ~ 1000 까지를 넣는다
		 *  
		 *  1 ~ 1000까지 출력
		 *  1 ~ 1000까지 더한 수를 출력
		 *  
		 *  
		 */
		
		int[] numbers = new int[1001];
		
		for( int i = 0; i<1000;i++) {
			numbers[i] = 1 + i;	
		}
		
		for( int i = 0; i<1001;i++) {
			numbers[1000] += numbers[i];
			System.out.println(numbers[i]); 
		}	
	}
}
