package 인터페이스연습1.controller;

import java.util.Scanner;

import 인터페이스연습1.model.User;
import 인터페이스연습1.service.UserService;
import 인터페이스연습1.view.ChoseLike;
import 인터페이스연습1.view.ChoseLikeImpl;
import 인터페이스연습1.view.Index;
import 인터페이스연습1.view.IndexImpl;
import 인터페이스연습1.view.Input;
import 인터페이스연습1.view.SelectGetUser;
import 인터페이스연습1.view.SelectGetUserImpl;

public class PageController {
	private final Input input;
	private final UserService userService;
	
	public PageController(Input input, UserService userService) {
		this.input = input;
		this.userService = userService;
		// TODO Auto-generated constructor stub
	}
	
	public void index() {
		Index index = new IndexImpl();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			index.showIndex();
			char select = input.selectIndex(scanner);
			if(select == '1') {
				User user= input.typeduser(scanner);
				userService.addUser(user);
			}else if(select =='2') {
				selectGetUser();
			}else if(select =='q'){
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("Error");
			}
		}
	}
	
	public void selectGetUser() {
		SelectGetUser selectGetUser = new SelectGetUserImpl();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			selectGetUser.show();
			char select = input.selectIndex(scanner);
			if(select == '1') {
				User[] user = userService.getUsers();
				for(int i = 0; i < user.length; i++) {
					if(user[i] == null) {
						continue;
					}
					System.out.println(user[i]);
				}
				System.out.println("------------------------------------");
			}else if(select =='2') {
				String username = input.findUserName(scanner);
				User user = userService.getUser(username);
				if( user == null) {
					System.out.println("해당 아이디를 찾을수가 없습니다.");
				}else {
					System.out.println(user);
				}
				
			}else if(select == '3') {
				like();
			}else if(select == 'b') {
				System.out.println("메인메뉴로 돌아갑니다.");
				break;
			}else {
				System.out.println("Error");
			}
		}
		
	}
	
	public void like() {
		ChoseLike choseLike = new ChoseLikeImpl();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			choseLike.show();
			char select = input.selectIndex(scanner);
			String username = input.findUserName(scanner);
			User user = userService.getUser(username);
			
			if(select == '1') {
				if( user == null) {
					System.out.println("해당아이디를 찾을수 없습니다.");
				}else {
					User a = userService.upLike(user);
					System.out.println(a.getName()+": 좋아요("+a.getLike()+")");
				}
			}else if(select == '2') {
				if( user == null) {
					System.out.println("해당아이디를 찾을수 없습니다.");
				}else {
					User a = userService.downLike(user);
					System.out.println(a.getName()+": 좋아요("+ a.getLike()+")");
				}
			}else if(select =='3') {
				if( user == null) {
					System.out.println("해당아이디를 찾을수 없습니다.");
				}else {
					System.out.println(user.getName()+": 좋아요("+user.getLike()+")");
				}
			}else if(select =='b') {
				System.out.println("뒤로가기"); // 왜 뒤로가기하면 findUserName이 출력이 되는 걸까 ?
				break;
			}else {
				System.out.println("Error");
			}
			
		}

	}
}
