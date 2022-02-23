package a06_조건;

import java.util.Scanner;

public class IfElseEx5 {

	public static void main(String[] args) {
		/*
		 * 점수를 입력받아서 해당 점수가 몇등급인지 출력하는 문제
		 * 
		 * 점수를 입력해주세요: 85
		 * 
		 * 학생의 평점은 B학점 입니다.
		 * 
		 * 점수는 0~100 사이만 입력이 가능 그외의 값이 들어왔을 때는 0~100사이만 입력이 가능합니다. 출력
		 * 
		 * 90 ~ 100 A
		 * 80 ~ 89 B
		 * 70 ~ c
		 * 60 ~ d
		 * 50 < F
		 */
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String result = null;

		System.out.print("점수를 입력하세요: ");
		score = sc.nextInt();

		if (score < -1 && score > 101) {
			System.out.println("점수는 0 ~ 100 사이만 입력이 가능합니다.");
		} else {
			if (score > 89) {
				result = "A";
			} else if (score > 79) {
				result = "B";
			} else if (score > 69) {
				result = "C";
			} else if (score > 59) {
				result = "D";
			} else {
				result = "F";
			}

			System.out.println("학생의 평점은 " + result + " 입니다.");
		}
	}
}
