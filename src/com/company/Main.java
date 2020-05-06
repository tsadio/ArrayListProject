/**
 * This program is to input artist name and music title
 * First, create an ArrayList of new Song object
 * Prompt the user to enter artist name and music title
 * Declare and initialize String variables to save artists name and music titles
 * set the artist name and music title for each artist and add the Song in the ArrayList
 * With a for loop, output the content of the ArrayList using display method of Song
 * Create a String variable titleToFind and initialize to a title to find
 * use a for loop to check the content of the ArrayList if the title exist, display.
 */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();
        Scanner in = new Scanner (System.in);
        System.out.println("You will have to enter three Artists and their Music Title.");
        for (int i = 1; i <= 3;i++){
            System.out.println("Enter the " + i + " Artist Name: ");
            String artist = in.nextLine();
            System.out.println("Enter the artist " + i + " music Title: " );
            String title = in.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song temp: songs){
            System.out.println(temp.display());
        }
        System.out.println();

        System.out.printf("%-20s %s", "Artists Name: ", "Music Title: ");
        System.out.println();
        for (Song temp: songs) {
            System.out.println(temp.toString());
        }
        System.out.println();

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song temp: songs){
            if (temp.getTitle().equals(titleToFind)){
                System.out.println("I found this Artist: " );
                System.out.println(temp.display());
            }
        }
    }
}