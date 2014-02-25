package com.oxistudios.blockrunner;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class SaveFile {
	
	public int chosen;
	public int highScore;
	public int level;
	public int money;
	
	private String[] fileStrings;
	private String readString;
	private FileHandle file;
	
	public SaveFile() {
		load();
	}
	
	private void load() {
		
		if(!Gdx.files.local("saveBR.save").exists()) {
			file = Gdx.files.local("saveBR.save");
		}else{
			file = Gdx.files.local("saveBR.save");
			readString = file.readString();
			fileStrings = readString.split(",");
			
			chosen    = Integer.parseInt(fileStrings[0]);
			highScore = Integer.parseInt(fileStrings[1]);
			level     = Integer.parseInt(fileStrings[2]);
			money     = Integer.parseInt(fileStrings[3]);
			
		}
		
	}
	
	public void save() {
		file.writeString(Integer.toString(chosen) + ",", false);
		file.writeString(Integer.toString(highScore) + ",", true);
		file.writeString(Integer.toString(level) + ",", true);
		file.writeString(Integer.toString(money) + ",", true); 
	}

}
