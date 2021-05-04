package oopTask3.Concrete;

import oopTask3.Abstract.PlayerCheckService;
import oopTask3.Entitites.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean verify(Player player) {
		if(player.getFirstName()=="Kadri" && player.getLastName()=="Ozcan") {
			return true;
		} else {
			return false;
		}
	}

}
