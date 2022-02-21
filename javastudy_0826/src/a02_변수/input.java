package a02_변수;
import java.util.Scanner;


public class input {

	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if( A > 0 && B < 10) {
			int total = A + B;
			System.out.println(total);
			
		}else {
			System.out.println("잘못된 계산식입니다.");
		}
	
		sc.close();
	}

}
