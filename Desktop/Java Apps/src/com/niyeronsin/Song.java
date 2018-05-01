package com.niyeronsin;

public class Song {
    private String artistName;
    private String songName;
    private String genre;
    private String duration;
    private int likes;

    public Song(String artistName, String songName, String genre, String duration) {
        this.artistName = artistName;
        this.songName = songName;
        this.genre = genre;
        this.duration = duration;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
