package backjun;

import java.util.Scanner;

public class Ex_1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		int r1 = 0;
		int r2 = 0;
		int T = 0;
		double result = 0;
		double s = 0;
		
		T = sc.nextInt();
		for (int i = 0 ; i < T ; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			
			
			s = Math.pow((x2-x1),2) + Math.pow((y2-y1), 2);
			result = Math.sqrt(s);
			
			if ( result == 0 && r1 == r2) {
				System.out.println("-1");
			}else if( r2 - r1 < result && r1 + r2 > result){
				System.out.println('2');
			}else if( r2 - r1 == result || r1 + r2 == result){
				System.out.println('1');
			}else {
				System.out.println('0');
			}
		}
	}
}
