package 인터페이스연습1;

import 인터페이스연습1.controller.PageController;
import 인터페이스연습1.service.UserServiceImpl;
import 인터페이스연습1.view.InputImpl;

public class Main {

	public static void main(String[] args) {
		PageController pageController = new PageController(new InputImpl(), new UserServiceImpl());
		pageController.index();
	}

}
