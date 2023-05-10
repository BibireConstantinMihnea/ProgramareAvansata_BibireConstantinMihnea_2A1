/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Mihnea
 */
public class AlbumRepository {

    private EntityManager em;

    public List<Album> findAll() {
        return em.createNamedQuery("Album.findAll")
                .getResultList();
    }

    public List<Album> findByTitle(String title) {
        return em.createNamedQuery("Album.findByTitle")
                .setParameter("title", title)
                .getResultList();
    }

    public List<Album> findByArtist(Artist artist) {
        return em.createNamedQuery("Album.findByArtist")
                .setParameter("artist", artist)
                .getResultList();
    }
    
    public List<Album> findByGenre(Genre genre) {
        return em.createNamedQuery("Album.findByGenre")
                .setParameter("genre", genre)
                .getResultList();
    }
    
}
