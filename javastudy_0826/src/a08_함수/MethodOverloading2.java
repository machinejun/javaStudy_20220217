package a08_함수;

import java.util.Scanner;

/*
 * 계산기
 * 입력
 * 첫번째 숫자 입력받고
 * 
 * 사칙연산만 받는다. +,-,*,/
 * 
 * 두번째 숫자 입력받는다.
 * 
 * 결과 출력
 * 정수, 실수 모두 계산 가능해야함
 * 
 * calc();
 */

public class MethodOverloading2 {

	public static double calc(double a, String b, double c) {
		double result = 0;
		switch(b) {
			case "+":
				result = a + c;
				System.out.println("결과: "+result);
				break;
			case "-":
				result = a - c;
				System.out.println("결과: "+result);
				break;
			case "*":
				result = a * c;
				System.out.println("결과: "+result);
				break;
			case "/":
				result = a / c;
				System.out.println("결과: "+result);
				break;
			default:
				System.out.println("error");
				} return result;
	}
	
	
	
	// 실수를 문자열로 변환 Double.toString(result)

	public static void main(String[] args) {
		String b = null;
		double a = 0;
		double c = 0;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계산기: ");
		a = sc.nextDouble();
		b = sc.next();				
		c = sc.nextDouble();
		
		while(true) {
			a = calc(a,b,c);
			b = sc.next();				
			c = sc.nextDouble();
			}	
		}
	}
