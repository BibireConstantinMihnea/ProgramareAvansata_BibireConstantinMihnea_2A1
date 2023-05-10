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
public class ArtistRepository {
    private EntityManager em;

    public List<Artist> findById(int id) {
        return em.createNamedQuery("Artist.findById")
                .setParameter("id", id)
                .getResultList();
    }
    
    public List<Artist> findByName(String name) {
        return em.createNamedQuery("Artist.findByName")
                .setParameter("name", name)
                .getResultList();
    }
}
