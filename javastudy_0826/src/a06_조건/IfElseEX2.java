package a06_조건;

import java.util.Scanner;

public class IfElseEX2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 두 수 중에 큰 값을 출력하는 프로그램
		 * 두 수를 입력해주세요 : 10 20
		 * 
		 * 두 수중 큰 값은 20 입니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int result = 0;
		
		System.out.print("두 수를 입력하세요: ");
		x = sc.nextInt();
		y = sc.nextInt();
		if( x == y) {
			System.out.println("두수는 같습니다.");
		} else {
			if ( x > y) {
				result = x;
				System.out.println("두 수중 큰 값은 "+ result + "입니다.");
			}else{
				result = y;
				System.out.println("두 수중 큰 값은 "+ result + "입니다.");
			}
//			}else {
//				System.out.println("두 수는 같습니다.");
//			}
		}
		
		
		sc.close();


	}

}
