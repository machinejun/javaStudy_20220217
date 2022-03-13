package 인터페이스연습;

import java.util.Scanner;

import 인터페이스연습.Data.UserData;
import 인터페이스연습.controller.PageController;
import 인터페이스연습.model.User;
import 인터페이스연습.service.UserServiceImpl;
import 인터페이스연습.view.IndexImpl;
import 인터페이스연습.view.InputImpl;

public class Main { // 프로그램 실행

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserData userData = new UserData();
		System.out.print("관리할 회원 수를 입력해주세요:");
		userData.setUsers(new User[scanner.nextInt()]);
		scanner.nextLine();
		
		PageController pageController = new PageController(new InputImpl(), new UserServiceImpl(userData)); // 1. 페이지 컨틀롤러 생성(매개변수 2개, 생성된 주소값(별개로구성된 부품)) 
		pageController.index();

	}

}
