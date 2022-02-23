package a06_조건;

import java.util.Scanner;

public class IfElseEx4 {

	public static void main(String[] args) {
		/*
		 * 세 수중에 가장 큰 수를 찾는 문제
		 * 세 수를 입력해 주세요:
		 * 가장 큰수는 _ 입니다.
		 * 세수 모드 같습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		int result = 0;
		
		System.out.print("세 수를 입력하세요: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
//      -----------------------------------------------------------------------------------------------------------------------------------------------------						
//		if ( x == y && y == z) {
//			System.out.println("세 수는 모두 같습니다.");
//		}else {
//			if ( x > y && x > z) {
//				result = x;				
//			}else {
//				if ( x < y && y > z) {
//					result = y;					
//				} else {
//					result = z;					
//				}
//			}
//		}      ------------------------------------------------------ ( 내가 한것 연산이 복잡해 짐 : 초등학생이라고 생각하고 코드 짜자) ----------------------
		
		if ( x == y && y == z) {
			System.out.println("세 수는 모두 같습니다.");
		}else {
			if(x > y) {
				result = x;
			}else {
				result = y;
			}
			
			if( result < z) {
				result = z;
			}
		}
		
		System.out.println("가장 큰 수는" + result + "입니다.");
		sc.close();
		
	}
}
