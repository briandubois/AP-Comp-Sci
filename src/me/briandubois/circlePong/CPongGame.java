package me.briandubois.circlePong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * Created by 328838 on 5/13/2015.
 */
public class CPongGame extends JPanel implements MouseListener {

    public static final int WIDTH = 1350; //1350 Lab , 1905 Home
    public static final int HEIGHT = 691; //691 Lab , 1000 Home
    public static final int SLEEP = 5; //slowness

    Random rand = new Random();

    CopyOnWriteArrayList<Ball> balls = new CopyOnWriteArrayList<>();

    //Ball b = new Ball(WIDTH/2- 200, HEIGHT /2, 50);
   // Ball c = new Ball(WIDTH/2- 200, HEIGHT /2, 37, 9);

    public CPongGame(){

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.LIGHT_GRAY); //Background Color
        for (int i = 0; i < 665; i++){ //set number of balls here
           // balls.add(new Ball(rand.nextInt(WIDTH-500)+200, rand.nextInt(HEIGHT-500)+200, rand.nextInt(40)+11, rand.nextInt(10) - 5, rand.nextInt(10) - 5)); //Speed form -5 to 5
        }

        balls.add(new Ball(WIDTH / 2, HEIGHT / 2, 100, 4));

        this.addMouseListener(this);
        this.requestFocus();

    }

    public void paintComponent(Graphics g){


        super.paintComponent(g);

       /* g.setColor(b.color);
        b.drawShape(g);
        b.move();
        g.setColor(c.color);
        c.drawShape(g);
        c.move();*/
        for(Ball ball: balls){
            /*if(ball.num == 20)
                ball.num = 0;
            else
                ball.num ++;
            if(ball.num == 3)
                color = new Color(rand.nextInt(255)+ 1,rand.nextInt(255)+ 1,rand.nextInt(255)+ 1);
            */
            g.setColor(ball.color.color);
            ball.drawShape(g);
            ball.move();
        }

        try {
            Thread.sleep(SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) {



    }

    @Override
    public void mousePressed(MouseEvent e) {

        for(Ball ball : this.balls) {

            if (ball.isInside(e.getX(), e.getY())) {

                CHierarchy newColor = ball.color.getColorLower(ball.color);

                if (newColor != null) {

                    ball.color = newColor;

                } else {

                    this.balls.remove(ball);

                }

            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
