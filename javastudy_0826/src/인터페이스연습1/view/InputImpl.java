package 인터페이스연습1.view;

import java.util.Scanner;

import 인터페이스연습1.model.User;

public class InputImpl implements Input{

	@Override
	public char selectIndex(Scanner scanner) {
		System.out.print("명령을 입력하세요: ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}

	@Override
	public User typeduser(Scanner scanner) {
		User user = new User();
		System.out.println("회원정보를 입력하세요");
		System.out.print("회원아이디: ");
		user.setUserName(scanner.nextLine());
		System.out.print("회원비밀번호: ");
		user.setPassword(scanner.nextLine());
		System.out.print("회원이름: ");
		user.setName(scanner.nextLine());
		return user;
	}
	
	@Override
	public String findUserName(Scanner scanner) {
		System.out.println("[회원아이디로 조회]");
		System.out.print("아이디 검색: ");
		return scanner.nextLine();
	}

	@Override
	public int clickLike() {
		return 0;
	}
	
}
