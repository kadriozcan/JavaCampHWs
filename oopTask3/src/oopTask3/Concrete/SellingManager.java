package oopTask3.Concrete;

import oopTask3.Abstract.SellingService;
import oopTask3.Entitites.Campaign;
import oopTask3.Entitites.Game;
import oopTask3.Entitites.Player;

public class SellingManager implements SellingService {

	@Override
	public void sell(Game game, Player player) {
		System.out.println(game.getName() + " adli oyun " + player.getFirstName() + "'a satildi");

	}

	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		System.out.println(game.getName() + " adli oyun " + player.getFirstName() + " \'a satildi. " + campaign.getName()
				+ " adli kampanyadan yararlanildi.");

	}

}
