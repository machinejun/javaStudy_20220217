package a06_조건;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		/*
		 * score = 85
		 * 90 ~ 100
		 * 80 ~ 89
		 * 70 ~ 79
		 * 60 ~ 69
		 * 0 ~ 59
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		System.out.print("점수를 입력하세요: ");
		score = sc.nextInt();
		
		if( score < -1 && score > 101) {
			System.out.println("잘못된 점수입니다.");
		}else {		
			switch(score / 10) {
				case 10 :
				case 9 :
					System.out.println("A");
					break;
				case 8 :
					System.out.println("B");
					break;
				case 7 :
					System.out.println("C");
					break;
				case 6 :
					System.out.println("D");
					break;
				default :
					System.out.println("F");
					break;
			}
		}

		}
	}


