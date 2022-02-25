package backjun;

import java.util.Scanner;

public class Ex_10871 {

	public static void main(String[] args) {
		/*
		 *  정수 N  개로 이루어진 수열 A , 정수 X 가 주어진다.
		 *  A에서 X보다 작은 수를 출력하는 프로그램
		 *  
		 *  N >= 1 , X <= 10000
		 *  둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
		 *  주어지는 정수는 모두 1보다 크고 10000보다 작다
		 *  순서대로 출력한다
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int amount = 0;
		int mark = 0;
		
		
		System.out.print("수열의 갯수와 기준을 입력하세요: ");
		amount = sc.nextInt();
		mark = sc.nextInt();
		int arr[] = new int[amount];
		
		for( int i = 0 ; i < amount; i++ ) {
			arr[i] = sc.nextInt();
			
		}
		sc.close();
		
		for( int i = 0 ; i < amount; i++) {
			if( arr[i] < mark) {
				System.out.print(arr[i] + " ");
			}
		}
		

	}

}
