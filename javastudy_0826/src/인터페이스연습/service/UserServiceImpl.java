package 인터페이스연습.service;

import 인터페이스연습.Data.UserData;
import 인터페이스연습.model.User;

public class UserServiceImpl implements UserService{
	private final UserData userData;
	
	public UserServiceImpl(UserData userData) {
		this.userData = userData;
		
	}
	
	@Override
	public void addUser(User user) {
		User[] users = userData.getUsers();
		for(int i =0; i <users.length; i++) {
			if(users[i] == null ) {
				users[i] = user;
				break;
			}
		}
	}

	@Override
	public User[] getUsers() {
		return userData.getUsers();
	}

	@Override
	public User getUser(String username) {
		// 반복문을 사용해서 배열에 들어있는 user객체들 중에서 
		// 매개변수(우리가 찾고자하는 username)을 가진 user객체를 return한다.
		User[] users = userData.getUsers();
		User user = null;
		
		for(int i = 0; i<users.length; i++) {
			if(users[i] != null && users[i].getUsername().equals(username)) {
				user = users[i];
				break;
			}
		}
		return user;
	}

}
