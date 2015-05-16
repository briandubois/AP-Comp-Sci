package me.briandubois.circlePong;

import java.awt.*;
import java.util.Random;

/**
 * Created by 328838 on 5/13/2015.
 */
public class Ball {

    public int y,x,radius;

    Random rand = new Random();

    public Color color = Color.GREEN;

    //public int num = (int) (Math.random() * 5);

    public int xMove = 2, yMove = 2;

    public Ball(int x, int y, int rad){

        this.x = x;
        this.y = y;
        radius = rad;
    }

    public Ball(int x, int y, int rad, int move){

        this.x = x;
        this.y = y;
        radius = rad;
        xMove = move;
        yMove = move;
    }

    public Ball(int x, int y, int rad, int xm, int ym){

        this.x = x;
        this.y = y;
        radius = rad;
        xMove = xm;
        yMove = ym;
    }

    public int getLeftSide(){
        return x - radius;
    }

    public int getRgihtSide() {
        return x + radius;
    }

    public int getTop(){
        return y - radius;
    }

    public int getBottom(){
        return y + radius;
    }

    public void drawShape(Graphics graps){

        graps.fillOval(x - radius,y - radius,radius*2,radius*2);

    }

    public void move(){
        if (getTop()+ yMove < 0 || getBottom()+ yMove > CPongGame.HEIGHT) {
            yMove *= -1;
            color = new Color(rand.nextInt(255)+ 1,rand.nextInt(255)+ 1,rand.nextInt(255)+ 1);
        }
        if (getLeftSide() + xMove < 0 || getRgihtSide() + xMove > CPongGame.WIDTH) {
            xMove *= -1;
            color = new Color(rand.nextInt(255)+ 1,rand.nextInt(255)+ 1,rand.nextInt(255)+ 1);
        }
        x += xMove;
        y += yMove;
    }
}
