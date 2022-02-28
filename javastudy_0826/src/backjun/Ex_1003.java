package backjun;

import java.util.Scanner;

public class Ex_1003 {
	
	static int cnt_zero = 0;
	static int cnt_one = 0;
	
	public static int fibonacci(int n) {
		if (n == 0) {
			cnt_zero++;
	        return 0;
	    } else if (n == 1) {
	    	cnt_one++;
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 0;
		
		t = sc.nextInt();
			
		for( int i = 0 ; i < t ; i++) {
			int number = 0;
			cnt_zero = 0;
			cnt_one = 0;

			number = sc.nextInt();
			
			if( number > -1 && number < 41) {
				 fibonacci(number);
				 System.out.println(cnt_zero + " " + cnt_one);
			}
			
		}

	}

}
