package com.niyeronsin;

public class Main {

    public static void main(String[] args) {
	    Song mysong1 = new Song("Adekunle Gold","Orente", "Afro Pop", "4.5");
        Song mysong2 = new Song("Chelsea","Rested","Soul", "4");
        Song mysong3 = new Song("Ronale","Love", "RandB", "5");
        Song mysong4 = new Song("Boseman","The Universe", "Rap", "1");

        Playlist list = new Playlist("Solo");
        System.out.println(list.getName());
        list.setName("Nevada");
        System.out.println(list.getName());
        list.addSong(mysong3);
        list.addSong(mysong2);
        list.addSong(mysong4);
        list.addSong(mysong1);
        list.printPlaylist();
        list.playPlaylist();
        list.remove("Ronale", "Love");
        list.printPlaylist();
    }
}
