package com.oxistudios.blockrunner.blocks;

import com.oxistudios.blockrunner.game.Entity;

public class Block extends Entity{
	
	private int color;
	
	public Block() {
		setIsBlock(1);
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	
	
}
