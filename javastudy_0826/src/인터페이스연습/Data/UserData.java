package 인터페이스연습.Data;

import lombok.Data;
import 인터페이스연습.model.User;
@Data
public class UserData {
	private static UserData instance;
	private User[] users;
	
// compile -> 램에 JVM올린다 -> jvm에서 클래스 loader -> 실행 -> Main을 기준으로 사용되는 모든 class를 static영역에 할당 -> new(생성하는 객체)들은 heap 메모리에 할당
	
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
