package a03_연산자;

public class Operation02 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		System.out.println(num1 + (num2++)); // sysout + ctrl + space
		System.out.println(num2);
		
		// 2 * 1 = 2
		/*
		 *  정수형 변수  dan = 2
		 *               num = 1
		 *               result = dan * num
		 */
		
		int dan, num, result;
		dan = 1; num = 2;
		result = dan * num;
		System.out.println(dan + " X " + num + " = " + result);
		
		int year = 2022;
		int month = 2;
		int day = 21;
		
		// 증감연산자를 사용하여 2023y 3m 22d 출력
		
		System.out.println((++year) + "년 "+ (++month) + "월 " + (++day) + "일"  );
		
	}

}
