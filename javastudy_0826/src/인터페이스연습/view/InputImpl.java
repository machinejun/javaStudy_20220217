package 인터페이스연습.view;

import java.util.Scanner;

import 인터페이스연습.model.User;

public class InputImpl implements Input{
	
	@Override
	public char typedSelect(Scanner scanner) {
		System.out.print("명령을 입력하세요: ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}
	
	@Override
	public User typedUser(Scanner scanner) { //User 객체를 리턴하기 위해서 유저 객체를 생성
		User user = new User();
		System.out.println("[회원 가입]");
		System.out.print("회원 아이디: ");
		user.setUsername(scanner.nextLine());
		System.out.print("회원 비밀번호: ");
		user.setPassword(scanner.nextLine());
		System.out.print("회원 이름: ");
		user.setName(scanner.nextLine());
		System.out.print("회원 이메일: ");
		user.setEmail(scanner.nextLine());
		return user;
	}
	
	@Override
	public String typedUsername(Scanner scanner) {
		System.out.println("[회원아이디로 회원조회");
		System.out.println("회원아이디: ");
		return scanner.nextLine();
	}
}
