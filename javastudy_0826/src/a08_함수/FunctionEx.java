package a08_함수;

public class FunctionEx {
	
	public static int calc(int x, int y, int z) {   // int 반환하는 값(result2)가 자료형이다. -> 만약 반환값이 문자열 자료형이면 -> String을 적어주어야한다.
		int result = x + y;							// calc : 함수 이름
		int result2 = result *z;					// (_____) : 사용할 변수 자료형과 변수명
		return result2;
	}

	public static void main(String[] args) {
		
		int r = calc(30, 5, 5);
		System.out.println(r);
		
		System.out.println(calc(30, 5, 5));
		System.out.println(calc(10, 5, 5));
		System.out.println(calc(20, 5, 5));
		System.out.println(calc(40, 5, 5));
		System.out.println(calc(50, 5, 5));

	}

}

/*
 *  자바는 모든 함수가 class로 정의되어 있기 때문에 => 메소드형식
 *  but c언어와 같은 놈들은 함수도 있고 클래스로 정이된 메소드도 있따.
 *   
 * 
 * 
 * 
 */

