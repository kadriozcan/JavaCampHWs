package day5Task.business.concretes;

import java.util.ArrayList;

import day5Task.business.abstracts.ValidationService;
import day5Task.entities.concretes.User;

public class ValidationManager implements ValidationService {

	@Override
	public boolean passwordIsVerified(User user) {
		boolean b = false;
		if (user.getPassword().length()>=6) {
			b=true;
		} else {
			b = false;
		}
		return b;
	}

	@Override
	public boolean eMailIsVerified(User user, ArrayList<String> emails) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean b = false;
		if (user.geteMail().matches(regex) && !emails.contains(user.geteMail())) {
			b = true;
		} else {
			b=false;
		}
		return b;
	}

	@Override
	public boolean firstNameIsVerified(User user) {
		boolean b  = false;
		if (user.getFirstName().length()>=2) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	@Override
	public boolean lastNameIsVerified(User user) {
		boolean b  = false;
		if (user.getLastName().length()>=2) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}
	




}
