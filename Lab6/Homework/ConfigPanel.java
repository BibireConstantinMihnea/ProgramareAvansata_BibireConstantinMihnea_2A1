/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Mihnea
 */
public class ConfigPanel extends JPanel {

    final MainFrame frame;
    JLabel dotsLabel, linesLabel;
    JSpinner dotsSpinner;
    JComboBox linesCombo;
    JButton createButton;
    String Prob[] = {"1.0", "0.9", "0.8", "0.7", "0.6", "0.5", "0.4", "0.3", "0.2", "0.1"};

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        dotsLabel = new JLabel("Number of dots:");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));
        linesLabel = new JLabel("Line probability:");
        linesCombo = new JComboBox(Prob);
        createButton = new JButton("Create a new game");
        add(dotsLabel); 
        add(dotsSpinner);
        add(linesLabel);
        add(linesCombo);
        add(createButton);
        createButton.addActionListener(this::createGame);
    }

    private void createGame(ActionEvent e) {
        int numVertices = (int) dotsSpinner.getValue();
        double edgeProbability = Double.valueOf(linesCombo.getSelectedItem().toString());
        frame.canvas.createBoard(numVertices, edgeProbability);
    }
}
