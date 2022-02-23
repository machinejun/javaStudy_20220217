package a05_입력;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*
		 * 세 수를  입력 받는다
		 * 10
		 * 20
		 * 30
		 * 
		 * 세 수의 합 60
		 * 세 수를 다시 입력:
		 * 
		 * 세 수를 입력하세요: 5 2 1
		 * 세 수의 곱 10
		 * 
		 * 세 수를 입력하세요 50 2 2
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int total = 0;
		int X_total= 0;
		int retain = 0;
		
		
		System.out.println("세 수를 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		total = num1 + num2 + num3;
		
		System.out.println("세 수의 합: " + total);
		System.out.println();
		
		System.out.print("세 수를 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		X_total = num1 * num2 * num3;
		
		System.out.println("세 수의 곱: " + X_total);
		System.out.println();
		
		System.out.print("세 수를 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		retain = (num1 * num2) % num3;
		
		System.out.println("앞의 두수의 곱에 세번쨰 수로 나눈 나머지: " + retain);
		sc.close();
		
	}

}
