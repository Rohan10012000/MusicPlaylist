package com.jspiders.musicplayer.song;

import java.util.Objects;

public class Song {
	private int id;
	private String songName;
	private String duration;
	private String artist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return   id + ". songName=" + songName + ", duration=" + duration + ", artist=" + artist;
	}
	@Override
	public int hashCode() {
		return Objects.hash(artist, duration, id, songName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(duration, other.duration) && id == other.id
				&& Objects.equals(songName, other.songName);
	}
	public Song(int id, String songName, String duration, String artist) {
		super();
		this.id = id;
		this.songName = songName;
		this.duration = duration;
		this.artist = artist;
	}
	
}
