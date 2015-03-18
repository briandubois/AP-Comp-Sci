package me.briandubois.testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestingFrame {

    static JLabel customLabel;
    static int clicks = 0;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
	        @Override
	        public void run() {


		        JFrame mainFrame = new JFrame("Hello Brian");
		        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        TestingPanel panel = new TestingPanel();
		        panel.setLayout(new FlowLayout());
		        customLabel = new JLabel("No Clicks yet...");
		        final JButton button = new JButton("This is a button, couldn't you tell?");

		        button.addActionListener(new ActionListener() {
			        @Override
			        public void actionPerformed(ActionEvent e) {
				        clicks++;
				        customLabel.setText("Woohoo! " + (clicks*1000+111) + " clicks have been done!");
				        button.setSize(new Dimension(button.getWidth() + 10, button.getHeight() + 16));
			        }
		        });

		        panel.add(customLabel);
		        panel.add(button);

		        mainFrame.add(panel);

		        mainFrame.pack();
		        mainFrame.setVisible(true);


	        }
        });

    }

}

