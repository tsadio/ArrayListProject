package com.company;

//This Song class is created to be called and ran in
//the main class
//It has just two String Variables: artist and title
public class Song {

    //Declaration of Variables
    private String artist;
    private String title;

    //Default constructor
    public Song( ) {
    }

    //Overload constructor
    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }


    //Getters and Setters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Display method, to return the artist name and music title
    public String display () {
        return "Artist Name: " + getArtist() + "\nTitle: " + getTitle();
    }

    //toString method return the artist name and music title in a different format
    public String toString () {
        String output = String.format("%-20s %s", getArtist(), getTitle());
        return output;
    }


}
