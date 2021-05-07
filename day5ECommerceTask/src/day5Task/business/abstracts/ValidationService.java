package day5Task.business.abstracts;

import java.util.ArrayList;

import day5Task.entities.concretes.User;

public interface ValidationService {
	boolean passwordIsVerified(User user);
	boolean eMailIsVerified(User user, ArrayList<String> emails);
	boolean firstNameIsVerified(User user);
	boolean lastNameIsVerified(User user);
}
