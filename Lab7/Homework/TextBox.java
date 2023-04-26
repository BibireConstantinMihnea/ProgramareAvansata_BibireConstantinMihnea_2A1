/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mihnea
 */
public class TextBox extends JPanel{
    JTextField textField;
    JButton button;
    String input;
    final MainFrame frame;
    Exploration explore;

    public String getInput() {
        return input;
    }
    
     public TextBox(MainFrame frame, Exploration explore) {
        this.frame = frame;
        this.explore = explore;
        init();
    }
     
     private void init(){
         textField = new JTextField(20);
         button = new JButton("Enter");
         add(textField);
         add(button);
         button.addActionListener(this::enterInput);
     }

    private void enterInput(ActionEvent e) {
        try {
            explore.checkCommand(textField.getText());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
