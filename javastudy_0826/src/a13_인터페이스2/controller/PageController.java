package a13_인터페이스2.controller;

import java.util.Scanner;

import a13_인터페이스2.model.User; // import (단축키) =  ctrl + shift + o
import a13_인터페이스2.service.AccountService;
import a13_인터페이스2.service.UserService;
import a13_인터페이스2.view.Index;
import a13_인터페이스2.view.IndexImpl;
import a13_인터페이스2.view.Input;
import a13_인터페이스2.view.SelectGetUser;
import a13_인터페이스2.view.SelectGetUserImpl;


public class PageController {
	
	private final Input input;
	private final UserService userService;
	private final AccountService accountSerive;

	
	public PageController( Input input, UserService userService, AccountService accoutService) { // 업캐스팅된 주소값들이 들어옴
		
		this.input=input;
		this.userService = userService;
		this.accountSerive = accoutService;
		
	}
	
	public void index() {
		Index index = new IndexImpl();
		
		Scanner sc = new Scanner(System.in);
		while(true) { // 메인루프
			index.show();// 메뉴화면 계속 출력
			char select = input.typeSelect(sc);
			//메뉴 조건
			if(select == '1') { // 회원가입
				User user = input.typedUser(sc);// user 객체 생성 및 객체 데이터 삽입
				userService.addUser(user); // user 추가
				
			}else if(select == '2') {// 회원조회
				selectGetUser();
			}else if(select == 'q') {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("해당 명령은 실행할 수 없습니다.");
			}
			System.out.println();
		}	
	}
	
	public void selectGetUser() {
		SelectGetUser selectGetUser = new SelectGetUserImpl();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			selectGetUser.show();
			char select = input.typeSelect(scanner);
			if(select == '1') {
				String username = input.typedUsername(scanner);
				User user = userService.getUser(username);
				if(user == null) {
					System.out.println("해당아이디로 회원정보를 조회할 수 없습니다.");
				}else {
					System.out.println(user);
				}
						
			}else if(select == '2') {
				User[] users = userService.getUsers();
				for(int i = 0; i < users.length; i++ ) { // user배열에 들어있는 user객체 정보를 전부 출력
					if(users[i] == null) { // user 배열 인덱스에 user객체가 없으면 user객체  user.showUser 메서드를 호출할수 없기 때문에 continue로 넘김 
						continue;
					}
					System.out.println(users[i]); // 해당 배열에 user 객체가 존재하지 않기 때문에 user 정보를 출력
				}
			}	
			else if(select == 'b') {
				System.out.println("메인 메뉴로 이동");
			}else {
				System.out.println("해당 명령은 실행할 수 없습니다.");
			}
			System.out.println();
		}
	}

	private void typedUser(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

}

