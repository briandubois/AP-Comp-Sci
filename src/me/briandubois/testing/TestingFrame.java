package me.briandubois.testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Brian DuBois on 2/27/2015.
 */
public class TestingFrame {

    static JLabel customLabel;
    static int clicks = 0;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {


            JFrame mainFrame = new JFrame("Hello Brian");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            TestingPanel panel = new TestingPanel();
            panel.setLayout(new FlowLayout());
            customLabel = new JLabel("No Clicks yet...");
            JButton button = new JButton("This is a button, couldn't you tell?");

            button.addActionListener(e -> {
                clicks++;
                customLabel.setText("Woohoo! " + clicks + " clicks have been done!");
                button.setSize(new Dimension(button.getWidth() + 10, button.getHeight() + 16));
            });

            panel.add(customLabel);
            panel.add(button);

            mainFrame.add(panel);

            mainFrame.pack();
            mainFrame.setVisible(true);


        });

    }

}
