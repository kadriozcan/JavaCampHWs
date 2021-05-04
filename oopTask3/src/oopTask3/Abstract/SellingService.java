package oopTask3.Abstract;

import oopTask3.Entitites.Campaign;
import oopTask3.Entitites.Game;
import oopTask3.Entitites.Player;

public interface SellingService {
	void sell(Game game, Player player);
	void sell(Game game, Player player, Campaign campaign);
}
