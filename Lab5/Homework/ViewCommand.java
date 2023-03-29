/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Mihnea
 */
public class ViewCommand implements Command{
    
     @Override
     public void executeViewCommand(File file)
                throws IOException{
             Desktop desktop = Desktop.getDesktop();
             desktop.open(file);
    }

    @Override
    public void executeListCommand(Catalog catalog) {
        throw new UnsupportedCommandException("Invalid command.");
    }

    @Override
    public void executeSaveCommand(Catalog catalog, String path) throws IOException {
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
