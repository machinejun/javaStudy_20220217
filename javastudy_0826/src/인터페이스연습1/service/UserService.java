package 인터페이스연습1.service;

import 인터페이스연습1.model.User;

public interface UserService {
	public void addUser(User user);
	public User[] getUsers();
	public User getUser(String userName);
	public void upLike(User user);
	public void downLike(User user);
}
