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

    public static final int WIDTH = 600; //1350 Lab , 1905 Home
    public static final int HEIGHT = 600; //691 Lab , 1000 Home
    public static final int SLEEP = 10; //slowness

    //variables
    int level = 1; //1-5
    int Regnumber = 0;
    int Tripnumber = 100;

    Random rand = new Random();

    CopyOnWriteArrayList<Ball> balls = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<ChangeBall> tBalls = new CopyOnWriteArrayList<>();

    //Ball b = new Ball(WIDTH/2- 200, HEIGHT /2, 50);
   // Ball c = new Ball(WIDTH/2- 200, HEIGHT /2, 37, 9);

    public CPongGame(){

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.LIGHT_GRAY); //Background Color
        for (int i = 0; i < Regnumber; i++){ //set number of balls here
           balls.add(new Ball(rand.nextInt(WIDTH-500)+200, rand.nextInt(HEIGHT-500)+200, rand.nextInt(30)+21, rand.nextInt(10) - 5, rand.nextInt(10) - 5,level-1)); //Speed form -5 to 5
        }

        for (int i = 0; i < Tripnumber; i++){ //set number of balls here
            tBalls.add(new ChangeBall(rand.nextInt(WIDTH-500)+200, rand.nextInt(HEIGHT-500)+200, rand.nextInt(30)+21, rand.nextInt(10) - 5, rand.nextInt(10) - 5,rand.nextInt(4))); //Speed form -5 to 5
        }


        this.addMouseListener(this);
        this.requestFocus();

    }

    public void paintComponent(Graphics g){


        super.paintComponent(g);

        for(Ball ball: balls){

            g.setColor(ball.color.color);
            ball.drawShape(g);
            ball.move();
        }

        for(ChangeBall bill: tBalls){

            g.setColor(bill.color.color);
            bill.drawShape(g);
            bill.move();
        }


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

        for(ChangeBall bill : tBalls) {

            if (bill.isInside(e.getX(), e.getY())) {

                CHierarchy newColor = bill.color.getColorLower(bill.color);

                bill.level--;

                if (newColor != null) {

                    bill.color = newColor;

                } else {

                    this.tBalls.remove(bill);

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
