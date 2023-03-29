/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

import java.io.File;

/**
 *
 * @author Mihnea
 */
public class ListCommand implements Command {
    
    @Override
    public void executeListCommand(Catalog catalog){
        if(catalog.docs.isEmpty()) throw new EmptyCatalogException("No documents in catalog.");
        System.out.println("Catalog{" + "name=" + catalog.name + ", docs=" + catalog.docs + '}');
    }

    @Override
    public void executeSaveCommand(Catalog catalog, String path) {
        throw new UnsupportedCommandException("Invalid command.");
    }

    @Override
    public void executeViewCommand(File file) {
        throw new UnsupportedCommandException("Invalid command.");
    }

    @Override
    public void executeAddCommand(Catalog catalog, Document document) {
        throw new UnsupportedCommandException("Invalid command.");
    }

    @Override
    public void executeReportCommand(Catalog catalog) {
        throw new UnsupportedCommandException("Invalid command.");
    }

   
}
