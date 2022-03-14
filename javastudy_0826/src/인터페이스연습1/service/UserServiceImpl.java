package 인터페이스연습1.service;

import java.util.Scanner;

import 인터페이스연습1.Data.UserData;
import 인터페이스연습1.model.User;



public class UserServiceImpl implements UserService {
	private final UserData userData;
	private final Scanner scanner;
	
	public UserServiceImpl() {
		scanner = new Scanner(System.in);
		System.out.print("회원 수를 입력하세요: ");
		User[] users = new User[scanner.nextInt()]; // Users[i] 형태의 배열을 만든다.
		this.userData = UserData.getinstance(users);
		
		
	}

	@Override
	public void addUser(User user) {
		User[] users = userData.getUsers();
		for(int i =0; i< users.length; i++) {
			if(users[i] == null) {
				users[i] = user;
				break;
			}
		}
		
	}

	@Override
	public User[] getUsers() {
		// TODO Auto-generated method stub
		return userData.getUsers();
	}

	@Override
	public User getUser(String userName) {
		User[] users = userData.getUsers();
		User user = null;
		for(int i = 0; i<users.length;i++) {
			if( users[i] != null && users[i].getUserName().equals(userName)) {
				user = users[i];
				break;
			}
		}
		
		return user;
	}
	
	@Override
	public User upLike(User users) {
		int like = users.getLike();
		like++;
		users.setLike(like);
		return users;
	}
	
	@Override
	public User downLike(User users) {
		int like = users.getLike();
		like--;
		users.setLike(like);
		return users;
	}
}
