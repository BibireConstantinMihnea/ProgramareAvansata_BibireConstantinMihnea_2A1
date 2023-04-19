/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.Color;

/**
 *
 * @author Mihnea
 */
public class Line {
    int startX;
    int startY;
    int endX;
    int endY;
    Color color = Color.GRAY;

    public Line(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Line{" + "startX=" + startX + ", startY=" + startY + ", endX=" + endX + ", endY=" + endY + ", color=" + color + '}';
    }

    @Override
    public boolean equals(Object obj) {
       if(obj == null || !(obj instanceof Line)){
           return false;
       }
       Line other = (Line) obj;
       return ((startX == (other.startX)) && (startY == (other.startY)) && (endX == (other.endX)) && (endY == (other.endY)));
    }
    
    
}
