package a07_반복.quiz;

import java.util.Scanner;

public class Quiz_star3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		N = sc.nextInt();
		
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(j < N-i-1) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}		
	}

}
