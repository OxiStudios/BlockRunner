package com.oxistudios.blockrunner.screens;

import com.badlogic.gdx.Screen;
import com.oxistudios.blockrunner.BRGame;
import com.oxistudios.blockrunner.game.World;

public class GameScreen implements Screen{
	
	private BRGame game;
	private World world;

	public GameScreen(BRGame game) {
		this.game = game;
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		world.update();
		world.render();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(world == null) {
			world = new World(game);
		}
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
