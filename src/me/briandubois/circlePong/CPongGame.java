package me.briandubois.circlePong;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 328838 on 5/13/2015.
 */
public class CPongGame extends JPanel {

    public static final int WIDTH = 1363;
    public static final int LENGTH = 765;

    Ball b = new Ball(WIDTH/2- 200, LENGTH/2, 50);

    public CPongGame(){

        setPreferredSize(new Dimension(WIDTH,LENGTH));
        setBackground(Color.MAGENTA);

    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        b.drawShape(g);

    }

}
