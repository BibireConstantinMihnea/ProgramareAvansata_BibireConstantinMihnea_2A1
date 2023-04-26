/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Mihnea
 */
public class MainFrame extends JFrame{
    TextBox textBox;
    public MainFrame(Exploration explore) {
        super("Command Input");
        init(explore);
    }
    private void init(Exploration explore){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textBox = new TextBox(this, explore);
        add(textBox,BorderLayout.CENTER);
        pack();
    }
}
