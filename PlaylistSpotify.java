/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classandobjectspotify;
import java.util.ArrayList;
/**
 *
 * @author Carissa Amanda
 */

public class PlaylistSpotify {
    public static void main (String[] args){
        Music music1 = new Music ("Bruno Mars", "Talking To The Moon");
        Music music2 = new Music ("NCT Dream", "Like We Just Met");
        Music music3 = new Music ("One Direction", "Right Now");
        
        Spotify spotify = new Spotify();
        spotify.addMusic (music1);
        spotify.addMusic (music2);
        spotify.addMusic (music3);
        
        spotify.displayMusics();
    }
}

class Music {
    private String song;
    private String singer;
    
    public Music (String song, String singer){
        this.song = song;
        this.singer = singer;
    }
    
    public String getSong(){
        return song;
    }
    
    public String getSinger(){
        return singer;
    }
}

class Spotify {
    private ArrayList <Music> musics;
    
    public Spotify(){
        this.musics = new ArrayList<>();
    }
    
    public void addMusic (Music music){
        musics.add (music);
    }
    
    public void displayMusics(){
        System.out.println ("My Playlist: ");
        for (Music music : musics){
            System.out.println ("Song: " + music.getSinger() + " by " + music.getSong());
        }
    }
}

