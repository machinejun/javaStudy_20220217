package a07_반복;

import java.util.Scanner;

public class GugudanInput {

	public static void main(String[] args) {
		/*
		 * 1. 몇단 부터 몇단 까지 출력할 것인지 입력받는다
		 * start index : 5
		 * end index : 8
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int start_dan, end_dan;
		
		System.out.print("start index: ");
		start_dan = sc.nextInt();
		System.out.print("end index: ");
		end_dan = sc.nextInt();
		System.out.println();
		
		for (int i= start_dan; i < end_dan +1 ; i++) {
			System.out.println(i +"단");
			for (int j=0; j<9; j++) {
				System.out.println(i+" X "+(++j)+" = "+(i*j));				
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------");
		
		int i = start_dan;
		int j = 0;
		while(i<end_dan +1) {

			System.out.println(i + "단");
			j = 0;
			while(j<9) {
				System.out.println();
			}
			System.out.println(i +"X" + (++j) + "=" + (i*j));
			i++;
		}
	}
}
