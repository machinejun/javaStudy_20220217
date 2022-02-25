package a07_반복.quiz;

import java.util.Scanner;

public class Quiz_star4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		N = sc.nextInt();
		
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < i; j++) {				
				System.out.print(" ");
			}
			for(int j = 0; j <N-i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}		

	}

}
		
//		for(int i = 0 ; i < N; i++) {
//			for(int j = 0; j < N; j++) {
//				if(j >= i) {
//				System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}		
//
//	}
//
//}
