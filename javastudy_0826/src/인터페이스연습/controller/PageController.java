package 인터페이스연습.controller;

import java.util.Scanner;

import 인터페이스연습.model.User;
import 인터페이스연습.service.AccountService;
import 인터페이스연습.service.AccountServiceImpl;
import 인터페이스연습.service.UserService;
import 인터페이스연습.view.Index;
import 인터페이스연습.view.IndexImpl;
import 인터페이스연습.view.Input;
import 인터페이스연습.view.SelectGetUser;
import 인터페이스연습.view.SelectGetUserImpl;


public class PageController {

	private final Input input;
	private final UserService userService;
	private final AccountService accountService; 
	
	
	public PageController(Input input, UserService userService, AccountService accountService) { // index, input으로 업캐스팅 된 주소값이 들어온다. 
		                                                                       // pagecontroller가 생성되는 시점에 값이 주입된다.
		this.input = input;
		this.userService = userService;
		this.accountService = accountService;
		
	}
	
	
	public void index() {
		Index index = new IndexImpl();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			index.show();
			char select = input.typedSelect(scanner);
			if(select == '1') {
				User user = input.typedUser(scanner); // 리턴값 = user
				userService.addUser(user);
			}else if( select == '2') { // 회원조회
				selectGetUser();
			}else if( select == 'q') {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("해당명령은 실행할 수없습니다.");
			}
		}
		
	}
	
	public void selectGetUser() {
		SelectGetUser selectGetUser = new SelectGetUserImpl(); 
		Scanner scanner = new Scanner(System.in);
		while(true) {
			selectGetUser.show();
			char select = input.typedSelect(scanner);
			
			if(select == '1') {
				User[] users = userService.getUsers(); // user 개열 객체 들고오기
				for(int i =0; i < users.length; i++) {
					if(users[i] == null) { // 
						continue;
					}
					users[i].showInfo();
				}
				System.out.println("-----------------------------------------------------");
				accountService.printfUserProfile();
				
			}else if(select == '2') {
				String username = input.typedUsername(scanner);
				User user = userService.getUser(username);
				if(user==null){ // 실행시 null포인트가 되면 오류발생 방지
					System.out.println("해당아이디로 회원 정보를 조회할 수 없습니다.");
				}else {
					user.showInfo();
				}
				
			}else if(select == 'b') {
				System.out.println("메인메뉴로 이동");
				break;
			}else {
				System.out.println("해당명령은 실행할 수없습니다.");
			}
			
		}
		
	}

}
