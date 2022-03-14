package 인터페이스연습1.view;

import java.util.Scanner;

import 인터페이스연습1.model.User;

public interface Input {
	public char selectIndex(Scanner scanner);
	public User typeduser(Scanner scanner);
	public String findUserName(Scanner scanner);
	public int clickLike();

}
