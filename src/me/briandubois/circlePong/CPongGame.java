package me.briandubois.circlePong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;


/**
 * Created by 328838 on 5/13/2015.
 */
public class CPongGame extends JPanel implements MouseListener {

    public static final int WIDTH = 1350; //1350 Lab , 1905 Home
    public static final int HEIGHT = 691; //691 Lab , 1000 Home
    public static final int SLEEP = 10; //slowness
    public static final DateFormat format = new SimpleDateFormat("mm:ss:SS");
    public long startTime;
    public long curTime;


    //variables
    int level = 5; //1-5
    int Regnumber = 10;
    int Tripnumber = 10;

    Random rand = new Random();

    CopyOnWriteArrayList<Ball> balls = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<ChangeBall> tBalls = new CopyOnWriteArrayList<>();

    //Ball b = new Ball(WIDTH/2- 200, HEIGHT /2, 50);
   // Ball c = new Ball(WIDTH/2- 200, HEIGHT /2, 37, 9);

    public CPongGame(){

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.LIGHT_GRAY); //Background Color

        //TODO record Time
        this.startTime = System.currentTimeMillis();


        for (int i = 0; i < Regnumber; i++){ //set number of balls here
           balls.add(new Ball(rand.nextInt(WIDTH-500)+200, rand.nextInt(HEIGHT-500)+200, rand.nextInt(30)+41, rand.nextInt(10) - 5, rand.nextInt(10) - 5,level-1)); //Speed form -5 to 5
        }

        for (int i = 0; i < Tripnumber; i++){ //set number of balls here
            tBalls.add(new ChangeBall(rand.nextInt(WIDTH-500)+200, rand.nextInt(HEIGHT-500)+200, rand.nextInt(30)+41, rand.nextInt(10) - 5, rand.nextInt(10) - 5,rand.nextInt(4))); //Speed form -5 to 5
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

        g.setColor(Color.BLACK);
        g.drawString(this.getTime(), WIDTH/2, HEIGHT/2);

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

        if(this.balls.isEmpty() && this.tBalls.isEmpty()){

            //TODO end game

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

    public String getTime(){

        long difTime = this.curTime - this.startTime;

        long minutes = TimeUnit.MILLISECONDS.toMinutes(difTime);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(difTime) - TimeUnit.MINUTES.toSeconds(minutes);
        long milli = difTime - TimeUnit.SECONDS.toMillis(seconds);


        return String.format("%d : %d s : %d ", minutes, seconds, milli);

    }
}
