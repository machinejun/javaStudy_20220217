package a06_조건;

import java.util.Scanner;

public class IfElseEx7_backjun {

	public static void main(String[] args) {
		/*
		 * 윤년 구분하기
		 * 1. 연도를 입력받기
		 * 2. 1 ~ 4000 까지 범위 제한하기
		 * 3. 4의 배수 체크하기
		 * 4. 
		 */
		Scanner sc = new Scanner(System.in);		
		int year = 0;
		
		System.out.print("연도를 입력하세요: ");
		year = sc.nextInt();
		
		if (year < 0 || year > 4000) {
			System.out.println("계산할 수 없는 연도입니다.");
		}else {
			if ( year % 4 == 0) {
				if(year % 100 != 0 || year % 400 == 0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else {
				System.out.println("0");
			}
		}
	}
}

