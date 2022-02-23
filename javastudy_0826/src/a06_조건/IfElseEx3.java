package a06_조건;

import java.util.Scanner;

public class IfElseEx3 {

	public static void main(String[] args) {
		/*
		 *  하나의 수를 입력받아 그 수가 홀수 인지 짝수인지를 판별
		 *  하지만 0은 0입니다로 출력
		 *  
		 *  수를 입력해주세요 : □
		 *  
		 *  홀수 입니다.
		 *  짝수 입니다.
		 *  0은 0입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		String result = null;
		
		System.out.print("수를 입력해주세요: ");
		num1 = scanner.nextInt();
		
		
		if ( num1 == 0 ) {
			result = "0";
		} else {
			if ( num1 % 2  == 0) {
				result = "짝수";
			}else {
				result = "홀수";
			}
		}
		System.out.println( result + "입니다.");
		scanner.close();
	}

}
