package a18_컬랙션;

import java.util.ArrayList;

import 인터페이스연습.model.User;

public class ArrayListTest2 {

	public static void main(String[] args) {
		/*
		 * ArrayList(userList)
		 * generic : <User>
		 */
		ArrayList<User> userList = new ArrayList<User>();
		
		User user1 = User.builder()               // new(생성자) 사용하면 안됨 !!!!
							.username("aaaa")
							.password("1234")
							.build();
		
		
//		User user1 = new User("aaaa","1234","CCC","cccc@gmail.com");
		User user2 = new User("bbbb","1234","BBB","bbbb@gmail.com");
		User user3 = new User("cccc","1234","CCC","cccc@gmail.com");
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.set(0, User.builder().username("ttt").password("1111").build());
		userList.add(0, User.builder().username("rrr").password("1233").email("rrrr@gmail.com").build());
		
		System.out.println("[회원 아이디 리스트]");
		for(User user : userList) {
			System.out.println(user.getUsername());
		}
		
		System.out.println("[회원 비밀번호 리스트]");
		for(User user : userList) {
			System.out.println(user.getPassword());
		}
		
		System.out.println("[회원 이메일 리스트]");
		for(User user : userList) {
			System.out.println(user.getEmail());
		}
		
		System.out.println("[회원 이름 리스트]");
		for(int i = 0; i < userList.size() ; i++) {
			System.out.println(userList.get(i).getName());
		}
		
		
		
//		System.out.println(userList);
		
	}
}
