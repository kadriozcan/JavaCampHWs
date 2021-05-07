package day5Task.dataAccess.abstracts;

import java.util.ArrayList;

import day5Task.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	ArrayList<String> getAllMails();
}
