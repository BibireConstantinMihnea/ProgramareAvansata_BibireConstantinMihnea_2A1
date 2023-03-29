/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Mihnea
 */
interface Command {
    
    public void executeAddCommand(Catalog catalog, Document document);
    public void executeListCommand(Catalog catalog);
    public void executeSaveCommand(Catalog catalog, String path) throws IOException;
    public void executeViewCommand(File file) throws IOException;
    public void executeReportCommand(Catalog catalog);
}
