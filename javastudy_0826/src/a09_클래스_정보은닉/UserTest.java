package a09_클래스_정보은닉;

public class UserTest {

	public static void main(String[] args) {
		User user = new User("aaa","1234","manjun","aaa@gmail.com");
//		user.setUsername("aaa");
//		user.setPassword("1234");
//		user.setName("manjun");
//		user.setEmail("aaa@gmail.com");
		
		System.out.println("아이디: " + user.getUsername());
		System.out.println("비밀변호: " + user.getPassword());
		System.out.println("이름: " + user.getName());
		System.out.println("e-mail: "+ user.getEmail());

	}

}
