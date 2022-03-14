package 인터페이스연습.service;

import 인터페이스연습.Data.UserData;
import 인터페이스연습.model.User;

public class AccountServiceImpl implements AccountService{
	private UserData userData;
	
	public AccountServiceImpl() {
		userData = UserData.getInstance();
	}
	
	@Override
	public void printfUserProfile() {
		User[] users = userData.getUsers();
		for(int i =0; i < users.length; i++) {
			if(users[i] == null) {
				continue; 
			}
			System.out.println(users[i]);
		}
	}

}
