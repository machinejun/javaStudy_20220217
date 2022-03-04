package a10_array;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] numArray = {1, 5, 4, 3, 2, 6, 9 }; // 선언과 초기화를 동시에 한다. // Test할때 값이 작을 때 한번 씩 사용한다.
		int[] numArray2 = new int[100];
		
		for( int i = 0 ; i < numArray.length ; i++) {
			System.out.println(numArray[i]);
		}
		
		

	}

}
