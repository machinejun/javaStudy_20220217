package 인터페이스연습.service;

import 인터페이스연습.model.User;

public interface UserService {
	public void addUser(User user);
	public User[] getUsers();
	public User getUser(String username);
}
