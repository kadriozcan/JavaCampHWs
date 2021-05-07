package day5Task.business.concretes;

import day5Task.business.abstracts.EMailService;

public class EMailManager implements EMailService {

	@Override
	public void send() {
		System.out.println("Dogrulama mailiniz gonderilmistir.");
		
	}

	@Override
	public void verify() {
		System.out.println("Mailiniz dogrulanmistir.");
		
	}

}
