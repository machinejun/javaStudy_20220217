package a08_함수;

import java.util.Scanner;

public class MethodEx4 {

	public static void printStar1(int num) {
		System.out.println();
		if (num < 1) {
			System.out.println("별의 개수는 1개 이상을 입력하세야 합니다.");
		} else {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num - i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i * 2) + 1; j++) {
					System.out.print("*");
				}

				System.out.println();
			}
		}
	}

	public static void printStar2(int num) {
		System.out.println();
		if (num < 1) {
			System.out.println("별의 개수는 1개 이상을 입력하세야 합니다.");
		} else {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if (j <= i) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}

	public static void printStar3(int num) {
		System.out.println();
		if (num < 1) {
			System.out.println("별의 개수는 1개 이상을 입력하세야 합니다.");
		} else {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void printStar4(int num) {
		System.out.println();
		if (num < 1) {
			System.out.println("별의 개수는 1개 이상을 입력하세야 합니다.");
		} else {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if (j <= i) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}

	}

	public static void printStar5(int num) {
		System.out.println();
		if (num < 1) {
			System.out.println("별의 개수는 1개 이상을 입력하세야 합니다.");
		} else {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if (j < num - i - 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		/*
		 * method 명 printStar ( 입력받은 별의 개수) 기능 = 1 보다 작은 수가 들어왔을 때는 -> 별의 개수는 1개 이상을
		 * 입력하셔야 합니다. 1. 반복횟수 입력 : 10 별찍기 모양 선택(1 ~ 5) 만약 1 ~ 5 안들어 왔다 => 계속 정상적인 값이
		 * 들어올때까지 계속 입력받기 정상적인 값이 들어왔을 때에는 해당 별찍기를 실행
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int star_Type = 0;
		boolean flag = true;
		
		System.out.print("별의 갯수를 입력하세요: ");
		number = sc.nextInt();

		while (flag) {
			System.out.print("별 모양 형태를 선택하세요(1 ~ 5): ");
			star_Type = sc.nextInt();
			
			
			switch (star_Type) {
			case 1:
				printStar1(number);
				flag = false;
				break;

			case 2:
				printStar2(number);
				flag = false;
				break;

			case 3:
				printStar3(number);
				flag = false;
				break;

			case 4:
				printStar4(number);
				flag = false;
				break;

			case 5:
				printStar5(number);
				flag = false;
				break;

			default:
				System.out.println("다시입력하세요");	
			}
		}
	}
}
