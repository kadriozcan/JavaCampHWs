package oopTask3.ConsoleUI;

import oopTask3.Concrete.CampaignManager;
import oopTask3.Concrete.GameManager;
import oopTask3.Concrete.PlayerCheckManager;
import oopTask3.Concrete.PlayerManager;
import oopTask3.Concrete.SellingManager;
import oopTask3.Entitites.Campaign;
import oopTask3.Entitites.Game;
import oopTask3.Entitites.Player;

public class Main {
	
	public static void main(String[] args) {
		
		Game gta5 = new Game(1, "Gta5", 120);
		Game aoe2 = new Game(2, "Age of Empires 2", 20);
		
		GameManager gameManager = new GameManager();
		gameManager.add(gta5);
		gameManager.add(aoe2);
		
		System.out.println("--------");
		
		Player kadri = new Player(1, "Kadri", "Ozcan", 1985, 2861499108L);
		Player ali = new Player(2, "Ali", "Veli", 2005, 45874585478L);
		

		
		Campaign campaign = new Campaign(1, "Yilbasi Kampanyasi", "5 ay");
		
		CampaignManager campaignManager = new CampaignManager();
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		SellingManager sellingManager = new SellingManager();
		
		
		
		playerManager.add(kadri);
		playerManager.update(kadri);
		playerManager.add(ali);
		
		System.out.println("---------------");
		
		campaignManager.add(campaign);
		
		System.out.println("---------------");
		
		sellingManager.sell(gta5, kadri);
		sellingManager.sell(aoe2, ali, campaign);
	}
	
}
