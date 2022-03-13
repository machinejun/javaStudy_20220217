package a13_인터페이스2.service;

import java.util.Scanner;

import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;

public class UserServiceImpl implements UserService {
	private UserData userData;
	private final Scanner scanner;
	
	public UserServiceImpl() {
		scanner = new Scanner(System.in);
		System.out.println("관리할 회원의 수를 입력해주세요: "); 
		User[] users = new User[scanner.nextInt()];
		this.userData= userData.getInstance(users); // User[크기 = 회원수] 입력받는다. 크기지정 & 생성된 배열을 UserData 객체의 users 배열 변수에 set하는 것
		scanner.nextLine(); // 위의 nextInt()후에 버퍼에 저장된 엔터 날려주기
		this.userData = userData.getInstance(users);
		scanner.nextLine();
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
