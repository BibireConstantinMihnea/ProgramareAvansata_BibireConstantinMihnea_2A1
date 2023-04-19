/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Mihnea
 */
public class MainFrame extends JFrame {

    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame() {
        super("My Drawing App");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);
        canvas = new DrawingPanel(this);
        add(configPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        
        pack();
    }

}
