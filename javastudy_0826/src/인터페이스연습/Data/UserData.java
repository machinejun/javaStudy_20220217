package 인터페이스연습.Data;

import lombok.Data;
import 인터페이스연습.model.User;
@Data
public class UserData {
	private static UserData instance;
	private User[] users;
	

	
	public UserData(User[] users) {
		this.users = users;
	} // 굳이 이걸 만들 필요가 있나 ????
	
	public static UserData getInstance(User[] users) {
		if(instance == null) {
			instance = new UserData(users);
		}
		return instance;
	} //인스턴스 생성 용
	
	public static UserData getInstance() {
		return instance;
	} //인스턴스 가져다 쓰는 용


	public void showUsers() {
		for(int i=0; i< users.length; i++) {
			if(users[i] == null) {
				continue;
			}
			System.out.println(users[i]);
		}
	}
}
