/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Mihnea
 */
public class SaveCommand implements Command{
    
    @Override
    public void executeSaveCommand(Catalog catalog, String path)
            throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(
                new File(path),
                catalog);
    }

    @Override
    public void executeListCommand(Catalog catalog) {
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
