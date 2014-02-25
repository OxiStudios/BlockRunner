package com.oxistudios.blockrunner.game;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.oxistudios.blockrunner.BRGame;

public class Physics {
	
	private BRGame game;
	private World world;
	private Vector2 gravity;

	public Physics(BRGame game) {
		this.game = game;
		//still need to set this
		gravity = new Vector2();
		world = new World(gravity, false);
		makeWorld();
	}
	
	private void makeWorld() {
		
	}
	
	public void update() {
		
	}

 }
