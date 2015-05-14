package me.briandubois.circlePong;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 328838 on 5/13/2015.
 */
public class Forest implements Runnable{

    JFrame mainFrame;
    CPongGame panel;

    public Forest() {

        mainFrame= new JFrame("Play It Up!");
        mainFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));

        panel = new CPongGame();

        mainFrame.add(panel);

        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    @Override
    public void run() {

    }
}
