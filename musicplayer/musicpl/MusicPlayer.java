package com.jspiders.musicplayer.musicpl;

import java.util.Scanner;

import com.jspiders.musicplayer.operations.MusicOperation;
import com.jspiders.musicplayer.operations.Musicoperations;
import com.jspiders.musicplayer.song.Song;

import java.util.ArrayList;
import java.util.Iterator;



public class MusicPlayer{
	public static ArrayList<Song> sg = new ArrayList<Song>();
	private static Scanner sc = new Scanner(System.in);
		public static void switchchoice() {
			MusicOperation m = new Musicoperations(); 
		System.out.println("=====Menu=====");
		System.out.println("1.Play Song  \n2.Add/Remove Song  \n3.Edit Song \n4.Exit");
		int ch = sc.nextInt(); 
		switch(ch) {
		case 1: System.out.println("====Play Songs=====");
		        System.out.println("1.Play All Song \n 2.Play Random Song \n 3.Choose To Play \n 4.Go Back");
		        int ch1 = sc.nextInt();
		        switch(ch1) {
		        case 1:  m.playAll(); break;
		        case 2:  m.playRandom(); break;
		        case 3:  m.chooseSong(); break;
		        case 4:  switchchoice(); break;
		        case 5:  System.out.println("Enter Valid Option");
		        } break;
		case 2: System.out.println("====Add/Remove Song=====");
                System.out.println("1.Add Song \n2.Remove Song \n3.Go Back");
                int ch2 = sc.nextInt();
                switch(ch2) {
                case 1:  m.addSong();
                         break;
                case 2:  Iterator<Song> z = sg.iterator();
                         if(z.hasNext()== false) {
                        	 System.out.println("Playlist is empty!!");
                        	 switchchoice();
                         }
        		         while(z.hasNext()) {
        			     System.out.println(z.next());
        		         }
        		         System.out.println("Enter Song Name: ");
                	     String st = sc.next();
                	     m.removeSong(st); 
                	     break;
                case 3:  switchchoice(); break;
                case 4:  System.out.println("Enter Valid Option");
                } break;
		case 3: m.editSong(); break;
		case 4: break;
		default: System.out.println("Enter valid choice"); switchchoice();
		}
	}
	public static void main(String[] args) {
//		ArrayList<Song> sg = new ArrayList();
		sg.add(new Song(1, "Tum he ho", "3min", "Arjit Singh"));
		sg.add(new Song(2, "Tum se hi", "5min", "Mohit Chauhan"));
		sg.add(new Song(3, "Stay", "2min", "Justine Bieber"));
		sg.add(new Song(4, "Sunflower", "3min", "Post Melano"));
		sg.add(new Song(5, "Light Swithch", "4min", "Charlie Puth"));
		switchchoice();
		
	}
}
