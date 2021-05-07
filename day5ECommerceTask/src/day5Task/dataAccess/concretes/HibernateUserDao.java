package day5Task.dataAccess.concretes;

import java.util.ArrayList;

import day5Task.dataAccess.abstracts.UserDao;
import day5Task.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile veritabanina eklendi : " + user.getFirstName());
		users.add(user);

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getAllMails() {
		ArrayList<String> emails = new ArrayList<String>();

		for (User user : users) {
			emails.add(user.geteMail());
		}
		return emails;
	}

}
