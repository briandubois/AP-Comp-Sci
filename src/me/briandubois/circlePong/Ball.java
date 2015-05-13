package me.briandubois.circlePong;

import java.awt.*;

/**
 * Created by 328838 on 5/13/2015.
 */
public class Ball {

    public int y,x,radius;

    public int xMove = 2, Ymove = 2;

    public Ball(int x, int y, int rad){

        this.x = x;
        this.y = y;
        radius = rad;
    }

    public int getLeftSide(){
        return x + radius;
    }

    public int getRgihtSide() {
        return x - radius;
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
}
