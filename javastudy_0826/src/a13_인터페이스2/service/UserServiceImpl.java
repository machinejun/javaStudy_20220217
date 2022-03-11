package a13_인터페이스2.service;

import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;

public class UserServiceImpl implements UserService {
	private UserData userData;
	
	public UserServiceImpl(UserData users) {
		this.userData = users;
	}
	
	@Override
	public void addUser(User user) {
		User[] users = userData.getUsers(); // user 배열 주소 가져옴.
		for(int i =0; i<users.length;i++) { // user 배열에 빈 공간이 있으면 user객체를 배열에 저장하겠다.
			if(users[i] == null) {
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
		User[] users = userData.getUsers();
		User user = null;
		for(int i =0 ; i < users.length; i++) {
			if(users[i] != null && users[i].getUsername().equals(username)) {
				user = users[i];
				break;
			}
		}
		
		return null;
	}
	

}
