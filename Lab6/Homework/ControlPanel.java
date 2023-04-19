/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mihnea
 */
public class ControlPanel extends JPanel {

    final MainFrame frame;
    JButton exitBtn = new JButton("Exit");
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");
    JButton resetBtn = new JButton("Reset");
    JButton exportBtn = new JButton("Export");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        setLayout(new GridLayout(1, 4));
        add(exitBtn);
        add(loadBtn);
        add(saveBtn);
        add(resetBtn);
        add(exportBtn);
        exitBtn.addActionListener(this::exitGame);
        loadBtn.addActionListener(this::loadGame);
        saveBtn.addActionListener(this::saveGame);
        resetBtn.addActionListener(this::resetGame);
        exportBtn.addActionListener(this::exportGame);
    }

    private void exitGame(ActionEvent e) {
        frame.dispose();
    }

    private void loadGame(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void saveGame(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void resetGame(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void exportGame(ActionEvent e) {
        File file = new File("export.png");
        System.out.println("saving....");
        try {
            ImageIO.write(frame.canvas.image, "png", file);
        } catch (IOException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("saved!");
    }

}
