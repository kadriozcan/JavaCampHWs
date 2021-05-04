package oopTask3.Concrete;

import oopTask3.Abstract.PlayerCheckService;
import oopTask3.Abstract.PlayerService;
import oopTask3.Entitites.Player;

public class PlayerManager implements PlayerService{
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(playerCheckService.verify(player)) {
			System.out.println("Dogrulama basarili "+ player.getFirstName() +  " eklendi.");
		} else {
			System.out.println(player.getFirstName() + " dogrulanamadi, yeniden deneyiniz.");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " adli oyuncu guncellendi");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " adli oyuncu silindi");
	}

}
