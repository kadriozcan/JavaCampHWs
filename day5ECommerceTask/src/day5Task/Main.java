package day5Task;

import day5Task.business.abstracts.EMailService;
import day5Task.business.abstracts.UserService;
import day5Task.business.concretes.EMailManager;
import day5Task.business.concretes.UserManager;
import day5Task.business.concretes.ValidationManager;
import day5Task.core.JGoogleRegistrationManagerAdapter;
import day5Task.core.MyRegistrationManager;
import day5Task.dataAccess.concretes.HibernateUserDao;
import day5Task.entities.concretes.User;

public class Main {
	public static void main(String[] args) {

		User kadri = new User(1, "Kadri", "Ozcan", "kadri@gmail.com", "123kadri123");
		User ali = new User(1, "ali", "veli", "aveli@gmail.com", "123veli123");

		UserService userService = new UserManager(new MyRegistrationManager(), new HibernateUserDao(),
				new ValidationManager());

		UserService userServiceGoogle = new UserManager(new JGoogleRegistrationManagerAdapter(), new HibernateUserDao(),
				new ValidationManager());

		EMailService eMailService = new EMailManager();

		userService.signUp(kadri);
		eMailService.send();
		eMailService.verify();

		System.out.println("-----------------------");

		userServiceGoogle.signUp(ali);
		eMailService.send();
		eMailService.verify();
		
		System.out.println("--------------------");
		
		userService.logIn(kadri, "kad@gmail.com", "123kadri123");
		userService.logIn(ali, "aveli@gmail.com", "123veli123");

	}
}
