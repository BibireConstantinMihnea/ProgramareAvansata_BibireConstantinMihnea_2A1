/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab8;

import java.sql.SQLException;

/**
 *
 * @author Mihnea
 */
public class Main {

    /*
    CREATE TABLE genres ( id serial PRIMARY KEY, name VARCHAR (50) NOT NULL);
    CREATE TABLE artists ( id serial PRIMARY KEY, name VARCHAR (50) NOT NULL);
    CREATE TABLE albums ( id serial PRIMARY KEY, release_year INTEGER NOT NULL, title VARCHAR (100) NOT NULL, artist VARCHAR (100) NOT NULL, genres VARCHAR (100) NOT NULL);
    CREATE TABLE album_genres ( album_id INTEGER, genre_id INTEGER, PRIMARY KEY (album_id, genre_id), CONSTRAINT fk_album FOREIGN KEY(album_id) REFERENCES albums(id), CONSTRAINT fk_genre FOREIGN KEY(genre_id) REFERENCES genres(id));
     */
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        Database db = new Database();
        try {
            db.createConnection();
            var artists = new ArtistDAO();
            artists.create("Pink Floyd");
            artists.create("Michael Jackson");
            var genres = new GenreDAO();
            genres.create("Rock");
            genres.create("Funk");
            genres.create("Soul");
            genres.create("Pop");
            db.getConnection().commit();
            var albums = new AlbumDAO();
            albums.create(1979, "The Wall", "Pink Floyd", "Rock");
            albums.create(1982, "Thriller", "Michael Jackson", "Funk,Soul,Pop");
            Database.getConnection().commit();
            System.out.println(albums.albumList);
            db.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e);
            //Database.rollback();
        }

    }
}
