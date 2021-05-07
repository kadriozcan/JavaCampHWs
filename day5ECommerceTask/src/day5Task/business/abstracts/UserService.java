package day5Task.business.abstracts;

import day5Task.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void logIn(User user, String eMail, String password);
}
