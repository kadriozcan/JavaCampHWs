package oopTask3.Concrete;

import oopTask3.Abstract.GameService;
import oopTask3.Entitites.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adli oyun sisteme eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " adli oyun sistemden silindi.");
		
	}



}
