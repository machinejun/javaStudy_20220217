package a08_함수;

import java.util.Scanner;

public class OddandEven {
	
	public static boolean oddAndEven(int a) {
		if( a % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		int a = 0 ,b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 3개를 입력하세요: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.print(a +" = ");
		System.out.println(oddAndEven(a) ? "짝" : "홀");
		System.out.print(b +" = ");
		System.out.println(oddAndEven(b) ? "짝" : "홀");
		System.out.print(c +" = ");
		System.out.println(oddAndEven(c) ? "짝" : "홀");
		
		
		
		
		

	}

}
