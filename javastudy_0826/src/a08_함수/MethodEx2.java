package a08_함수;

import java.util.Scanner;

public class MethodEx2 {
	/*
	 * 1. 입력을 받는다. num = 숫자입력 2. 홀수면 홀수 입니다. 출력 3. 짝수면 짝수 입니다. 출력 4. 0이면 0입니다. 출력
	 */

	public static int calculate(int num) {  // 메소드의 이름은 그 동작을 나타낼수 있는 이름으로 짓는 것이 보기 편함
		int result = 0;
		
		result = num % 2;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = sc.nextInt();
		
		if (number != 0) {
			switch (calculate(number)) {
			case 0:
				System.out.println("짝수입니다.");
				break;
			case 1:
				System.out.println("홀수입니다.");
			}
		}else {
			System.out.println("0 입니다.");

		}
	}
}



