package day5Task.core;

public class JGoogleRegistrationManagerAdapter implements SignUpService {

	@Override
	public void signUp() {
		System.out.println("Google ile kayit olundu.");
	}
	
}
