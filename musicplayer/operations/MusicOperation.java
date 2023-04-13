package com.jspiders.musicplayer.operations;


public interface MusicOperation {
	public void playAll();
	public void playRandom();
	public void chooseSong();
	public void addSong();
	public void removeSong(String st); 
	public void editSong();
}
