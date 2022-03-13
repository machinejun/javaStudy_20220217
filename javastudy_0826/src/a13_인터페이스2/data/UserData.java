package a13_인터페이스2.data;

import a13_인터페이스2.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor


public class UserData {
	private static UserData instance;
	private static User[] users;
	
	private UserData(User[] users) { // 생성자에다가 배열의 주소를 전달받고 있다. -> 생성자가 생성될때 유저배열이 필요하다.
		this.users = users;
	}
	
	public static UserData getInstance(User[] users){
		if(instance == null) { 
			instance = new UserData(users);
			}
		return instance;
	}
	
	public static UserData getInstance() {
		return instance;
	}

	public void showUsers() {
		for(int i=0; i< users.length; i++) {
			if(users[i] == null) {
				continue;
			}
			System.out.println(users[i]);
		}
	}
	
	

}
