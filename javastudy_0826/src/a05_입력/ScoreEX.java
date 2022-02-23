package a05_입력;

import java.util.Scanner;

public class ScoreEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력해 주세요 : ");
		int score = sc.nextInt();
		String grade = null;
		
		grade = score >-1 && score < 101 ? 
					score > 89 ? "A":
						score > 79 ? "B":
							score > 69 ? "C" :
								score > 59 ? "D":
									score >0 ? "F" : null:
										null;
								
		System.out.println("학생의 평점은 " + grade + "등급 입니다.");
		
		sc.close();
		


	}

}
