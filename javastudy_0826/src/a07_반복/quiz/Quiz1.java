package a07_반복.quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * 1. N을 입력을 받는다.
		 * 2. N은 100000 보다 작은 자연수이다.
		 * 2. 1 ~ N 까지 출력을 한다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		num = sc.nextInt();
		
		if( num < 100000 && num > 0 ) {	
			for ( int i = 0 ; i < num ; i++) {			
				
				System.out.println(num -i);
			}
		}else {
			System.out.println("잘못된 수입니다.");
		}

	}

}
