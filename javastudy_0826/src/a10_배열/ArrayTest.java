package a10_배열;

/**
 * 배열(Array)
 * 연관된 데이터를 하나의 변수에 그룹핑해서 관리하는 기법
 * 1학년 1반 ( 1 ~ 30 )
 * 
 * 자료형[] 배열변수명 = new 자료형[갯수]  // 여기에서 갯수는 1부터 시작임
 * int[] numbers = new int[5]; 일반 자료형 array 선언
 * User[] users = new User[3]; 참조 자료형도 가능
 * 
 */

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		numbers[1] = 100;
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println("갯수: " + i);
			System.out.println(numbers[i]);
		}
		System.out.println("*************************************");
		
		/*
		 * String 배열 10개의 공간 생선
		 * 가나다라마바사자자차카
		 * 
		 */
		String[] hangul = new String[10];
		hangul[0] = "가";
		hangul[1] = "나";
		hangul[2] = "다";
		hangul[3] = "라";
		hangul[4] = "마";
		hangul[5] = "바";
		hangul[6] = "사";
		hangul[7] = "자";
		hangul[8] = "차";
		hangul[9] = "카";
		
		for (int i = 0; i < hangul.length ; i++ ) {
			System.out.println(hangul[i]);
		}
		

	}

}
