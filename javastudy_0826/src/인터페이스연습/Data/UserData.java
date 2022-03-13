package 인터페이스연습.Data;

import 인터페이스연습.model.User;

public class UserData {
	private User[] users;
	
	public UserData() {
		// TODO Auto-generated constructor stub
	}

	
	public UserData(User[] users) {
		super();
		this.users = users;
	}


	public User[] getUsers() {
		return users;
	}


	public void setUsers(User[] users) {
		this.users = users;
	}


	public void showUsers() {
		for(int i =0; i < users.length; i++)
			users[i].showInfo();
	}
}
