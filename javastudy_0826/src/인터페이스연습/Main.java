package 인터페이스연습;


import 인터페이스연습.controller.PageController;
import 인터페이스연습.service.AccountServiceImpl;
import 인터페이스연습.service.UserServiceImpl;
import 인터페이스연습.view.InputImpl;

public class Main { // 프로그램 실행

	public static void main(String[] args) {
		PageController pageController = new PageController(new InputImpl(), new UserServiceImpl(), new AccountServiceImpl() ); // 1. 페이지 컨틀롤러 생성(매개변수 2개, 생성된 주소값(별개로구성된 부품)) 
		pageController.index();
	}

}
