/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab5;

import java.io.IOException;

/**
 *
 * @author Mihnea
 */
public class Lab5 {

    public static void main(String[] args) throws IOException {
        Lab5 app = new Lab5();
        app.testCreateSave();
        app.testLoad();
    }

    private void testCreateSave() throws IOException {
        Catalog catalog = new Catalog("MyDocuments");
        var book = new Document("article1");
        var article = new Document("book1");
        catalog.add(book);
        catalog.add(article);
        CatalogUtil.save(catalog, "E:/PA/catalog.json");
    }

    private void testLoad() throws IOException {
        CatalogUtil.load("E:/PA/catalog.json");
    }
}
