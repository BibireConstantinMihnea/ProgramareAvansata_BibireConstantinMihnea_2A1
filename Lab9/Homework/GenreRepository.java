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
public class GenreRepository {
    private EntityManager em;

    public List<Genre> findById(int id) {
        return em.createNamedQuery("Genre.findById")
                .setParameter("id", id)
                .getResultList();
    }
    
    public List<Genre> findByName(String name) {
        return em.createNamedQuery("Genre.findByName")
                .setParameter("name", name)
                .getResultList();
    }
}
