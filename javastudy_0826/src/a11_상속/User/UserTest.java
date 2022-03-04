package a11_상속.User;

public class UserTest {

	public static void main(String[] args) {
		User user = new PersounalUser();
		user.setUserName("junil");
		user.setPassWord("1234");
		
		System.out.println(user.login("junil", "1234"));

	}

}
