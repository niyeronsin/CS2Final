package com.niyeronsin;

public class Playlist {
    private String name;
    private Song currSong;
    private Song head;
    private Song tail;

    public Playlist(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
        this.currSong = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printPlaylist(){
        Song iterSong = this.head;
        int i = 1;
        while(iterSong != null) {
            System.out.println(i + ". " + iterSong.getSongName() + " by " + iterSong.getArtistName());
            i++;
            iterSong = iterSong.getNextSong();
        }
    }

    public void playPlaylist(){
        if (this.head == null) {
            System.out.println("Playlist titled " + this.name + " is empty.");
        }
        else {
            this.currSong = this.head;
            this.playSong();
        }
    }

    private void playSong(){
        if (this.currSong == null) {
            System.out.println("Error playing song");
        }
        else {
            System.out.println(this.currSong.getSongName() + " by " + this.currSong.getArtistName() + " is playing");
        }
    }

    public void addSong(Song newSong){
        Song temp;
        if (newSong == null) {
            System.out.println("Error adding song.");
            return;
        }
        if (this.head == null) {
            this.head = newSong;
            this.tail = newSong;
            this.currSong = newSong;
            System.out.println(newSong.getArtistName() + " by " + newSong.getSongName() + " has been added to the playlist");
        }
        else {
            temp = this.tail;
            temp.setNextSong(newSong);
            newSong.setPrevSong(temp);
            this.tail = newSong;
            System.out.println(newSong.getArtistName() + " by " + newSong.getSongName() + " has been added to the playlist");
        }
    }
    public void remove(String artistName, String songName){
        Song iterSong = this.head;
        while(iterSong != null) {
            if (iterSong.getSongName().equals(songName) & iterSong.getArtistName().equals(artistName)) {
                if (iterSong == this.head) {
                    iterSong.getNextSong().setPrevSong(null);
                    this.head = iterSong.getNextSong();
                }
                else if (iterSong == this.tail) {
                    iterSong.getPrevSong().setNextSong(null);
                    this.tail = iterSong.getPrevSong();
                }
                else {
                    iterSong.getPrevSong().setNextSong(iterSong.getNextSong());
                    iterSong.getNextSong().setPrevSong(iterSong.getPrevSong());
                }
                System.out.println(iterSong.getArtistName() + " by " + iterSong.getSongName() + " has been removed from the playlist");
                return;
            }
            iterSong = iterSong.getNextSong();
        }
        System.out.println("Error removing song from playlist");
    }
    public void playNextSong(){
        if (this.currSong == this.tail) {
            System.out.println("You have reached the end of the playist");
        }
        else {
            this.currSong = this.currSong.getNextSong();
            this.playSong();
        }
    }

    public void playPrevSong(){
        if (this.currSong == this.head) {
            System.out.println("You have reached the beginning of the playist");
        }
        else {
            this.currSong = this.currSong.getPrevSong();
            this.playSong();
        }
    }
    public void replaySong(){
        this.playSong();
    }
}
