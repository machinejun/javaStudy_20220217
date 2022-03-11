package a10_array;

//선언과 초기화를 동시에 한다. // Test할때 값이 작을 때 한번 씩 사용한다.

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] numArray = {1, 5, 4, 3, 2, 6, 9 }; // INT 자료형 배열을 NumAraay 라는 변수에 선언& 할당한다.
		int[] numArray2 = new int[100];
		
		for( int i = 0 ; i < numArray.length ; i++) {
			System.out.println(numArray[i]);
		}
		
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		

	}

}
