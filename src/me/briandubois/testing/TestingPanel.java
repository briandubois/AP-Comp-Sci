package me.briandubois.testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Brian DuBois on 2/27/2015.
 */
public class TestingPanel extends JPanel implements KeyListener {

    public TestingPanel(){

        this.setPreferredSize(new Dimension(500, 300));
        this.setBackground(Color.YELLOW);
        this.addKeyListener(this);
        this.requestFocus();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
