/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Mihnea
 */
public class Album extends Superclass{
    String artist;
    String genre;
    int release_year;

    public Album(int id, int release_year, String name, String artist, String genre) {
        this.name = name;
        this.id = id;
        this.artist = artist;
        this.genre = genre;
        this.release_year = release_year;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }
    
    @Override
    public String toString() {
       return "Album{" + "name=" + name + ", id=" + id + ", release_year=" + release_year + ", artist=" + artist + ", genre=" + genre + '}';
    }
    
}
