package com.jspiders.musicplayer.operations;
import java.util.Iterator;
import java.util.Scanner;

import com.jspiders.musicplayer.musicpl.MusicPlayer;
import com.jspiders.musicplayer.song.Song;

public class Musicoperations implements MusicOperation{
	
	MusicPlayer m = new MusicPlayer();
	Scanner sc = new Scanner(System.in);  
	@Override
	public void playAll() {
		System.out.println(MusicPlayer.sg.get(0) + " is now playing...");
		for(int i=1; i<MusicPlayer.sg.size(); i++) {
			System.out.println(MusicPlayer.sg.get(i) + ", in queue");
		}
		MusicPlayer.switchchoice();
	}

	@Override
	public void playRandom() {
		int ri = (int) (Math.random() * MusicPlayer.sg.size());
		System.out.println("Random song is playing.." + MusicPlayer.sg.get(ri));
		MusicPlayer.switchchoice();
	}

	@Override
	public void chooseSong() {
		System.out.println(MusicPlayer.sg);
		System.out.println("Enter Song Name: ");
		String st = sc.next();
		int i =0;
		while(i<MusicPlayer.sg.size()) {
			if(MusicPlayer.sg.get(i).getSongName().equals(st) == true) {
				break;
			}
			i++;
		}
		System.out.println(MusicPlayer.sg.get(1-i) + " is now playing...");
		MusicPlayer.switchchoice();
	}

	@Override
	public void addSong() {
	    System.out.println("Enter Id");
		int i = sc.nextInt();
		System.out.println("Enter Song Name: "); 
		String s = sc.next();
		System.out.println("Enter Song Duration: ");
		String d = sc.next();
		System.out.println("Enter Song Singer Name: ");
		String n = sc.next();
		MusicPlayer.sg.add(new Song(i,s,d,n));
		System.out.println("Song is Added ");
		Iterator<Song> z = MusicPlayer.sg.iterator();
		while(z.hasNext()) {
			int x =1;
		     System.out.println(x + " " + " " + z.next());
		     x++;
	    }
		MusicPlayer.switchchoice();
	}

	@Override
	public void removeSong(String st) {
		for(int i=0; i<MusicPlayer.sg.size(); i++) {
			if(MusicPlayer.sg.get(i).getSongName().equals(st)) {
				MusicPlayer.sg.remove(i);
				i--;
			}
		}
		System.out.println(MusicPlayer.sg);
		MusicPlayer.switchchoice();
		
	}

	@Override
	public void editSong() {
		System.out.println("Select Options");
		System.out.println("1.Edit Song Name \n2.Edit Artist Name \n3.Go Back");
		int n = sc.nextInt();
		switch(n) {
		case 1: for(Song i: MusicPlayer.sg) {
						System.out.println(i);
				}
				System.out.print("Enter Song Name: ");
			    String s = sc.next();
			    for(int x = 0; x<MusicPlayer.sg.size(); x++) {
			    	if(MusicPlayer.sg.get(x).getSongName().equals(s)) {
			    		System.out.print("Enter Edited Song Name: ");
			    		String sr = sc.next();
			    	    MusicPlayer.sg.get(x).setSongName(sr);
			    	    System.out.println(MusicPlayer.sg.get(x));
			    	}
			    }
			    break;
		case 2: for(Song i: MusicPlayer.sg) {
					System.out.println(i);
				}
				System.out.print("Enter Artist Name: ");
				String s1 = sc.next();
				for(int x = 0; x<MusicPlayer.sg.size(); x++) {
					if(MusicPlayer.sg.get(x).getArtist().equals(s1)) {
	    		System.out.print("Enter Edited Artist Name: ");
	    		String sr = sc.next();
	    	    MusicPlayer.sg.get(x).setArtist(sr);
	    	    System.out.println(MusicPlayer.sg.get(x));
					}
				}
		case 3: MusicPlayer.switchchoice();
		}
		
	}
	
	
	
}
