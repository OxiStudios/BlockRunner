package com.oxistudios.blockrunner.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.oxistudios.blockrunner.BRGame;
import com.oxistudios.blockrunner.littleguy.LittleGuy;

public class World {
	
	public SpriteBatch spriteBatch;
	
	public LittleGuy player;
	public Physics physics;
	
	private BRGame game;

	public World(BRGame game) {
		this.game = game;
		game.currentScore = 0;
		
		spriteBatch = new SpriteBatch();
		
		player = new LittleGuy(game.saveFile.chosen);
		physics = new Physics(game);
	}
	
	public void render() {
		spriteBatch.begin();
		
		player.render(spriteBatch);
		
		spriteBatch.end();
	}
	
	public void update() {
		physics.update();
	}

}
