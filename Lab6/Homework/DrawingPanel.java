/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author Mihnea
 */
public class DrawingPanel extends JPanel {

    final MainFrame frame;
    final static int W = 800, H = 600;
    private int numVertices;
    private double edgeProbability;
    private int[] x, y;
    private List<Line> lines = new ArrayList<>();
    int currentPlayer = 0;
    BufferedImage image; //the offscreen image
    Graphics2D graphics; //the tools needed to draw in the image

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        createOffscreenImage();
        initPanel();
        createBoard(numVertices, edgeProbability);
    }

    private void initPanel() {
        setPreferredSize(new Dimension(W, H));
        setBorder(BorderFactory.createEtchedBorder());
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                lineSelect(x, y);
            }
        });
    }

    private void lineSelect(int x, int y) {
        for (Line line : lines) {
            if (clickToLineCheck(x, y, line.startX, line.startY, line.endX, line.endY) && line.color == Color.GRAY) {
                line.setColor(getCurrentPlayerColor());
                graphics.setColor(getCurrentPlayerColor());
                graphics.drawLine(line.startX, line.startY, line.endX, line.endY);
                repaint();
                if (checkWinCond(this.lines, getCurrentPlayerColor())) {
                    System.out.println("Player " + currentPlayer + " won !");
                } 
                    currentPlayer = (currentPlayer + 1) % 2;
                    System.out.println(currentPlayer);
                
            }
        }
    }

    private boolean checkWinCond(List<Line> lines, Color playerColor) {
        List<Line> currentPlayerLines = new ArrayList<>();
        for (Line line : lines) {
            if (line.color == playerColor) {
                currentPlayerLines.add(line);
            }
        }
        for (Line line : currentPlayerLines) {
            for (Line line2 : currentPlayerLines) {
                if (line != line2 && commonNode(line, line2)) {
                    for (Line line3 : currentPlayerLines) {
                        if (line3 != line && line3 != line2 && commonNode(line3, line2) && commonNode(line3, line)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean commonNode(Line l1, Line l2) {
        return (((l1.startX == l2.startX) && (l1.endY == l2.endY)) || ((l1.startX == l2.endX) && (l1.startY == l2.endY))
                || ((l1.endX == l2.startX) && (l1.endY == l2.startY)) || ((l1.endX == l2.endX) && (l1.startY == l2.startY)));
    }

    private Color getCurrentPlayerColor() {
        if (currentPlayer == 0) {
            return Color.RED;
        } else {
            return Color.BLUE;
        }
    }

    private boolean clickToLineCheck(int x, int y, int x1, int y1, int x2, int y2) {
        double buffer = 2;
        double A = x - x1;
        double B = y - y1;
        double C = x2 - x1;
        double D = y2 - y1;

        double dot = A * C + B * D;
        double len_sq = C * C + D * D;
        double param = -1;
        if (len_sq != 0) //in case of 0 length line
        {
            param = dot / len_sq;
        }

        double xx, yy;

        if (param < 0) {
            xx = x1;
            yy = y1;
        } else if (param > 1) {
            xx = x2;
            yy = y2;
        } else {
            xx = x1 + param * C;
            yy = y1 + param * D;
        }

        double dx = x - xx;
        double dy = y - yy;
        double d = Math.sqrt(dx * dx + dy * dy);
        if (d <= buffer) {
            return true;
        } else {
            return false;
        }
    }

    private void createOffscreenImage() {
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, 800, 600);
    }

    final void createBoard(int numVertices, double edgeProbability) {
        this.numVertices = numVertices;
        this.edgeProbability = edgeProbability;
        lines.clear();
        createOffscreenImage();
        createVertices();
        createLines();
        drawLines();
        drawVertices();
        repaint();
    }

    private void createVertices() {
        int x0 = W / 2;
        int y0 = H / 2; //middle of the board
        int radius = H / 2 - 10; //board radius
        double alpha = 2 * Math.PI / numVertices; // the angle
        x = new int[numVertices];
        y = new int[numVertices];
        for (int i = 0; i < numVertices; i++) {
            x[i] = x0 + (int) (radius * Math.cos(alpha * i));
            y[i] = y0 + (int) (radius * Math.sin(alpha * i));
        }
    }

    private void createLines() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (i == j) {
                    continue;
                }
                double Random = 0 + (double) (Math.random() * 2);
                if (Random <= this.edgeProbability) {
                    lines.add(new Line(x[i], y[i], x[j], y[j]));
                }
            }
        }
    }

    private void drawLines() {
        for (Line line : lines) {
            graphics.setColor(Color.GRAY);
            graphics.drawLine(line.startX, line.startY, line.endX, line.endY);
        }
    }

    private void drawVertices() {
        for (int i = 0; i < numVertices; i++) {
            graphics.setColor(Color.BLACK);
            graphics.fillOval(x[i], y[i], 10, 10);
        }
    }

    @Override
    public void update(Graphics g) {
    } //No need for update

    //Draw the offscreen image, using the original graphics
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(image, 0, 0, this);
    }
}
