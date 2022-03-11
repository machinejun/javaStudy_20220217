package a08_함수;

import java.util.Scanner;

public class SumMethodEx {
	public static void printInput( int a, int b, int c, int d) {
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
	}
	
	
	
	public static int sum(int a, int b, int c, int d) {
		int result = 0;
		result = a + b + c +d;
			
		return result;
	}

	public static void main(String[] args) {
		int a= 0,b =0, c=0, d=0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.println("total: " + sum(a,b,c,d));
		
			

	}

}
