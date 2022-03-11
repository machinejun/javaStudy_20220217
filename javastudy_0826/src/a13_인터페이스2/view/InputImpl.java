package a13_인터페이스2.view;

import java.util.Scanner;

import a13_인터페이스2.model.User;



public class InputImpl implements Input{  //interface에 추상메서드를 완성시켜주지 않으면 "The type InputImpl must implement the inherited abstract method Input.showInput(Scanner)"  
	@Override
	public char typeSelect(Scanner scanner) { // 명령을 선택 입력후 리턴하는 메서드
		System.out.print("명령을 입력하세요: ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}
	
	@Override
		public User typedUser(Scanner scanner) {
			User user = new User();
			System.out.print("회원아이디: ");
			user.setUsername(scanner.nextLine());
			System.out.print("회원비밀번호: ");
			user.setPassword(scanner.nextLine());
			System.out.print("회원이름: ");
			user.setName(scanner.nextLine());
			System.out.print("회원이메일: ");
			user.setEmail(scanner.nextLine());
			return user;
		}
	@Override
		public String typedUsername(Scanner scanner) {
			System.out.println("[아아디로 회원조회]");
			System.out.println("아이디 입력: ");
			// TODO Auto-generated method stub
			return scanner.nextLine();
		}

}
