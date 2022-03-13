package 인터페이스연습.view;

import java.util.Scanner;

import 인터페이스연습.model.User;

public interface Input {
	public char typedSelect(Scanner scanner);
	public User typedUser(Scanner scanner); // User의 대한 정보를 하나로 묶어서 리턴하기 위해서
	public String typedUsername(Scanner scanner);

}
