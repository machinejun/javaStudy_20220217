package backjun;

import java.util.Scanner;

public class Ex_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c, result;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if ( (a > 0 && a < 7) && (b > 0 && b < 7) && (b > 0 && b < 7) ) {
			if( a == b || a==c || b==c) {
				if ( a==b && a==c) {
					result = a;
					System.out.println((10000 + result*1000) + "원");
				}else if ( a == b && a !=c ) {
					result = a;
					System.out.println((1000 + result*100) + "원");
				}else if ( a == c && a != b) {
					result = a;
					System.out.println((1000 + result*100) + "원");
				}else {
					result = b;
					System.out.println((1000 + result*100) + "원");
				}
				
				
				
			}else {
				if( a > b) {
					result = a;
				}else {
					result = b;
				}
				
				if ( result < c) {
					result = c;
				}
				System.out.println((result*100) + "원");
			}
			
			
		}else {
			System.out.println("주사위의 눈은 1~6까지 입니다.");
		}

	}

}
