package 인터페이스연습1.Data;

import lombok.Data;

import 인터페이스연습1.model.User;

@Data

public class UserData {
	private static UserData instance;
	private User[] users;
	
	public UserData(User[] users) {
		this.users = users;
	}
	
	public static UserData getinstance(User[] users) {
		if(instance == null) {
			instance = new UserData(users);	
		}
		return instance;	
	}
	
	public static UserData getinstance() {
		return instance;
	}
	
	public void showUsers() {
		for(int i =0; i < users.length; i++) {
			if( users[i] == null) {
				continue;
			}
			System.out.println(users[i]);
		}
	}
	

}
