package 연습;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();

		if (n > 0 && n < 101) {
			int a[] = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int max = a[0];
			int num = 0;
			for( int i = 1; i < a.length ; i++) {
				if(a[i]>max) {
					max = a[i];
					num = i+1;
				}
			}
			System.out.println(max);
			System.out.println(num);	
		}
	}
}
