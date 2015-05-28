//whoops wrong name uhh to late. In Too Deep! FOR MOTHER MADAGASCAR!!!!!!!!!!!!

package me.briandubois.circlePong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
    public boolean start = false;
    public boolean ended = false;
    public long startTime;
    public long curTime;
    public long endTime;



    //variables
    int level = 5; //1-5
    int Regnumber = 300;
    int Tripnumber = 0;

    Random rand = new Random();

    CopyOnWriteArrayList<Ball> balls = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<ChangeBall> tBalls = new CopyOnWriteArrayList<>();

    public CPongGame(){

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.LIGHT_GRAY); //Background Color

        //TODO record Time


        for (int i = 0; i < Regnumber; i++){ //set number of balls here
           balls.add(new Ball(rand.nextInt(WIDTH-500)+200, rand.nextInt(HEIGHT-500)+200, rand.nextInt(30)+41, rand.nextInt(10) - 5, rand.nextInt(10) - 5,level-1)); //Speed form -5 to 5
        }

        for (int i = 0; i < Tripnumber; i++){ //set number of balls here
            tBalls.add(new ChangeBall(rand.nextInt(WIDTH-500)+200, rand.nextInt(HEIGHT-500)+200, rand.nextInt(30)+41, rand.nextInt(10) - 5, rand.nextInt(10) - 5,rand.nextInt(4))); //Speed form -5 to 5
        }

        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g){


        super.paintComponent(g);

        System.out.println(this.isEmpty());

        if(!start) {
            g.drawString("Press \"Enter\" To Start", WIDTH / 2 - 70, HEIGHT / 2);
        }

        if(start) {
            for (Ball ball : balls) {

                g.setColor(ball.color.color);
                ball.drawShape(g);
                ball.move();
            }

            for (ChangeBall bill : tBalls) {

                g.setColor(bill.color.color);
                bill.drawShape(g);
                bill.move();
            }

            g.setColor(Color.BLACK);
            if(!ended)
                g.drawString(this.getTime(), 1, 10);
            else
                g.drawString("You won! Your time is: " + getTimeString(endTime), WIDTH/2 - 70, HEIGHT/2);
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

        if(isEmpty() && !ended){

            endTime = curTime;
            ended = true;

        }

    }

    public boolean isEmpty(){
        return(this.balls.isEmpty() && this.tBalls.isEmpty());
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

    public String getTimeString(long time){

        long difTime = time - this.startTime;

        long minutes = TimeUnit.MILLISECONDS.toMinutes(difTime);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(difTime) - TimeUnit.MINUTES.toSeconds(minutes);
        long milli = difTime - TimeUnit.SECONDS.toMillis(seconds);


        return String.format("%d m : %d s : %d ms", minutes, seconds, milli);
    }
}
