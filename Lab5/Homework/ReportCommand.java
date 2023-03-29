/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.awt.Desktop;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihnea
 */
public class ReportCommand implements Command {

    @Override
    public void executeReportCommand(Catalog catalog) {
        Configuration cfg = new Configuration();
        try {
            cfg.setDirectoryForTemplateLoading(new File(ReportCommand.class.getResource("/templates").toURI()));
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace();
        }
        try {
            Template template = cfg.getTemplate("report.ftl");

            Map<String, Object> data = new HashMap<String, Object>();
            data.put("title", "HTML Report");

            data.put("documents", catalog.docs);

            Writer file = new FileWriter(new File("G:/PA/report.html"));
            template.process(data, file);
            file.flush();
            file.close();
            
            File report = new File("G:/PA/report.html");
            Desktop desktop = Desktop.getDesktop();
             desktop.open(report);

        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
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
    public void executeViewCommand(File file) throws IOException {
        throw new UnsupportedCommandException("Invalid command.");
    }

    @Override
    public void executeAddCommand(Catalog catalog, Document document) {
        throw new UnsupportedCommandException("Invalid command.");
    }

}
