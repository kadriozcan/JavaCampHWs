package day5Task.business.concretes;

import day5Task.business.abstracts.UserService;
import day5Task.business.abstracts.ValidationService;
import day5Task.core.SignUpService;
import day5Task.dataAccess.abstracts.UserDao;
import day5Task.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private SignUpService signUpService;
	private ValidationService validationService;

	public UserManager(SignUpService signUpService, UserDao userDao, ValidationService validationService) {
		super();
		this.userDao = userDao;
		this.signUpService = signUpService;
		this.validationService = validationService;

	}

	@Override
	public void signUp(User user) {


		if (validationService.eMailIsVerified(user, userDao.getAllMails()) == true && validationService.firstNameIsVerified(user) == true
				&& validationService.lastNameIsVerified(user) == true
				&& validationService.passwordIsVerified(user) == true) {
			System.out.println("Sifre ve E-mail gecerli. Kayit yapildi: " + user.getFirstName());
			this.userDao.add(user);
			this.signUpService.signUp();
		} else {
			System.out.println("Lutfen gecerli E-mail ve sifre ile tekrar deneyiniz");
		}

	}

	@Override
	public void logIn(User user, String eMail, String password) {
		if (eMail == user.geteMail() && password == user.getPassword()) {
			System.out.println("Bilgiler dogru. Giris yapildi.");
		} else {
			System.out.println("Giris basarisiz. Yanlis email ve sifre girdiniz.");
		}

	}

}
