/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Mihnea
 */
public class MainFrame extends JFrame{
     FileChooser fc;

    public MainFrame() {
        super("Choose CSV file");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        fc = new FileChooser(this);
        
        add(fc, BorderLayout.CENTER);
        
        pack();
    }
}
