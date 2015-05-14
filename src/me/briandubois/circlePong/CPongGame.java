package me.briandubois.circlePong;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;


/**
 * Created by 328838 on 5/13/2015.
 */
public class CPongGame extends JPanel {

    public static final int WIDTH = 750;
    public static final int HEIGHT = 700;
    public static final int SLEEP = 5;

    Random rand = new Random();

    List<Ball> balls = new ArrayList<Ball>();

    Ball b = new Ball(WIDTH/2- 200, HEIGHT /2, 50);
    Ball c = new Ball(WIDTH/2- 200, HEIGHT /2, 37, 9);

    public CPongGame(){

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.MAGENTA);

    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        b.drawShape(g);
        b.move();

        c.drawShape(g);
        c.move();

        try {
            Thread.sleep(SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();

    }

}
