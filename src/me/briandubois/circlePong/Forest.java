package me.briandubois.circlePong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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

        this.mainFrame.setResizable(false);
        mainFrame.pack();
        mainFrame.setVisible(true);



        new Timer(CPongGame.SLEEP, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.repaint();
            }
        }).start();

        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    System.out.print("outta here");
                    if(!panel.start){

                        panel.start = true;
                        panel.startTime = System.currentTimeMillis();
                        new Timer(0, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                panel.curTime = System.currentTimeMillis();

                            }
                        }).start();

                    }

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        this.panel.setFocusable(true);
        this.panel.requestFocusInWindow();
    }

    @Override
    public void run() {

    }
}
