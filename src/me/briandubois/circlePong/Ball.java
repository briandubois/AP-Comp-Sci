package me.briandubois.circlePong;

import java.awt.*;
import java.util.Random;

/**
 * Created by 328838 on 5/13/2015.
 */
public class Ball {

    public int y,x,radius;

    Random rand = new Random();

    public int xMove = 2, yMove = 2;

    public CHierarchy color;

    public Ball(int x, int y, int rad, int level){

        this.x = x;
        this.y = y;
        radius = rad;
        color = CHierarchy.getHierarchy(level);
    }

    public Ball(int x, int y, int rad, int move, int level){

        this.x = x;
        this.y = y;
        radius = rad;
        xMove = move;
        yMove = move;
        color = CHierarchy.getHierarchy(level);

    }

    public Ball(int x, int y, int rad, int xm, int ym, int level){

        this.x = x;
        this.y = y;
        radius = rad;
        xMove = xm;
        yMove = ym;
        color = CHierarchy.getHierarchy(level);
    }

    public boolean isInside(int x2, int y2){

        double dist = Math.sqrt(Math.pow(this.x - x2, 2) +  Math.pow(this.y - y2, 2));

        return dist <= radius;

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

        }
        if (getLeftSide() + xMove < 0 || getRgihtSide() + xMove > CPongGame.WIDTH) {
            xMove *= -1;

        }
        x += xMove;
        y += yMove;
    }
}
