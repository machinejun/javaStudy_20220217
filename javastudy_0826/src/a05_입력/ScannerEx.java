package a05_입력;
import java.util.Scanner;  // Scanner 쓸때 import를 사용한다.

public class ScannerEx {

	public static void main(String[] args) {
		Scanner vomit = new Scanner(System.in);
		String str = vomit.next();
		String str1 = vomit.nextLine(); // 띄어쓰기 사용할 경우
//		System.out.println(vomit.next());
//		System.out.println(str);
		
//		int stdCode = vomit.nextInt();
//		System.out.println(stdCode + 10);

		System.out.println(str);
		System.out.println(str1);
		
		vomit.close();
		
		
		
		
	}

}
