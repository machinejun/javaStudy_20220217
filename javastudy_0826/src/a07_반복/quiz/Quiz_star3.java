package a07_반복.quiz;

import java.util.Scanner;

public class Quiz_star3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		N = sc.nextInt();
		
		if( N > 0 && N < 101) {	
			for(int i = 0 ; i < N; i++) {
				for(int j = 0; j < N-i-1; j++) {
					System.out.print(" ");
				}	
				for( int j =0 ; j < i+1; j++)	{
					System.out.print("*");
					
				}
				System.out.println();
			}
		}
	}
}
