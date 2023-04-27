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

    public static void main(String[] args) {
        try {
            Database.createConnection();
            var artists = new ArtistDAO();
            artists.create("Pink Floyd");
            artists.create("Michael Jackson");
            Database.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e);
            //Database.rollback();
        }
    }
}
