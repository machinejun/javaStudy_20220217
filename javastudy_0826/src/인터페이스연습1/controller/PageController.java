package 인터페이스연습1.controller;

import java.util.Scanner;

import 인터페이스연습1.model.User;
import 인터페이스연습1.view.Index;
import 인터페이스연습1.view.IndexImpl;
import 인터페이스연습1.view.Input;
import 인터페이스연습1.view.SelectGetUser;
import 인터페이스연습1.view.SelectGetUserImpl;

public class PageController {
	private final Input input;
	
	public PageController(Input input) {
		this.input = input;
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
				
			}else if(select =='2') {
				
			}else if(select == '3') {
				
			}else if(select == 'b') {
				System.out.println("메인메뉴로 돌아갑니다.");
				break;
			}else {
				System.out.println("Error");
			}
		}
		
	}
}
