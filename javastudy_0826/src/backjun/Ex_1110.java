package backjun;

import java.util.Scanner;

public class Ex_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int init = 0;
		int N = 0;
		int cycle = 0;
		
		init = sc.nextInt();
		N = init;
		
		if ( init > -1 && init < 100) {
			while(true) {
				N = (N % 10)*10 + ((N/10) + (N%10))%10;
				cycle++;
				
				if( N == init) {
					break;
				}
			}
			System.out.println(cycle);
			}else {				
			System.out.println("잘못된 숫자입니다.");
		}
	}
}
