/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework5;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Mihnea
 */
public class Homework5 {

    public static void main(String[] args) throws IOException {
        AddCommand add = new AddCommand();
        ListCommand list = new ListCommand();
        SaveCommand save = new SaveCommand();
        ViewCommand view = new ViewCommand();
        ReportCommand report = new ReportCommand();
        Catalog catalog = new Catalog("MyDocuments");
        var book = new Document("book1");
        book.setTitle("War and Peace");
        var article = new Document("article1");
        article.setTitle("How to create a java class");
        add.executeAddCommand(catalog, book);
        add.executeAddCommand(catalog, article);
        save.executeSaveCommand(catalog, "G:/PA/catalog.json");
        list.executeListCommand(catalog);
        File file = new File("G:/PA/catalog.json");
        view.executeViewCommand(file);
        report.executeReportCommand(catalog);
    }
}
