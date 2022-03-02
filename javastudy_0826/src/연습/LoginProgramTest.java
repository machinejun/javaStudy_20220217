package 연습;

import java.util.Scanner;

public class LoginProgramTest {

	public static void main(String[] args) {
		String id = null;
		String ps = null;
		
		LoginProgram loginProgram = new LoginProgram();
		loginProgram.setId("abcd");
		loginProgram.setPassword("abcd1234");
		loginProgram.setProvider("naver");
		loginProgram.setEtc("홍길동의 계정정보");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id를 입력하세요");
		id = sc.next();
		System.out.print("password를 입력하세요");
		ps = sc.next();
		loginProgram.login(id,ps);

	}

}
