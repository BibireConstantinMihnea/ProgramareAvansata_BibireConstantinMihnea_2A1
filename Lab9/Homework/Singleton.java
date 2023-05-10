/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;

import com.github.javafaker.Faker;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mihnea
 */
public class Singleton {
    
    public void insertAlbum(){
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("lab9PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Faker faker = new Faker();
        Artist artist = new Artist(faker.rockBand().name());
        Genre genre = new Genre(faker.music().genre());
       Album album = new Album(faker.number().numberBetween(1960, 2023), faker.book().title(), artist, genre);
        em.persist(artist);
        em.persist(genre);
        em.persist(album);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
