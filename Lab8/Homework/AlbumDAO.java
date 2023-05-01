/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihnea
 */
public class AlbumDAO {
    public List<Album> albumList = new ArrayList<>();

    public void create(int release_year, String name, String artist, String genre) throws SQLException {
        int id;
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into albums (release_year, title, artist, genres) values (?,?,?,?)")) {
            pstmt.setInt(1, release_year);
            pstmt.setString(2, name);
            pstmt.setString(3, artist);
            pstmt.setString(4, genre);
            pstmt.executeUpdate();
        }
        catch(SQLException ex){
            System.err.println(ex);
        }
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(
                "select id from albums where title='" + name + "'")) {
            id = rs.next() ? rs.getInt(1) : null;
        }
        Album album = new Album(id, release_year, name, artist, genre);
        albumList.add(album);
    }

    public Album findByName(String name) throws SQLException {
        int data;
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(
                "select id from albums where title='" + name + "'")) {
            data = rs.next() ? rs.getInt(1) : null;
        }
        for(Album album : albumList){
            if(album.id == data){
                System.out.println(album);
                return album;
            }
        }
        return null;
    }

    public Album findById(int id) throws SQLException {
        String data;
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(
                "select title from albums where id='" + id + "'")) {
            data = rs.next() ? rs.getString(1) : null;
        }
        for(Album album : albumList){
            if(album.name.compareTo(data) == 0){
                System.out.println(album);
                return album;
            }
        }
        return null;
    }
    
    public void importData(String path) throws SQLException{
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "COPY albums(release_year, title, artist, genres) FROM '" + path +"' DELIMITER ',' CSV HEADER;")){
            pstmt.executeUpdate();
        }
        catch(SQLException ex){
            System.err.println(ex);
        }
    }
            
}
