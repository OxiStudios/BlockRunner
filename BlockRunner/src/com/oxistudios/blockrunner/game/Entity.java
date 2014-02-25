package com.oxistudios.blockrunner.game;

import com.badlogic.gdx.math.Vector2;

public class Entity {
	
	Vector2 position;
	
	private int isBlock;
	
	public Entity() {
		position = new Vector2();
	}
	
	public void updatePosition(Vector2 position) {
		this.position = position;
	}
	
	public int isBlock() {
		return isBlock;
	}
	
	public void setIsBlock(int i) {
		isBlock = i;
	}

}
